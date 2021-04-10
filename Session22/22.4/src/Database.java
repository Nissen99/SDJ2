import java.util.ArrayList;

public class Database
{

  private static Database database;

  private ArrayList<Car> cars = new ArrayList<>();
  private ArrayList<Customer> customers = new ArrayList<>();


  private Database(){}

  public static Database getInstance(){

    if (database == null){
      synchronized (Database.class){
    if (database == null){
      database = new Database();
    }}}

    return database;
  }

  public void insertCar(String plate){
    cars.add(new Car(plate));
  }

  public void insertCustomer(int SSN){
    customers.add(new Customer(SSN));
  }


  public  Car getCarByPlate(String plate){

    for (Car car : cars)
    {
      if (car.getPlate().equals(plate))
      {
        return car;
      }
    }
    return null;
  }

  public Customer getDudeBy(int SSN){
    for (Customer customer: customers)
    {
      if (customer.getSSN() == SSN ){
  return customer;
    }
    }
    return null;
  }

}
