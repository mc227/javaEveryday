package LeetCode.UniqueEmailAddresses;

import java.util.*;

//class Solution {
//    public int numUniqueEmails(String[] emails){
//        List<String> list = Arrays.asList(emails);
//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        List<String> list3 = new ArrayList<>();
//        List<String> list4 = new ArrayList<>();
//        for(String item: list){
//            int plus = item.indexOf("+");
//            int at = item.indexOf("@");
//            if(plus ==-1){
//                list1.add(item.substring(0,at));
//            } else {
//                list1.add(item.substring(0, plus));
//            }
//            list2.add(item.substring(at));
//        }
//
//        for(String item: list1) {
//            list3.add(item.replace(".",""));
//        }
//        //System.out.println(list3);
//        //System.out.println(list2);
//        for(int i = 0; i < list3.size(); i++){
//            list4.add(list3.get(i)+list2.get(i));
//        }
//        //System.out.println(list4);
//        Set<String> set = new HashSet<>(list4);
//
//        return set.size();
//    }
//    public static void main(String[] args) {
//        String[] arr = new String[] { "test.email+alex@leetcode.com",
//                "test.e.mail+bob.cathy@leetcode.com",
//                "testemail+david@lee.tcode.com" };
//        System.out.println(new Solution().numUniqueEmails(arr));
//    }
//}
//

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for(String email : emails) {
            StringBuilder cleanEmail = new StringBuilder();
            for(int i = 0; i < email.length(); ++i) {
                char currChar = email.charAt(i);

                if(currChar == '+' || currChar == '@') break;

                if(currChar != '.') cleanEmail.append(currChar);
            }
            StringBuilder domainName = new StringBuilder();
            for(int i = email.length() - 1; i >=0; --i) {
                char currChar = email.charAt(i);
                domainName.append(currChar);
                if(currChar =='@') break;
            }
            domainName = domainName.reverse();
            cleanEmail.append(domainName);
            uniqueEmails.add(cleanEmail.toString());
        }
        return uniqueEmails.size();
    }
    public static void main(String[] args) {
        String[] arr = new String[] { "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };
        System.out.println(new Solution().numUniqueEmails(arr));
    }
}
