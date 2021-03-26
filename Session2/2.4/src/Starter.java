public class Starter
{
  public static void main(String[] args) throws InterruptedException
  {

    Counter counter = new Counter(0, 100);

    CounterDecremnter dec = new CounterDecremnter(counter, 2000);
    CounterDecremnter dec2 = new CounterDecremnter(counter, 2000);

    CounterIncrementer inc = new CounterIncrementer(counter,2000);
    CounterIncrementer inc2 = new CounterIncrementer(counter,2000);

    Thread t1 = new Thread(dec);
    Thread t2 = new Thread(dec2);

    Thread t3 = new Thread(inc);
    Thread t4 = new Thread(inc2);



    t1.start();
    t2.start();
    t3.start();
    t4.start();

    t1.join();
    t2.join();
    t3.join();
    t4.join();
    System.out.println("Done ");


  }
}
