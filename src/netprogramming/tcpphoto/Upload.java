package netprogramming.tcpphoto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * Runnable实现类
 *
 * @author: lrk
 * 2019/4/6 14:42
 */
public class Upload implements Runnable{
    private Socket socket;
    public Upload(Socket socket){
        this.socket = socket;

    }
    @Override
    public void run() {
        try{
        InputStream in = socket.getInputStream();
        File upload = new File("d:\\upload");
        if (!upload.exists()) {
            upload.mkdirs();
        }
        String filename = "photo" + System.currentTimeMillis() + new Random().nextInt(999999) + ".jpg";
        FileOutputStream fos = new FileOutputStream("d:\\upload" + File.separator + filename);
        byte[] data = new byte[1024];
        int len = 0;
        while ((len = in.read(data)) != -1) {
            fos.write(data, 0, len);
        }

        /*获取输出流，输出上传成功
        OutputStream out =socket.getOutputStream();
        out.write("上传成功！".getBytes(),0,len);
        如果使用了len，出现异常
        ArrayIndexOutOfBoundsException: len == -1 off == 0 buffer length == 15
        */
        socket.getOutputStream().write("上传成功".getBytes());
        fos.close();
        socket.close();
        }catch(IOException ex){

        }

    }
}
