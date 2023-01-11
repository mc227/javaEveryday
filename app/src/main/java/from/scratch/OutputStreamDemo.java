package from.scratch;

import java.io.*;
//Java program to demonstrate OutputStream
class OutputStreamDemo
{
    public static void main(String args[])throws Exception
    {
        OutputStream os = new FileOutputStream("file.txt");
        byte b[] = {65, 66, 67, 68, 69, 70};

        //illustrating write(byte[] b) method
        os.write(b);

        //illustrating flush() method
        os.flush();

        //illustrating write(int b) method
        for (int i = 71; i <75 ; i++)
        {
            os.write(i);
        }

        os.flush();

        //close the stream
        os.close();
    }
}
