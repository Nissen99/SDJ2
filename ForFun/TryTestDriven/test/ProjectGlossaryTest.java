import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProjectGlossaryTest
{

  private ProjectGlossary projectGlossary;

  @BeforeEach
  public void setUp(){
    projectGlossary = new ProjectGlossary();
  }

  @Test
  public void whenWeAddItemsToListTheyGetAddedToTheList(){
    addHello();

    assertEquals("Greeting", projectGlossary.getDefinition("Hello"));
  }


  @Test
  public void sizeGivesUsTheSizeOfListOfItems(){

    assertEquals(0, projectGlossary.size());
  }

  @Test void sizeGivesUsTheSizeOfListWithItems(){

    addHello();
    assertEquals(1, projectGlossary.size());
  }

  @Test
  public void whenWeAddSomethingThatIsInListWeGetExeption(){
    addHello();
    assertThrows(IllegalStateException.class, () -> addHello());
  }

  @Test
  public void getAllGivesUsTheListOfItems(){

    addHello();
    ArrayList<GlossaryItem> projectGlossaryAllItems = projectGlossary.getAll();


    assertEquals(projectGlossary.getDefinition("Hello"), projectGlossaryAllItems.get(0).getDefinition());
  }


  @Test
  public void callGetAllWithEmptyListGivesUsEmptyList(){

    ArrayList<GlossaryItem> glossaryItems = projectGlossary.getAll();

    assertThrows(IndexOutOfBoundsException.class, () -> glossaryItems.get(0));
  }

  @Test
  public void whenWeCallGetDefinitionWeGetDefinitionAssosiatedWithPhrase(){

    addHello();
    projectGlossary.addItem("NotHello", "NotAGreeting");

    assertEquals("NotAGreeting", projectGlossary.getDefinition("NotHello"));
  }

  @Test
  public void whenWeCallGetDefinitionOnEmptyListWeThrowExeption(){

    assertThrows(Exception.class, () -> projectGlossary.getDefinition("Hello"));
  }

  @Test
  public void ifListNotEmptyButNoDefinitionFoundReturnNull(){
    addHello();
    assertEquals(null, projectGlossary.getDefinition("Yikes"));
  }

  @Test
  public void whenWeRemoveItIsNoLongerInList(){
    addHello();
    projectGlossary.remove("Hello");
    assertThrows(Exception.class,() -> projectGlossary.getDefinition("Hello"));
  }

  @Test
  public void whenYouRemoveSomthingNotInListNothingHappens(){
    addHello();
    projectGlossary.remove("Yikes");
    assertEquals("Greeting", projectGlossary.getDefinition("Hello"));
  }


  @Test
  public void toStringContaisAllDeffintions(){
    addHello();
    assertEquals(true, projectGlossary.toString().contains("Greeting"));
  }

  @Test
  public void toStringContainsAllPhrases(){
    addHello();
    assertEquals(true, projectGlossary.toString().contains("Hello"));
  }

  @Test
  public void toStringOnEmptyListGivesNoItemsInListYet(){
    assertEquals("No items in list yet", projectGlossary.toString());
  }

  private void addHello()
  {
    projectGlossary.addItem("Hello", "Greeting");
  }
}