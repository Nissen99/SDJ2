public class Counter
{

  private long value, max, min;

  public Counter(long min, long max)
  {
    value = 0;
    this.max = max;
    this.min = min;
  }

  public synchronized void increment() throws InterruptedException
  {
    while (value >= max)
    {
      System.out.println("hi");

      wait();
    }
    value++;
    notifyAll();
  }

  public synchronized void decrement() throws InterruptedException
  {

    while (value <= min)
    {
      System.out.println("hey");
      wait();
    }
    value--;
    notifyAll();

  }

  public long getValue()
  {
    return value;
  }

}
