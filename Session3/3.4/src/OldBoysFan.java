import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OldBoysFan implements PropertyChangeListener
{


  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    if (evt.getPropertyName().equals("Tackel")){
      return;
    }

     if ((int) evt.getNewValue() != 0){
     System.out.println("DFANS: YEEEEEAH");
   }
   else {
     System.out.println("DFANS: SHIT");
   }
  }
}
