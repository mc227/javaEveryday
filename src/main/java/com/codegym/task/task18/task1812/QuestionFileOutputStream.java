package com.codegym.task.task18.task1812;

import java.io.*;

/*
Extending AmigoOutputStream

*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public AmigoOutputStream stream;


    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.stream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        stream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        stream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        stream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        stream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Do you really want to close the stream? Y/N");
//        5. The close() method should ask the user,
//        "Do you really want to close the stream? Y/N".
//        6. The close() method should close the
//        stream only if it reads the answer "Y" from the console.


        String answer = bufferedReader.readLine();
        if(answer.equals("Y")) {
            stream.close();
        }
    }
}

