public class CountInc implements Runnable
{


  private Counter counter;


  public CountInc(Counter counter){
    this.counter = counter;
  }



  @Override public void run()
  {

    for (int i = 0; i < 1000000; i++)
    {
      counter.inc();

    }
    System.out.println(counter.getCount());
  }

}
