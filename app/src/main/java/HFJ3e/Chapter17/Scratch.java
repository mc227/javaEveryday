package HFJ3e.Chapter17;

import HFJ3e.Chapter7.C;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Scratch {
    public static void main(String[] args) throws IOException {
        InetSocketAddress serverAddr = new InetSocketAddress("127.0.0.1", 5000);
        SocketChannel socketChannel = SocketChannel.open(serverAddr);

//        Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String message =  bufferedReader.readLine();

        Writer writer = Channels.newWriter(socketChannel, Charset.defaultCharset());

        PrintWriter printWriter = new PrintWriter(writer);

    }
}
