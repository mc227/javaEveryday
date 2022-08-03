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

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            fileScanner = scanner;
        }

        @Override
        public Person read() {
            String str = fileScanner.nextLine();
            String[] split = str.split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]),
                    Integer.parseInt(split[3]) - 1, Integer.parseInt(split[4]));
            Date date = calendar.getTime();
            return new Person(split[2], split[0], split[1], date);

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
