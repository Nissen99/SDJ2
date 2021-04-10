import java.util.ArrayList;

public class ProjectGlossary
{

  ArrayList<GlossaryItem> glossaryItems = new ArrayList<>();

  public int size()
  {
    return glossaryItems.size();
  }

  public void addItem(String phrase, String definition)
  {

    for (GlossaryItem glossaryItem : glossaryItems)
    {
      if (glossaryItem.getPhrase().equals(phrase)){
        throw new IllegalStateException("Shits in the list My man");
      }
    }
    glossaryItems.add(new GlossaryItem(phrase, definition));
  }

  public String getDefinition(String phrase)
  {
    if (glossaryItems.isEmpty()){
      throw new IllegalArgumentException("List is Empty");
    }
    for (GlossaryItem glossaryItem : glossaryItems)
    {
      if (glossaryItem.getPhrase().equals(phrase)){
        return glossaryItem.getDefinition();
      }
    }
    return null;
  }

  public ArrayList<GlossaryItem> getAll()
  {
    return glossaryItems;
  }

  public void remove(String phrase)
  {
    for (GlossaryItem glossaryItem : glossaryItems)
    {
      if (glossaryItem.getPhrase().equals(phrase)){
        glossaryItems.remove(glossaryItem);
        return;
      }
    }

  }

  public String toString(){
    if (glossaryItems.isEmpty()){
      return "No items in list yet";
    }
    String s = null;
    for (GlossaryItem glossaryItem : glossaryItems)
    {
      s += "Phrase: " + glossaryItem.getPhrase() + " Deff: " + glossaryItem.getDefinition() + "\n";
    }
    return s;
  }
}
