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


      queue.enqueue("Hello");
      queue.enqueue("My");
      queue.enqueue("Name");
      queue.enqueue("Is");

      //act
      queue.dequeue();

      //assert
      assertEquals("My", queue.first());
    }


    @Test
    public void testThatItTrhowsStuff(){

      queue.enqueue("Hello");
      queue.enqueue("My");
      queue.enqueue("Name");
      queue.enqueue("Is");

      //act
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();

      assertThrows(IndexOutOfBoundsException.class, () -> queue.dequeue());
    }


    @Test
  public void testThatIsEmptyWorks(){
      queue.enqueue("Hello");
      queue.enqueue("My");
      queue.enqueue("Name");
      queue.enqueue("Is");

      //act
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();

      assertEquals(true, queue.isEmpty());
    }

    @Test
  public void ThatContaisIsNotBad(){

      queue.enqueue("Hello");
      queue.enqueue("My");
      queue.enqueue("Name");
      queue.enqueue("Is");





      assertEquals(true, queue.contains("Hello"));

    }
  @Test
  public void ThatContaisIsNotBad2(){

    queue.enqueue("Hello");
    queue.enqueue("My");
    queue.enqueue("Name");
    queue.enqueue("Is");





    assertEquals(false, queue.contains("HelloMyNameIs"));

  }





  }
