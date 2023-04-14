# 929. Unique Email Addresses
Easy

Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.
- For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.

If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.
- For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.

If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.
- For example, "m.y+name@email.com" will be forwarded to "my@email.com".

It is possible to use both of these rules at the same time.

Given an array of strings emails where we send one email to each emails[i], return the number of different addresses that actually receive mails.

# Example 1:
```
Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
```

# Example 2:
```
Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
Output: 3
```

# Constraints:

- 1 <= emails.length <= 100
- 1 <= emails[i].length <= 100
- emails[i] consist of lowercase English letters, '+', '.' and '@'.
- Each emails[i] contains exactly one '@' character.
- All local and domain names are non-empty.
- Local names do not start with a '+' character.
- Domain names end with the ".com" suffix.

# Solution
Overview
We need to clean the emails given to us. The most intuitive solution will be to iterate over the emails and clean them one by one.
Here, cleaning the email means removing unnecessary characters, per the rules given to us. Once an email has been cleaned, it can be pushed into a hash set. The size of this hash set will then equal the count of unique emails.


Rules to clean email:

- If there are periods '.' in local name ignore them.
- If there is a plus '+' in local name skip all local name characters till '@'.
- There is only one '@' symbol and the substring after it is our domain name; we will keep the domain name as it is.

# Approach 1: Linear Iteration

Intuition

We can iterate over an email from left to right, and add characters to local name until a '+' occurs, then we can skip all characters until '@' occurs, then we can again start appending the characters till the end of the email string to form the domain name.

Notice that per the rules, we do not need to read any characters between the first '+' and '@'. While checking each character from left to right, after finding the first '+' in the local name we can directly find the domain name by switching to a reverse iteration as there is only one '@' and we will skip all characters in between '+' and '@'.

This reduces the number of characters iterated, but the overall order time complexity remains the same.

For example, consider email = ab.c+abcdefghijklmnopqrstuvwxyz@leetcode.com.
Performing a linear scan from left to right, we will traverse all the characters in the given email.
Using the method proposed above, we can skip the characters from index 5 to index 30, thus saving time. However, keep in mind that because we read the domain name from right to left, we must also reverse the domain name before appending it to the local name. Thus, this improvement will be less effective when the domain name is long compared to the number of characters skipped.

Algorithm

For each email present in the emails array:
Iterate over the characters in the email and append each character to the local name if it is not '.'.
If the character is '+', do not append the character and break out of the loop.
Find the domain name using reverse traversal in the given email and append it to the string formed till now.
After cleaning the email insert it into the hash set.
Return the size of the hash set.

```java
class Solution {
    public int numUniqueEmails(String[] emails) {
        // hash set to store all the unique emails
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            StringBuilder cleanMail = new StringBuilder();

            // iterate over each character in email
            for (int i = 0; i < email.length(); ++i) {
                char currChar = email.charAt(i);

                // stop adding characters to localName
                if (currChar == '+' || currChar == '@') break;

                // add this character if not '.'
                if (currChar != '.') cleanMail.append(currChar);
            }

            // compute domain name (substring from end to '@')
            StringBuilder domainName = new StringBuilder();

            for (int i = email.length() - 1; i >= 0; --i) {
                char currChar = email.charAt(i);
                domainName.append(currChar);
                if (currChar == '@') break;
            }

            domainName = domainName.reverse();
            cleanMail.append(domainName);
            uniqueEmails.add(cleanMail.toString());
        }

        return uniqueEmails.size();
    }
}
```

Complexity Analysis

Let
�
N be the number of the emails and
�
M be the average length of an email.

Time Complexity:
�
(
�
⋅
�
)
O(N⋅M)
In the worst case, we iterate over all the characters of each of the emails given.
If we have N emails and each email has M characters in it. Then complexity is of order (Number of emails) * (Number of characters in average email) = N*M.

Space Complexity:
�
(
�
⋅
�
)
O(N⋅M)
In the worst case, when all emails are unique, we will store every email address given to us in the hash set.


Approach 2: Using String Split Method
Intuition

A more elegant way of cleaning emails is to leverage built-in functions such as split and replace.

The string split() method breaks a given string around matches of the given regular expression.
The string replace() method returns a new string after replacing all occurrences of some substring or character (in this case '.') with a new substring or character (in this case '').
Algorithm

For each email present in the emails array:
Split the string into two parts separated by'@', local name, and domain name.
Split the local name into parts separated by '+'. Since we do not need the part after '+', let the first part be the local name.
Remove all '.' from the local name and append the domain name to it.
After cleaning the email, insert it into the hash set.
Return the size of the hash set.

Implementation
```java
class Solution {
    public int numUniqueEmails(String[] emails) {
        // hash set to store all the unique emails
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            // split into two parts local and domain
            String[] parts = email.split("@");

            // split local by '+'
            String[] local = parts[0].split("\\+");

            // remove all '.', and concatenate '@' and append domain
            uniqueEmails.add(local[0].replace(".", "") + "@" + parts[1]);
        }

        return uniqueEmails.size();
    }
}
```
Let
�
N be the number of the emails and
�
M be the average length of an email.

Time Complexity:
�
(
�
⋅
�
)
O(N⋅M)
The split method must iterate over all of the characters in each email and the replace method must iterate over all of the characters in each local name. As such, they both require linear time and are
�
(
�
)
O(M) operations. Since there are N emails and the average email has M characters in it, the complexity is of order (Number of emails) * (Number of characters in an email) = N*M.

Space Complexity:
�
(
�
⋅
�
)
O(N⋅M)
In the worst case, when all emails are unique, we will store every email address given to us in the hash set.
