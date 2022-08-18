package com.codegym.task.task19.task1917;

/*
Your own FileWriter

*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(String file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(String file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor file) throws IOException {
        fileWriter = new FileWriter(file);
    }
    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        String result = Arrays.toString(cbuf).replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .replace(" ", "")
                .trim();
        System.out.println(result.substring(off,off+len));
        fileWriter.flush();
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
        fileWriter.flush();
    }

    public void write(String c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
        fileWriter.flush();
    }
    //
    public void write(String  s,  int  off,  int  len) throws IOException {
        fileWriter.write(s, off, len);
        System.out.println(s.substring(off, off+len));
        fileWriter.flush();
    }
    // write(char[] cbuf)
    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        String result = Arrays.toString(cbuf).replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .replace(" ", "")
                .trim();
        System.out.println(result);
        fileWriter.flush();
    }

    public void close() throws IOException {
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        FileConsoleWriter fileConsoleWriter = new FileConsoleWriter("mark.txt");
        String str = "hello world";
        fileConsoleWriter.write(str.toCharArray(),0,2);
    }

}
