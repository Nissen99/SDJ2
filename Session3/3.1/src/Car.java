public class Car implements LightOvserver
{
  private String prevLight;
  private int id;


  public Car(int id){
    this.id = id;
  }


  public void setLight(String currentLight){

    if ("GREEN".equals(currentLight)){
      System.out.println("Car " + id + " Drives");
    }
    else if ("YELLOW".equals(currentLight))
    {
      if ("RED".equals(prevLight))
      {
        System.out.println("Car " + id + " Turns engine on");
      }
      else
      {
        System.out.println("Car " + id + " Slows down");
      }
    }
      else if ("RED".equals(currentLight)){
        System.out.println("Car " + id + " stops");
      }
     prevLight = currentLight;
    }


  }








