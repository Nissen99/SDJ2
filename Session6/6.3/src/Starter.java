public class Starter
{
  public static void main(String[] args) throws InterruptedException
  {

    Door door = new Door();

   door.doorOpen();

    System.out.println(door.getState());

    Thread.sleep(10000);

    System.out.println(door.getState());

   door.doorClose();
    System.out.println(door.getState());

    Thread.sleep(10000);

    System.out.println(door.getState());
  }
}
