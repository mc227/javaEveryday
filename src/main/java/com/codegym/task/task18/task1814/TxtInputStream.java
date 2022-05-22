package com.codegym.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
UnsupportedFileName

*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if(fileName.endsWith(".txt")){
            new FileInputStream(fileName);
        } else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws IOException {
//        TxtInputStream txtInputStream = new TxtInputStream("result.txt");
//        TxtInputStream txtInputStream = new TxtInputStream("out.log");
//        System.out.println(txtInputStream.available());
    }
}

