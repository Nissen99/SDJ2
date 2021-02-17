import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Referee implements PropertyChangeListener
{
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if (evt.getPropertyName().equals("SCOOOOOOOOOREEE")){
      return;
    }
    else if ((int) evt.getNewValue() == 0){
      System.out.println("Dream YELLOW FOR THE YIKERS TACKEL");
    }else {
      System.out.println("Old YELLOW FOR THE YIKERS TACKEL");
    }
  }
}
