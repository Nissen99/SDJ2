package Server;

import transferobjects.StringModel;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

  private StringModel stringModel;

  public void start() throws IOException
  {
    stringModel = new StringModel();
    try(
        ServerSocket serverSocket = new ServerSocket(1235)

        )

    {

    while (true){

             Socket socket = serverSocket.accept();

             Thread t = new Thread(new ServerSocketHandler(socket, stringModel));
             t.start();
    }
    }


  }
}
