public class CountInc implements Runnable
{

  Counter counter = new Counter();


  public CountInc(Counter counter){
    this.counter = counter;
  }


  @Override public void run()
  {
    for (int i = 0; i < 1000000; i++)
    {
      try
      {
        counter.inc();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }

    System.out.println(counter.getCount());
  }
}
