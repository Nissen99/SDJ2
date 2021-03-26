package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client
{


  private ObjectOutputStream out;
  private ObjectInputStream in;
  private String id;
  private Socket socket;
  String outPut;

  public Client() throws IOException
  {

    socket = new Socket("localhost", 1235);
    out = new ObjectOutputStream(socket.getOutputStream());
    in = new ObjectInputStream(socket.getInputStream());

  }


  public void start() throws IOException, ClassNotFoundException
  {

    String id = (String) in.readObject();
    outPut = "Hello from " + id;
    new Thread(() -> getMsg()).start();


    while (true){



      out.writeObject(outPut);



    }


  }



  public void getMsg(){
    while (true){
    try
    {
      String read = (String) in.readObject();
      System.out.println(read);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
  }}

}
