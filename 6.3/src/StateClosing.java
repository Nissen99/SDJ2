public class StateClosing implements DoorState
{
  private final String DOORSTATE = "closing";




  private Thread t1;
  private Door door;

  public StateClosing(Door door){

    System.out.println("Door is Closing");

    this.door = door;

    t1 = new Thread( () -> {this.runThread();});
    t1.setDaemon(true);

    t1.start();


  }



  private void runThread(){

    try
    {
      t1.sleep(5000);
      closeDoor(door);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }

  }
  @Override public void openDoor(Door door)
  {

  }

  @Override public void closeDoor(Door door)
  {
    door.setDoorState(new StateClosed());
  }

  @Override public String getDoorState()
  {
    return DOORSTATE;
  }
}
