import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DreamTeamFan implements PropertyChangeListener
{



  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if ((int) evt.getNewValue() == 0){
      System.out.println("OFANS: YEEEEEAH");
    }
    else {
      System.out.println("OFANS: SHIT");
    }
  }
}
