public class FaxeKordinator implements Runnable
{

  private ListContainer container;

  public FaxeKordinator(ListContainer container){
    this.container = container;
  }

  @Override public void run()
  {
    for (int i = 0; i < 100000; i++)
    {
      container.addInt(i);
    }

    System.out.println(container.howLong());
  }
}
