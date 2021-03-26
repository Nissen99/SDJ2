public class Main
{
  public static void main(String[] args)
  {

    WaitingRoom waitingRoom = new WaitingRoom();

    Thread t1 = new Thread(waitingRoom);

    t1.start();
    for (int i = 0; i < 3; i++)
    {

      Patient patient = new Patient(i+1, waitingRoom);
      waitingRoom.addPropertyChangeListener(patient);
    }

  }
}
