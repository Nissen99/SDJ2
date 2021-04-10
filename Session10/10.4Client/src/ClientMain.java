import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain
{
  public static void main(String[] args) throws IOException
  {

    Socket socket = new Socket("87.55.134.59", 1235);
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    while (true)
    {
      System.out.println(in.readLine());

      Scanner scanner = new Scanner(System.in);

      out.println(scanner.nextLine());

      System.out.println(in.readLine());
    }
  }
}
