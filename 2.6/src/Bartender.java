public class Bartender implements Runnable
{

  private Bar bar;
  private String name = "Tender";

  public Bartender(Bar bar){
    this.bar = bar;
  }

  @Override public synchronized void run()
  {

    while (true){
      try
      {
        System.out.println("Hvad med her");
        Thread.sleep(1000);
        bar.placeBeer(new Beer());
        System.out.println("Just added one " + name + "  " + bar.howMany());
        notifyAll();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }


  }

}

}
