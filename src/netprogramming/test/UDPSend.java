package netprogramming.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author: lrk
 * 2019/4/6 15:22
 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        Scanner sc = new Scanner(System.in);
        /*每次循环都要封装数据*/
        while (true) {
            String message = sc.nextLine();
            byte[] data = message.getBytes();
            DatagramPacket dp = new DatagramPacket(data, 0, data.length, inet, 6000);
            ds.send(dp);
           // ds.close();
        }
    }

}
