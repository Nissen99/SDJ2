public class Door
{

  private DoorState doorState = new StateClosed();

public void setDoorState(DoorState doorState){
  this.doorState = doorState;
}

public String getState(){
  return doorState.getDoorState();
}



public void doorOpen(){
  doorState.openDoor(this);
}

public void doorClose(){
  doorState.closeDoor(this);
}

}
