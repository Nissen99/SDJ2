package server;

import transferobjects.Request;
import transferobjects.UpperOrLower;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSocketHandler implements Runnable
{


  private Socket socket;
  private ObjectOutputStream out;
  private ObjectInputStream in;
  private ConnectionPool connectionPool;


  public ServerSocketHandler(Socket socket, ConnectionPool connectionPool) throws IOException
  {
  this.socket = socket;
  this.connectionPool = connectionPool;
  out = new ObjectOutputStream(socket.getOutputStream());
  in = new ObjectInputStream(socket.getInputStream());
    System.out.println("Client connected from " + socket.getInetAddress().getHostAddress());
  }



  @Override public void run()
  {
    try
    {

      sendMessage("Hello mr Client what do you want done?");

      String request = ((Request) in.readObject()).getText();


      UpperOrLower upperOrLower;

      if (request.equals("upper")){
        upperOrLower = UpperOrLower.UPPER;
        sendMessage("What do you want uppered?");
      }
      else if (request.equals("lower")){
        upperOrLower = UpperOrLower.LOWER;
        sendMessage("What do you want lowered?");
      }
      else {
        upperOrLower = UpperOrLower.UPPER;
        sendMessage("Is this rly that hard?, fuck it you choose upper");
      }

      request = (((Request) in.readObject()).getText());

      switch (upperOrLower){


        case UPPER:
          request = request.toUpperCase();
          break;

        case LOWER:
          request = request.toLowerCase();
          break;

      }

      connectionPool.broadcastMessage(request);

    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }




  }









  public void sendMessage(String msg)
  {
    try
    {
      out.writeObject(new Request(msg));
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
