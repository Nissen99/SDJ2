import java.util.ArrayList;

public class DBPersonStorage implements PersonStorage
{


  private ArrayList<Person> personArrayList = new ArrayList<>();

  @Override public void addPerson(Person person)
  {
    personArrayList.add(person);
  }

  @Override public Person getPerson(int ssn)
  {
    for (Person person: personArrayList)
    {
      if (person.getSsn() == ssn){
        return person;
      }
    }
    return null;
  }
}
