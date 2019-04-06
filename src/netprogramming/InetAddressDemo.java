package netprogramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 网络编程基础练习
 *
 * @author: lrk
 * 2019/4/5 20:06
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress net = InetAddress.getLocalHost();
        System.out.println(net);

        System.out.println("---------------------------------------");
        String host = net.getHostAddress();
        String hostname = net.getHostName();
        System.out.println(host+"---"+hostname);
        System.out.println("_______________________________________");
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println(ip);
    }

}
