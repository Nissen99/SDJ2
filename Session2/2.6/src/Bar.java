import java.util.ArrayList;

public class Bar implements Runnable
{

  private ArrayList<Beer> beers = new ArrayList<>();
  private boolean isOpen = true;



  public void changer() throws InterruptedException
  {
    System.out.println("Sleep for 20");
    Thread.sleep(2000);
    System.out.println("Should open");
    isOpen = true;
  }

  public int howMany(){
    return beers.size();
  }
  public boolean status(){
    return isOpen;
  }
  private void open(){
    isOpen = true;
  }

  private void close(){
    isOpen = false;
  }

  public synchronized void placeBeer(Beer b) throws InterruptedException
  {
    while(beers.size() > 19){
      wait();
    }
    beers.add(b);
    notifyAll();
  }

  public synchronized void takeBeer() throws InterruptedException
  {
    while (beers.size()<1){
      wait();
    }
    beers.remove(beers.size()-1);
  notifyAll();
  }

  @Override public synchronized void run()
  {
    while (true){
      try
      {
        System.out.println("Sleep for 20");
        Thread.sleep(2000);


        isOpen = !isOpen;
        notifyAll();
          if (status()){
            System.out.println("Open");
          }
          else if (!status()){
            System.out.println("Close");
          }
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
}

}
