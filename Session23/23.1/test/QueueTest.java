import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest
{

    private Queue queue = new Queue();

    @BeforeEach
    public void before(){
      queue.enqueue("Hello");
      queue.enqueue("My");
      queue.enqueue("Name");
      queue.enqueue("Is");

    }


    @Test
    public void testThatQGetsRemove(){

      queue.dequeue();

      assertEquals("My", queue.first());
    }


    @Test
    public void testThatQGsRemove(){

      queue.dequeue();

      assertEquals("My", queue.first());
    }

  }
