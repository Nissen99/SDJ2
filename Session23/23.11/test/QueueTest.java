import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest
{
  private Queue queue;

  @BeforeEach
    public void before(){
    //arrange
     queue = new Queue();


    }


    @Test
    public void testThatQGetsRemove(){

      putInLine();

      //act
      queue.dequeue();

      //assert
      assertEquals("My", queue.first());
    }


    @Test
    public void testThatItTrhowsStuff(){

      putInLine();

      //act
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();

      assertThrows(IndexOutOfBoundsException.class, () -> queue.dequeue());
    }


    @Test
  public void testThatIsEmptyWorks(){
      putInLine();

      //act
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();

      assertEquals(true, queue.isEmpty());
    }

    @Test
  public void ThatContainsIsNotBad(){

      putInLine();

      assertEquals(true, queue.contains("Hello"));

    }
  @Test
  public void ThatContainsIsNotBad2(){

    putInLine();

    assertEquals(false, queue.contains("HelloMyNameIs"));

  }

  private void putInLine()
  {
    queue.enqueue("Hello");
    queue.enqueue("My");
    queue.enqueue("Name");
    queue.enqueue("Is");
  }

}
