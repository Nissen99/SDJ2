import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest
{

  private Project project;

  @BeforeEach
  public void setUp(){
    project = new Project("testProject");

  }
  @Test
  public void constrctorShouldSetVariableName(){

    assertEquals("testProject", project.getName());
  }

  @Test
  public void constroctorShouldMakeAGlossary(){

    assertEquals(true, project.getGlossary() != null);
  }

  @Test
  public void addToGlossaryShouldAddToGlossary(){
    addToGlossary();
    assertEquals(true, project.getDefinition("Hello").equals("Greeting"));
  }

  @Test
  public void addThrowIfInGlossary(){
    addToGlossary();

    assertThrows(IllegalStateException.class, () -> addToGlossary());
  }

  @Test
  public void getDefinitionShouldReturnNullIfNoDefintionFound(){
    addToGlossary();

    assertEquals(null, project.getDefinition("Yikes"));
  }

  @Test
  public void removeFromGlossaryShouldRemoveItem(){
    addToGlossary();
    project.remove("Hello");
    assertThrows(IllegalArgumentException.class, () -> project.getDefinition("Hello"));
  }

  @Test
  public void removeOnSomethingNotInlist(){
    addToGlossary();
    project.remove("Yikes");
    assertEquals("Greeting", project.getDefinition("Hello"));
  }

  @Test
  public void toStringShouldGiveUsWholeGlossary(){
    addToGlossary();
    assertTrue(project.toString().contains("Hello"));
    assertTrue(project.toString().contains("Greeting"));
  }

  private void addToGlossary()
  {
    project.addGlossaryItem("Hello", "Greeting");
  }

}