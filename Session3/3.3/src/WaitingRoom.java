import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WaitingRoom implements Runnable, PropertyChangeSubject
{

  private PropertyChangeSupport support = new PropertyChangeSupport(this);



  @Override public void run()
  {

    for (int i = 0; i < 10; i++)
    {
      support.firePropertyChange("Int change", i-1, i);
      System.out.println("DING number i: " + i);

      try
      {
        Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(listener);
    System.out.println("Patient enters waiting room");
  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(listener);

  }


}
