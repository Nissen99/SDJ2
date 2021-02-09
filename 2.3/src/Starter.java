public class Starter
{
  public static void main(String[] args)
  {

    Counter counter = new Counter();

    CountInc inc1 = new CountInc(counter);
    CountInc inc2 = new CountInc(counter);

    Thread t1 = new Thread(inc1);
    Thread t2 = new Thread(inc2);

    t1.start();
    t2.start();


  }
}
