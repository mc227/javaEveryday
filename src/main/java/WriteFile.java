import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            String[] list = {"oh", "hi", "Mark!"};
            File file = new File("file.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(String s: list) {
                bufferedWriter.write(s + "\n");
            }
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
