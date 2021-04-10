public class SeaBearGuard implements VisitSeaBear
{

  private SeaBear seaBear = new SeaBear();

  @Override public void view(String personType)
  {
    seaBear.view(personType);
  }

  @Override public void feed(String personType)
  {
    if (personType.toLowerCase().equals("zookeeper")){
      seaBear.feed(personType);
    }else {
      System.out.println("Only ZooKeeper can feed my mans");
    }

  }

  @Override public void pet(String personType)
  {
    if (personType.toLowerCase().equals("kid")){
      seaBear.pet(personType);
    } else {
      System.out.println("Only Kinds can pet my mans");
    }

  }
}
