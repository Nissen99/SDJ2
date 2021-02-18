import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BlindBirdWatcher implements PropertyChangeListener
{



  @Override public void propertyChange(PropertyChangeEvent evt)
  {
  if ((int) evt.getNewValue() == 2){
    System.out.println("That song so good");
  }

  }
}
