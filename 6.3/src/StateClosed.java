public class StateClosed implements DoorState
{

  private final String DOORSTATE = "closed";



  public StateClosed(){
    System.out.println("Door is closed");
  }

  @Override public void openDoor(Door door)
  {
    door.setDoorState(new StateOpening(door));

  }

  @Override public void closeDoor(Door door)
  {

  }

  @Override public String getDoorState()
  {
    return DOORSTATE;
  }
}
