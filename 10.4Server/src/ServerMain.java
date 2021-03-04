import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain
{
  public static void main(String[] args) throws IOException
  {

    try (ServerSocket serverSocket = new ServerSocket(1005))
    {
      while (true)
      {
        try (Socket socket = serverSocket.accept();

        )
        {
          PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
          BufferedReader in = new BufferedReader(
              new InputStreamReader(socket.getInputStream()));

          System.out.println("Client Connected from " + socket.getInetAddress()
              .getHostAddress() + " " + socket.getPort());

          out.println("Hello from Server, please type what you want to do");

          String operation = in.readLine();

          String[] oparationSplit = operation.split(" ");
          int calculator = 0;

          if (oparationSplit[1].equals("+")){

            calculator = Integer.parseInt(oparationSplit[0]) + Integer.parseInt(oparationSplit[2]);
          }
          else if (oparationSplit[1].equals("-")){
            calculator = Integer.parseInt(oparationSplit[0]) - Integer.parseInt(oparationSplit[2]);

          }
          else if (oparationSplit[1].equals("x")){
            calculator = Integer.parseInt(oparationSplit[0]) * Integer.parseInt(oparationSplit[2]);

          }

          System.out.println("Your awnser is " + calculator);
          out.println("Your awnser is " + calculator);

        }

      }
    }

  }
}
