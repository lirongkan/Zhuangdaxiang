package netprogramming.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author: lrk
 * 2019/4/6 15:22
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        /*创建数据报包套接字并绑定6000端口*/
        DatagramSocket ds =new DatagramSocket(6000);
        /*制作  字节数组的大小为1024  的箱子*/
        byte[] data = new byte[1024];
        while(true) {
            DatagramPacket dp = new DatagramPacket(data, data.length);
            ds.receive(dp);
            /*System.out.println(data);如果直接这样，就会显示数组多余的元素*/
            int length = dp.getLength();
            String ip =dp.getAddress().getHostAddress();
            int port = dp.getPort();
            System.out.println(new String(data, 0, length) +"---"+ip+"---"+port);
            //ds.close();
        }
    }

}
