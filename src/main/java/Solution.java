//package com.codegym.task.task16.task1628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // 2021.03.24.16.34.26
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    // 2021-03-24T16:44:39.083+08:00
    private static final SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    // 2021-03-24 16:48:05
    private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public static void main(String[] args) throws IOException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        // Read string count
        int count = Integer.parseInt(reader.readLine());

        // Init threads
        ReaderThread consoleReader1 = new ReaderThread();
        ReaderThread consoleReader2 = new ReaderThread();
        ReaderThread consoleReader3 = new ReaderThread();

        consoleReader1.start();
        consoleReader2.start();
        consoleReader3.start();

        while (count > readStringCount.get()) {

        }

        consoleReader1.interrupt();
        System.out.println(timestamp);
        consoleReader2.interrupt();
        System.out.println(timestamp);
        consoleReader3.interrupt();
        System.out.println(timestamp);
        System.out.println("#1:" + consoleReader1);
        System.out.println(timestamp);
        System.out.println("#2:" + consoleReader2);
        System.out.println(timestamp);
        System.out.println("#3:" + consoleReader3);
        System.out.println(timestamp);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<>();

        public void run() {
            //write your code here
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    String line = reader.readLine();
                    if (line !=null) {
                        result.add(line);
                        readStringCount.addAndGet(1);
                    }
                } catch (IOException e) {}
            }
        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}

