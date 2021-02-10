public class Starter
{
  public static void main(String[] args)
  {

    Bar bar = new Bar();

    Runnable custa1 = new Customer(bar);
    Runnable custa2 = new Customer(bar);
    Runnable custa3 = new Customer(bar);
    Runnable custa4 = new Customer(bar);
    Runnable custa5 = new Customer(bar);
    Runnable custa6 = new Customer(bar);
    Runnable custa7 = new Customer(bar);
    Runnable custa8 = new Customer(bar);
    Runnable custa9 = new Customer(bar);
    Runnable custa10 = new Customer(bar);

    Runnable tender = new Bartender(bar);
    Runnable tender2 = new Bartender(bar);


    Thread t1 = new Thread(custa1);
    Thread t2 = new Thread(custa2);
    Thread t3 = new Thread(custa3);
    Thread t4 = new Thread(custa4);
    Thread t5 = new Thread(custa5);
    Thread t6 = new Thread(custa6);
    Thread t7 = new Thread(custa7);
    Thread t8 = new Thread(custa9);
    Thread t9 = new Thread(custa8);
    Thread t10 = new Thread(custa10);
    Thread t11 = new Thread(tender);
    Thread t12 = new Thread(tender2);
    Thread t13 = new Thread(bar);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
    t8.start();
    t9.start();
    t10.start();
    t11.start();
    t12.start();
    t13.start();


  }
}
