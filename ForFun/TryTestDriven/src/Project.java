public class Project
{
  private String name;
  private ProjectGlossary projectGlossary;

  public Project(String name)
  {

    this.name = name;
    projectGlossary = new ProjectGlossary();
  }

  public String getName()
  {
    return name;
  }

  public ProjectGlossary getGlossary()
  {
    return projectGlossary;
  }

  public void addGlossaryItem(String phrase, String definition)
  {
    projectGlossary.addItem(phrase,definition);
  }

  public Object getDefinition(String phrase)
  {
    return projectGlossary.getDefinition(phrase);
  }

  public void remove(String phrase)
  {
    projectGlossary.remove(phrase);
  }

  public String toString(){
    return name + " This was the name: \n" + projectGlossary.toString();
  }
}
