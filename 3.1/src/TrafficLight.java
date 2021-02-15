import java.util.ArrayList;
import java.util.List;

public class TrafficLight
{

  private List<Car> cars;
  private String[] ligts = {"GREEN", "YELLOW", "RED", "YELLOW"};
  private int cout = 2;
  private String currentLight;


  public TrafficLight(){
    currentLight = ligts[2];
    cars = new ArrayList<>();
  }

  public void addObserver(Car car){
    cars.add(car);
    car.setLight(currentLight);
  }

public void start() throws InterruptedException
{
  for (int i = 0; i < 10; i++)
  {
    Thread.sleep(2000);
    cout = (cout + 1) % 4;
    currentLight = ligts[cout];
    System.out.println("\nLight is " + currentLight);

    lightChanged();


  }
}

private void lightChanged(){
  for (Car car : cars)
  {
    car.setLight(currentLight);
  }
}


}
