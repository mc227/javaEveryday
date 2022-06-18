import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            String[] list = {"Oh", "Hi", "Mark"};
            File file = new File("file.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(String l: list) {
                bufferedWriter.write(l + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
