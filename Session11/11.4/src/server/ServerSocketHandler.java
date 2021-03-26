package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSocketHandler implements Runnable
{


  private ObjectInputStream in;
  private ObjectOutputStream out;
  private ConnectionPool connectionPool;
  private Socket socket;



  public ServerSocketHandler(Socket socket, ConnectionPool connectionPool,
      String id){
    this.socket = socket;
    this.connectionPool = connectionPool;

    try
    {
      in = new ObjectInputStream(socket.getInputStream());
      out = new ObjectOutputStream(socket.getOutputStream());
      out.writeObject(id);

    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

  @Override public void run()
  {

    while (true)
    {

      connectionPool.broadcastMessage(receiveMessage());

    }
  }



  public void sendMessage(String msg){
    try
    {
      out.writeObject(msg);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  public String receiveMessage(){
    try
    {
      return (String) in.readObject();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
    return null;
  }
}
