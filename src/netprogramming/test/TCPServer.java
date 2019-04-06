package netprogramming.test;

import com.mysql.fabric.Server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: lrk
 * 2019/4/6 15:41
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        while (true) {
            byte[] data = new byte[1024];
            int len;
            while ((len = in.read(data)) != -1) {
                System.out.println(new String(data, 0, len));
            }
            socket.close();
            server.close();
        }
    }

}
