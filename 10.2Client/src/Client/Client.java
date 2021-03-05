package Client;

import transferobjects.Request;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client
{



  public void start() throws IOException{

    try (
        Socket socket = new Socket("localhost", 1235);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        )
    {
      Request request = (Request) in.readObject();
      System.out.println(request.getText());
      String name = new Scanner(System.in).nextLine();
      out.writeObject(new Request(name));
      request = (Request) in.readObject();
      System.out.println(request.getText());

    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }

  }



}
