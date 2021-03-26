import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Patient implements PropertyChangeListener
{

  private int ticketNumber;
  private WaitingRoom waitingRoom;


  public Patient(int ticketNumber, WaitingRoom waitingRoom){
this.ticketNumber = ticketNumber;
this.waitingRoom = waitingRoom;
  }


  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    System.out.println("Patient " + ticketNumber + " looks up");
    if (ticketNumber == (int) evt.getNewValue()){
      System.out.println("Patient " + ticketNumber + " goes to the doctor's room");
      waitingRoom.removePropertyChangeListener(this);
    }
    else {
      System.out.println("Patient " + ticketNumber + " goes back to looking at phone");
    }


  }
}
