public class PersonAdaptor
{
    private PersonStorage personStorage = new DBPersonStorage();


    public void addPerson(Person person){
      personStorage.addPerson(person);
    }

    public Person getPerson(int ssn){
      return personStorage.getPerson(ssn);
    }
}
