import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter
{

  private int counter1, counter2;
  private Lock lockA = new ReentrantLock();
  private Lock lockB = new ReentrantLock();



  public Counter(){
    counter1 = 0;
    counter2 = 0;
  }



  public  void inc1(){

    synchronized (lockA)
    {
      counter1++;
    }

  }

  public void inc2(){
    synchronized (lockB){
      counter2++;
    }
  }



  public int getCounter1(){
    synchronized (lockA)
    {
      return counter1;
    }
  }

  public int getCounter2(){
    synchronized (lockB)
    {
      return counter2;
    }
  }



}
