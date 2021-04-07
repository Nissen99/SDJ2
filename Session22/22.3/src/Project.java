public class Project
{
  private String name;
  private ProjectGlossary glossary = new ProjectGlossary();

  public Project(String name){
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public ProjectGlossary getGlossary()
  {
    return glossary;
  }

  public String getDefinition(String phrase){
    return glossary.getDefinition(phrase);
  }

  public void addGlossaryItem(String phrase, String definition){
    glossary.addItem(phrase, definition);
  }

  public void removeGlossaryItem(String phrase){
    glossary.removeItem(phrase);
  }

  public String toString(){
    return glossary.toString();
  }


}
