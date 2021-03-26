import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BirdWatcher implements PropertyChangeListener
{

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if ((int) evt.getNewValue() == 1){
      System.out.println("Look it's flapin");
      return;
    }

    if ((int) evt.getNewValue() == 2){
      System.out.println("Bird be singing");
      return;
    }

    if ((int) evt.getNewValue() == 3){
      System.out.println("Oh mate he divin");
    }

  }
}
