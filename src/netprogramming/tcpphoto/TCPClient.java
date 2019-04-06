package netprogramming.tcpphoto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 上传图片的客户端
 *
 * @author: lrk
 * 2019/4/6 13:13
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        /*先创建绑定服务器端的套接字*/
        Socket socket = new Socket("127.0.0.1",8000);
        OutputStream out = socket.getOutputStream();
        FileInputStream fis = new FileInputStream("c:\\t.jpg");
        /*利用数组缓冲*/
        byte[] data = new byte[1024];
        int len ;
        while((len = fis.read(data)) != -1){
            out.write(data,0,len);
        }

        //给服务器写终止序列
        socket.shutdownOutput();

        //获取字节输入流,读取服务器的上传成功
        InputStream in = socket.getInputStream();

        len = in.read(data);
        System.out.println(new String(data,0,len));

        fis.close();
        socket.close();
    }

}
