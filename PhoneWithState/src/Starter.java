public class Starter
{
  public static void main(String[] args)
  {

  Phone phone = new Phone();

  phone.receiveCall();
  phone.receiveMessage("Yikers");


      phone.goToSilentState();



    phone.receiveCall();
    phone.receiveMessage("Tester");



  }
}
