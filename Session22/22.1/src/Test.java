public class Test
{
  public static void main(String[] args)
  {


   Thread t1 = new Thread(new Logger());
   Thread t2 = new Thread(new Logger());

   t1.start();
   t2.start();


  }
}
