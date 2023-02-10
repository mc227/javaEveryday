package Learning.Sockets;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DataGramReceiver {
    public static void main(String[] args) {
        try {
            int MAX_LEN = 40;
            int localPortNum = 1234;
            DatagramSocket mySocket = new DatagramSocket(localPortNum);
            byte[] buffer = new byte[MAX_LEN];
            DatagramPacket packet = new DatagramPacket(buffer,MAX_LEN);
            mySocket.receive(packet); // blocking call
            String message = new String(buffer);
            System.out.println(message);
            mySocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
