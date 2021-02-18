import java.beans.PropertyChangeListener;

public interface PropertyChangeSubject
{
   void addPropertyChangeListener(PropertyChangeListener listener);
  void removePropertyChangeListener(String propertyName, PropertyChangeListener listener);
}
