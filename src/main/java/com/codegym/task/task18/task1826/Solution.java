package com.codegym.task.task18.task1826;

/*
Encryption

*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);

        if (args[0].equals("-e")){
            for (int i = 0; i < buffer.length; i++)
                buffer[i]++;
            outputStream.write(buffer);
        }

        if (args[0].equals("-d")){
            for (int i = 0; i < buffer.length; i++)
                buffer[i]--;
            outputStream.write(buffer);
        }

        inputStream.close();
        outputStream.close();

    }

}