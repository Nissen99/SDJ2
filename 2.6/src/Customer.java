import java.util.Random;

public class Customer implements Runnable
{

  private Bar bar;
  private String name = "Taker";


  public Customer(Bar bar){
    this.bar = bar;
  }

  @Override public synchronized void run()
  {

    while(true)
    {
      System.out.println("Kommer vi her?");
      try
      {
        Thread.sleep((long) (Math.random()*10000));
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }

      try
      {
        bar.takeBeer();
        System.out.println(name + " Just took one   " + bar.howMany());
        notifyAll();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }
}
