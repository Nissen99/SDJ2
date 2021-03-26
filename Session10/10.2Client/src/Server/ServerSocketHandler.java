package Server;

import transferobjects.EnumUpperLower;
import transferobjects.Request;
import transferobjects.StringModel;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSocketHandler implements Runnable
{


private Socket socket;
private StringModel stringModel;
  boolean goAgain;

public ServerSocketHandler(Socket socket, StringModel stringModel){
  this.socket = socket;
  this.stringModel = stringModel;
}


  @Override public void run()
  {
    try
    {
      ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
      ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
      System.out.println("Client connected from " + socket.getInetAddress().getHostAddress());


        EnumUpperLower enumUpperLower = EnumUpperLower.UPPPERCASE;

        Request returnRequest;



          out.writeObject(new Request("Do you have a request"));


          Request request = (Request) in.readObject();
          String upperOrLower = request.getRequestType();


          if (upperOrLower.equals("lowerCase"))
          {
            enumUpperLower = EnumUpperLower.LOWERCASE;
          }
          else if (upperOrLower.equals("upperCase"))
          {
            enumUpperLower = EnumUpperLower.UPPPERCASE;
          }



            switch (enumUpperLower){


              case LOWERCASE:
                out.writeObject(new Request("What do you want lower cased"));
                returnRequest = new Request(((Request) in.readObject()).getText());
                out.writeObject(returnRequest);
                break;

              case UPPPERCASE:
                out.writeObject(new Request("What do you want uppered"));
                returnRequest = new Request(((Request) in.readObject()).getText());
                out.writeObject(returnRequest);
                break;

              default:


            }

}
    catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }}
}
