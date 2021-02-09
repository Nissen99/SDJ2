public class CounterDecremnter implements Runnable
{

  private int updates;
  private Counter counter;

  public CounterDecremnter(Counter counter, int updates){
    this.counter = counter;
    this.updates = updates;
  }


  @Override public void run()
  {

    for (int i = 0; i < updates; i++)
    {
      try
      {
        counter.decrement();
        System.out.println(counter.getValue() + ": " + Thread.currentThread().getName());
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }

    System.out.println("- Done: " + counter.getValue());

  }
}
