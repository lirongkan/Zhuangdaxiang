package netprogramming.tcpphoto;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 线程服务器
 *
 * @author: lrk
 * 2019/4/6 14:47
 */
public class TCPThreadServer {
    public static void main(String[] args) throws IOException {
      ServerSocket server = new ServerSocket(8000);
      while(true){
          Socket socket = server.accept();
          /*Runnable r = new Upload(socket);
          Thread thread = new Thread(r);
          thread.start();*/
          new Thread(new Upload(socket)).start();
      }
    }

}
