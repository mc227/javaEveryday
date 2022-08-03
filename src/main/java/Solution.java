/*
Yet another adapter
Adapt Scanner to the PersonScanner interface.
The adapter class is PersonScannerAdapter.
Create a private final Scanner field called fileScanner in the adapter class.
Initialize the field in a constructor with one Scanner parameter.

The file stores data in the following format:
John Michael Peterson 12 31 1950
Larry Thomas Gates 12 31 1957
The file contains information about a lot of people. Each line has data for a single person. The read() method must read only one person's information.


Requirements:
1. PersonScanner must be an interface.
2. The PersonScannerAdapter class must implement the PersonScanner interface.
3. The PersonScannerAdapter class must have a private Scanner field called fileScanner.
4. The PersonScannerAdapter class must have a constructor with a Scanner parameter.
5. The PersonScannerAdapter class's close() method must delegate the call to fileScanner.
6. The PersonScannerAdapter class's read() method should read a line from the file, parse it, and return only one person's data as an Person object.
* */

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) throws IOException {
        try {
            //the file to be opened for reading
            FileInputStream fis=new FileInputStream("ted.txt");
            Scanner sc=new Scanner(fis);    //file to be scanned
            //returns true if there is another line to read
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());      //returns the line that was skipped
            }
            sc.close();     //closes the scanner
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    // The PersonScannerAdapter class must implement the PersonScanner interface.
    public static class PersonScannerAdapter implements PersonScanner{
        // The PersonScannerAdapter class must have a private Scanner field called fileScanner.
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            // The PersonScannerAdapter class's read()
            // method should read a line from the file, parse it, and return only one person's data as an Person object.
            if (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                List<String> splitword1 = Arrays.asList(line.split(" "));
                Person person = null;
                try {
                    person = new Person(splitword1.get(2), splitword1.get(0),splitword1.get(1),
                            new SimpleDateFormat("MM ddyyyy").parse(splitword1.get(3)+" "+splitword1.get(4)+" "+splitword1.get(5)));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return person;
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            // The PersonScannerAdapter class's close() method must delegate the call to fileScanner.
            fileScanner.close();

        }
    }
}
