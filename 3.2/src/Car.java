import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Car implements PropertyChangeListener
{
  private int id;


  public Car(int id, PropertyChangeSubject subject){
    this.id = id;
    subject.addPropertyChangeListener(this);
  }


  public void lightChanged(PropertyChangeEvent evt){

    if ("GREEN".equals(evt.getNewValue())){
      System.out.println("Car " + id + " Drives");
    }
    else if ("YELLOW".equals(evt.getNewValue()))
    {
      if ("RED".equals(evt.getOldValue()))
      {
        System.out.println("Car " + id + " Turns engine on");
      }
      else
      {
        System.out.println("Car " + id + " Slows down");
      }
    }
      else if ("RED".equals(evt.getNewValue())){
        System.out.println("Car " + id + " stops");
      }
    }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    lightChanged(evt);
  }
}








