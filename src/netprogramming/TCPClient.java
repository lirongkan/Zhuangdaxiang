package netprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author: lrk
 * 2019/4/6 10:33
 */

public class TCPClient {
    public static void main(String[] args)throws IOException {
            //创建Socket对象,连接服务器
            Socket socket = new Socket("127.0.0.1", 8888);
            //通过客户端的套接字对象Socket方法,获取字节输出流,将数据写向服务器
            OutputStream out = socket.getOutputStream();
            out.write("服务器OK".getBytes());

            //读取服务器发回的数据,使用socket套接字对象中的字节输入流
            InputStream in = socket.getInputStream();
            byte[] data = new byte[1024];
            int len = in.read(data);
            System.out.println(new String(data,0,len));

            socket.close();
        }
    }
        //读取服务器发回的数据,使用socket套接字对象中的字节输入流
        /*InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        System.out.println(new String(data,0,len));

        socket.close();*/

