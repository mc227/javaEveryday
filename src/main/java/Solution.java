
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        // Start here
        String pattern = "M d y";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.ENGLISH);



//        if (args[0].equals("-c")) {
//            if (args[2].equals("m")) {
//                allPeople.add(Person.createMale(args[1], formatter.parse(args[3])));
//                System.out.println(allPeople.size()-1);
//            }
//            if (args[2].equals("f")) {
//                allPeople.add(Person.createMale(args[1], formatter.parse(args[3])));
//                System.out.println(allPeople.size()-1);
//            }
//        }
        if(args[0].equals("-c")){
            if(args[2].equals("m")){
//                System.out.println(args[3]);
//                System.out.println(formatter.parse(args[3]));
                allPeople.add(Person.createMale(args[1], formatter.parse(args[3])));
                System.out.println(allPeople.size()-1);
            }
            else if(args[2].equals("f")){
                allPeople.add(Person.createFemale(args[1],formatter.parse(args[3])));
                System.out.println(allPeople.size()-1);
            }
        }
    }
}
