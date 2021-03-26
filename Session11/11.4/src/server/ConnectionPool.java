package server;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ConnectionPool
{




  private List<ServerSocketHandler> connections = new ArrayList<>();

  public synchronized void addHandler(ServerSocketHandler handler){
    connections.add(handler);
  }

  public void removeHandler(ServerSocketHandler handler){
    connections.remove(handler);
  }

  public synchronized void broadcastMessage(String msg){


     for (ServerSocketHandler handler : connections){
       handler.sendMessage(msg);
     }


  }

}
