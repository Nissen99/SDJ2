public class StateOpening implements DoorState
{
  private final String DOORSTATE = "opening";


  private Thread t1;
  private Door door;

  public StateOpening(Door door){

    System.out.println("Door is opening");

    this.door = door;

    t1 = new Thread( () -> {this.runThread();});
    t1.setDaemon(true);

    t1.start();


  }



  private void runThread(){

    try
    {
      t1.sleep(5000);
      openDoor(door);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }

  }

  @Override public void openDoor(Door door)
  {
    door.setDoorState(new StateOpen());
  }

  @Override public void closeDoor(Door door)
  {

  }

  @Override public String getDoorState()
  {
    return DOORSTATE;
  }
}
