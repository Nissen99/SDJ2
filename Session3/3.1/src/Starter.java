public class Starter
{
  public static void main(String[] args) throws InterruptedException
  {

    TrafficLight light = new TrafficLight();

    LightOvserver car1 = new Car(1);
    LightOvserver car2 = new Car(2);
    light.addObserver((Car) car1);
    light.addObserver((Car) car2);
    light.start();





  }

}
