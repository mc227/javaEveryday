import java.io.*;

public class ConsoleRead {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while(!(line = bufferedReader.readLine()).equals("exit")) {
                bufferedWriter.write(line + "\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
