import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Bird implements PropertyChangeSubject, Runnable
{


  private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
  private int flap = 1;
  private int sing = 2;
  private int dive = 3;



  public void flap(){
    propertyChangeSupport.firePropertyChange("Flap", 0, flap);
    System.out.println("Bird Flaps Wings");
  }

  public void sing(){
    propertyChangeSupport.firePropertyChange("Sing", 0, sing);
    System.out.println("Bird Sings cool song");
  }

  public void dive(){
    propertyChangeSupport.firePropertyChange("Dive", 0, dive);
    System.out.println("Bird Dives for Mouse");
  }


  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {

  }

  @Override public void run()
  {
    try
    {
      Thread.sleep(1000);
      flap();
      Thread.sleep(1000);
      dive();
      Thread.sleep(1000);
      sing();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }

  }
}
