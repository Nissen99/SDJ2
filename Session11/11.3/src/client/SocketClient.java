package client;

import transferobjects.Request;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient
{

  private Socket socket;
  private  ObjectOutputStream out;
  private   ObjectInputStream in;

  public SocketClient()
  {
    try
    {
      socket = new Socket("localhost", 1235);


      in = new ObjectInputStream(socket.getInputStream());
      out = new ObjectOutputStream(socket.getOutputStream());

    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }


  public void start(){


    new Thread(() -> getMsg()).start();


    Scanner scanner = new Scanner(System.in);

      sendMessage(scanner.nextLine());


      sendMessage(scanner.nextLine());





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


  public void getMsg(){
    while (true)
    {
      Request request = null;
      try
      {
        request = (Request) in.readObject();
        System.out.println(request.getText());

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
  }


}
