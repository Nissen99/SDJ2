public class Starter
{
  public static void main(String[] args) throws InterruptedException
  {

    TrafficLight light = new TrafficLight();

    Car car1 = new Car(1, light);
    Car car2 = new Car(2, light);
    light.addPropertyChangeListener(car1);
    light.addPropertyChangeListener(car2);
    light.start();





  }

}
