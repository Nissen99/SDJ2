public class Starter
{
  public static void main(String[] args)
  {

    ListContainer list = new ListContainer();

    FaxeKordinator faxe1 = new FaxeKordinator(list);
    FaxeKordinator faxe2 = new FaxeKordinator(list);

    Thread t1 = new Thread(faxe1);
    Thread t2 = new Thread(faxe2);

    t1.start();
    t2.start();

  }
}
