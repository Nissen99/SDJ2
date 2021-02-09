public class CounterInc implements Runnable
{

  private Counter counter;

  public CounterInc(Counter counter){
    this.counter = counter;
  }

  @Override public void run()
  {
    for (int i = 0; i < 1000000; i++)
    {
      counter.inc1();
      counter.inc2();
    }
    System.out.println("Count1: " + counter.getCounter1() + "Count2: " + counter.getCounter2());
  }
}
