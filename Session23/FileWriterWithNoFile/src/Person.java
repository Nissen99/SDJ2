public class Person
{
  private String name;
  private String DOB;
  private int ssn;

  public String getName()
  {
    return name;
  }

  public String getDOB()
  {
    return DOB;
  }

  public int getSsn()
  {
    return ssn;
  }

  public Person(String name, String DOB, int ssn)
  {
    this.name = name;
    this.DOB = DOB;
    this.ssn = ssn;
  }
}
