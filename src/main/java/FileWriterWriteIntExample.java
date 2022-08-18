import java.io.FileWriter;
import java.io.IOException;

/**
 * Java write file using FileWriter write method
 *
 * @author pankaj
 *
 */
public class FileWriterWriteIntExample {

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("mark.txt");
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(65);
            fileWriter.write(66);
            fileWriter.write(67);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}