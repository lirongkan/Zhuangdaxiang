package netprogramming.test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author: lrk
 * 2019/4/6 15:41
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket =new Socket("127.0.0.1",8888);
        OutputStream out =  socket.getOutputStream();
        Scanner sc =new Scanner(System.in);
        while(true){
        String message = sc.nextLine();
        out.write(message.getBytes());
        }
        //socket.close();
    }

}
