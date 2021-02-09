public class Starter
{
  public static void main(String[] args)
  {

    Counter counter = new Counter();

    CounterInc what = new CounterInc(counter);
    CounterInc what2 = new CounterInc(counter);

    Thread t1 = new Thread(what);
    Thread t2 = new Thread(what2);

    t1.start();
    t2.start();

  }
}
