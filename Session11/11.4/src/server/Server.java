package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{





  ConnectionPool connectionPool = new ConnectionPool();
  int id = 0;

  public void start(){

    try(ServerSocket serverSocket = new ServerSocket(1235);
    )
    {

      while (true){

        id++;
        Socket socket = serverSocket.accept();

        ServerSocketHandler socketHandler = new ServerSocketHandler(socket, connectionPool, String.valueOf(id));

        connectionPool.addHandler(socketHandler);

        Thread t = new Thread(socketHandler);
        t.start();
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
