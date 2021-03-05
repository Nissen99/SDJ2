package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{



  public void start() throws IOException
  {
    try(ServerSocket serverSocket = new ServerSocket(1235);
        )
    {

    while (true){

             Socket socket = serverSocket.accept();

             Thread t = new Thread(new ServerSocketHandler(socket));
             t.start();
    }
    }


  }
}