public class Starter
{
  public static void main(String[] args)
  {

    Thermometer termo = new Thermometer("t1", 1);

    Thread t1 = new Thread(termo);

    t1.start();



  }
}
