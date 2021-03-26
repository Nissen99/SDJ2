public class Starter
{
  public static void main(String[] args)
  {

    Counter counter = new Counter();

    Runnable whatever = new CountInc(counter);
    Runnable what = new CountInc(counter);

    Thread t1 = new Thread(whatever);
    Thread t2 = new Thread(what);

    t1.start();
    t2.start();

  }
}
