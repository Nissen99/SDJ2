import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class TrafficLight implements PropertyChangeSubject
{

  private String[] ligts = {"GREEN", "YELLOW", "RED", "YELLOW"};
  private int cout = 2;
  private String currentLight;
  private PropertyChangeSupport lightChangeSupport = new PropertyChangeSupport(this);


  public TrafficLight(){
    currentLight = ligts[2];
  }



public void start() throws InterruptedException
{
  String prev = "";
  for (int i = 0; i < 10; i++)
  {
    Thread.sleep(2000);
    cout = (cout + 1) % 4;
    prev = currentLight;
    currentLight = ligts[cout];
    System.out.println("\nLight is " + currentLight);

    lightChangeSupport.firePropertyChange("lghtChanged", prev, currentLight);


  }
}

  public void addPropertyChangeListener(PropertyChangeListener listener)
  {
    lightChangeSupport.addPropertyChangeListener(listener);
  }


  @Override public void removePropertyChangeListener(String propertyName,
      PropertyChangeListener listener)
  {
    lightChangeSupport.removePropertyChangeListener(propertyName, listener);
  }

}
