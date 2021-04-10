public class SeaBear implements VisitSeaBear
{

  @Override public void view(String personType)
  {
    System.out.println("SeaBear is being viewed by " + personType);
  }

  @Override public void feed(String personType)
  {
    System.out.println("SeaBear is being fed by " + personType);
  }

  @Override public void pet(String personType)
  {
    System.out.println("SeaBear is being pet by " + personType);
  }
}
