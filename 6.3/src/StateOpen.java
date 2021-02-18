public class StateOpen implements DoorState
{
  private final String DOORSTATE = "open";



public StateOpen(){
  System.out.println("Door is open");
}

  @Override public void openDoor(Door door)
  {

  }

  @Override public void closeDoor(Door door)
  {
    door.setDoorState(new StateClosing(door));
  }

  @Override public String getDoorState()
  {
    return DOORSTATE;
  }
}
