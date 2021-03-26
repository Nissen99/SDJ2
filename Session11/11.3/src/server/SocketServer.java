package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer
{


  ConnectionPool connectionPool = new ConnectionPool();

  public void start(){

    try(ServerSocket serverSocket = new ServerSocket(1235);
        )
    {

      while (true){

        Socket socket = serverSocket.accept();

        ServerSocketHandler socketHandler = new ServerSocketHandler(socket, connectionPool);

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
