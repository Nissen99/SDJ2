import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter
{
  private int count;
  private Lock lockA = new ReentrantLock();
  private Lock lockB = new ReentrantLock();


  public Counter(){
    count = 0;
  }

  public void inc() throws InterruptedException
  {

    while (!lockA.tryLock()){
      System.out.println("FAK IT DUDE");
    }
    count++;
    lockA.unlock();

  }

  public int getCount(){
    return count;
  }

}
