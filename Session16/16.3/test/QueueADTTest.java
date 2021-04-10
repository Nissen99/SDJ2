import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueADTTest
{

  private QueueADT<String> queueADT;


  @BeforeEach
  public void before(){
    queueADT = new SimpleBoundedArrayQueueCorrect(4);
  }


  @Test
  public void testThatEnqueueWorks(){

    queueADT.enqueue("Hello");

    assertEquals("Hello", queueADT.first());
  }



}