import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSocketHandler implements Runnable
{


private Socket socket;

public ServerSocketHandler(Socket socket){
  this.socket = socket;
}


  @Override public void run()
  {
    try
    {
      ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
      ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
      System.out.println("Client connected from " + socket.getInetAddress().getHostAddress());
      out.writeObject(new Message("Hello from server, what is your name"));
      String nameOfClient = ((Message) in.readObject()).getText();
      out.writeObject(new Message("Hello " + nameOfClient));
    }
        catch (ClassNotFoundException | IOException e)
    {
      e.printStackTrace();
    }

  }
}
