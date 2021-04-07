import java.util.ArrayList;

public class ProjectGlossary
{
  private ArrayList<GlossaryItem> glossaryItems = new ArrayList<>();


  public ProjectGlossary(){}

  public int size(){
    return glossaryItems.size();
  }

  public ArrayList<GlossaryItem> getGlossaryItems()
  {
    return glossaryItems;
  }

  public String getDefinition(String phrase){

    for (GlossaryItem glossary: glossaryItems)
    {
      if (glossary.getPhrase().equals(phrase)){
        return glossary.getDefinition();
      }
          }
  return null;
  }

  public void addItem(String phrase, String definition){

      if (getDefinition(phrase) == null)
      {
        glossaryItems.add(new GlossaryItem(phrase, definition));
      }
      else {
        throw new IllegalStateException("This shit is in here");
      }
  }

  public void removeItem(String phrase){
    for (GlossaryItem glossary: glossaryItems)
    {
      if (glossary.getPhrase().equals(phrase)){
        glossaryItems.remove(glossary);
        return;
      }
    }
  }

  public String toString(){
    String returnString = "";
    for (GlossaryItem g :glossaryItems)
    {
      returnString += g.toString() + "\n";
    }
    return returnString;
  }

  public ArrayList<GlossaryItem> getAll()
  {
    return glossaryItems;
  }
}
