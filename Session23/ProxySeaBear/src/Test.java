public class Test
{
  public static void main(String[] args)
  {


    SeaBearGuard seaBearGuard = new SeaBearGuard();

    System.out.println("---------FEED---------");
    seaBearGuard.feed("ZooKeeper");
    seaBearGuard.feed("Kid");
    seaBearGuard.feed("Rando");

    System.out.println("-------PET------");
    seaBearGuard.pet("ZooKeeper");
    seaBearGuard.pet("Kid");
    seaBearGuard.pet("Rando");

    System.out.println("---------VIEW--------");
    seaBearGuard.view("ZooKeeper");
    seaBearGuard.view("Kid");
    seaBearGuard.view("Rando");
  }
}
