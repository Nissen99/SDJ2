import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GlossaryItemTest
{

  private GlossaryItem glossaryItem;

  @BeforeEach
  public void setUp(){
    glossaryItem = new GlossaryItem("Hello", "Greeting");

  }
  @Test
  public void constructorShouldTakeTwoStrings(){

    assertEquals("Hello", glossaryItem.getPhrase());
    assertEquals("Greeting", glossaryItem.getDefinition());
  }


  @Test
  public void getPhraseShouldReturnPhraseVariable(){

    assertEquals("Hello", glossaryItem.getPhrase());
  }

  @Test
  public void getDefinitionShouldReturnDefinition(){
    assertEquals("Greeting", glossaryItem.getDefinition());
  }

  @Test
  public void setDefinitionShouldChangeExsitingDefinitionVariable(){

    glossaryItem.setDefinition("NotGreeting");
    assertEquals("NotGreeting", glossaryItem.getDefinition());
  }

  @Test
  public void toStringShouldGiveUsBothPhraseAndDefinition(){

    assertTrue(glossaryItem.toString().contains("Hello"));
    assertTrue(glossaryItem.toString().contains("Greeting"));
  }

}