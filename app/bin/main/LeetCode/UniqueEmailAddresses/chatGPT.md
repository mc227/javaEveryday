```java
//can you give me the time complexity for each line of this code
class Solution {
    public int numUniqueEmails(String[] emails){
        List<String> list = Arrays.asList(emails);
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        for(String item: list){
            int plus = item.indexOf("+");
            int at = item.indexOf("@");
            if(plus ==-1){
                list1.add(item.substring(0,at));
            } else {
                list1.add(item.substring(0, plus));
            }
            list2.add(item.substring(at));
        }

        for(String item: list1) {
            list3.add(item.replace(".",""));
        }
        //System.out.println(list3);
        //System.out.println(list2);
        for(int i = 0; i < list3.size(); i++){
            list4.add(list3.get(i)+list2.get(i));
        }
        //System.out.println(list4);
        Set<String> set = new HashSet<>(list4);

        return set.size();
    }
}
```

<p>
Sure, let's go through each line of the code and discuss its time complexity:

public int numUniqueEmails(String[] emails){: The time complexity of this line is constant, O(1).

List<String> list = Arrays.asList(emails);: The time complexity of this line is O(n), where n is the number of elements in the emails array.

List<String> list1 = new ArrayList<>();: The time complexity of this line is constant, O(1).

List<String> list2 = new ArrayList<>();: The time complexity of this line is constant, O(1).

List<String> list3 = new ArrayList<>();: The time complexity of this line is constant, O(1).

List<String> list4 = new ArrayList<>();: The time complexity of this line is constant, O(1).

for(String item: list){: The time complexity of this line is O(n), where n is the number of elements in the list list.

int plus = item.indexOf("+");: The time complexity of this line is O(m), where m is the length of the current string item.

int at = item.indexOf("@");: The time complexity of this line is O(m), where m is the length of the current string item.

if(plus ==-1){: The time complexity of this line is constant, O(1).

list1.add(item.substring(0,at));: The time complexity of this line is O(m), where m is the length of the current string item.

} else {: The time complexity of this line is constant, O(1).

list1.add(item.substring(0, plus));: The time complexity of this line is O(m), where m is the length of the current string item.

list2.add(item.substring(at));: The time complexity of this line is O(m), where m is the length of the current string item.

for(String item: list1) {: The time complexity of this line is O(n), where n is the number of elements in the list1 list.

list3.add(item.replace(".",""));: The time complexity of this line is O(m), where m is the length of the current string item.

for(int i = 0; i < list3.size(); i++){: The time complexity of this line is O(n), where n is the number of elements in the list3 list.

list4.add(list3.get(i)+list2.get(i));: The time complexity of this line is O(m), where m is the length of the current string list3.get(i) and list2.get(i).

Set<String> set = new HashSet<p>(list4);: The time complexity of this line is O(n), where n is the number of elements in the list4 list.

return set.size();: The time complexity of this line is constant, O(1).

So the overall time complexity of this code is O(nm), where n is the number of elements in the emails array and m is the length of the longest email string.
</p>