public class CounterIncrementer implements Runnable
{

  private Counter counter;
  private int updates;


  public CounterIncrementer(Counter counter, int updates){
    this.counter = counter;
    this.updates = updates;
  }

  @Override public void run()
  {
    for (int i = 0; i < updates; i++)
    {
      try
      {
        counter.increment();
        System.out.println(counter.getValue() + ": " + Thread.currentThread().getName());

      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }

    System.out.println("+ Done: " + counter.getValue());

  }
}
