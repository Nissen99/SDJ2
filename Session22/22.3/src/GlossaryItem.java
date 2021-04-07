public class GlossaryItem
{
  private String phrase;
  private String definition;



  public GlossaryItem(String phrase, String definition){
    this.phrase = phrase;
    this.definition = definition;
  }

  public void setDefinition(String definition)
  {
    this.definition = definition;
  }

  public String getPhrase()
  {
    return phrase;
  }

  public String getDefinition()
  {
    return definition;
  }

  public String toString(){
    return phrase + " : " + definition;
  }
}