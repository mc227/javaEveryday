import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/*
My Solution to Calculating Salaries CodeGym task 1918

Calculating salaries
The first parameter of the main method is a file name.
Each line of the specified file has the following format:
name value
where [name] is a String and [value] is a double. [name] and [value] are separated by a space.

Find the sum of all the values for each name.
Display all the data, sorted by name in ascending order.
Close the streams.

Example input file:
Peterson 2
Smith 6
Baxter 1.35
Peterson 3.1

Example output:
Baxter 1.35
Peterson 5.1
Smith 6.0


Requirements:
1. The program must NOT read data from the console.
2. The program must read the file's contents (use FileReader).
3. The file input stream (FileReader) must be closed.
4. The program should write to the console each name, sorted in ascending order, and the sum of all its values.
* */
public class CalculatingSalaries {
    public static void main(String[] args) {

        Map<String, Double> treemap = new TreeMap<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));) {
            while (fileReader.ready()) {
                String[] foo = fileReader.readLine().split(" ");
                String name = foo[0];
                Double value = Double.parseDouble(foo[1]);
                if (treemap.containsKey(name)) {
                    treemap.put(name, treemap.get(name) + value);
                } else {
                    treemap.put(name,value);
                }
            }
        } catch (IOException ignore) {
            ignore.printStackTrace();
        }
        for(Map.Entry<String, Double> entry: treemap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
