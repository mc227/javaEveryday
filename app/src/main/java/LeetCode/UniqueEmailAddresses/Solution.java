package LeetCode.UniqueEmailAddresses;

import java.util.*;

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


