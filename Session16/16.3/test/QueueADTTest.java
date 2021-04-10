import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueADTTest
{

  private QueueADT<String> queueADT;


  @BeforeEach
  public void before(){
    queueADT = new SimpleBoundedArrayQueueA<>(4);
  }


  @Test
  public void testThatEnqueueWorks(){

    queueADT.enqueue("Hello");

    assertEquals("Hello", queueADT.first());
  }


  @Test
  public void enqueueAddsRightWay(){

    addTwoToQ();

    assertEquals("Hello", queueADT.first());
  }

  @Test
  public void enqueueTrowsWhenToManyAdded(){

    addTwoToQ();
    addTwoToQ();

    assertThrows(IllegalStateException.class, () -> addTwoToQ());
  }




  @Test
  public void dequeueTakesRightOrder(){
  addTwoToQ();

  assertEquals("Hello", queueADT.dequeue());
  }

  @Test
  public void dequeueEmptyQueue(){

    assertThrows(IllegalStateException.class, () -> queueADT.dequeue());
  }


  @Test
  public void sizeWhenTwoAdded(){

    addTwoToQ();

    assertEquals(2, queueADT.size());
  }

  @Test
  public void sizeOfEmptyList(){

    assertEquals(0, queueADT.size());
  }


  @Test
  public void isEmptyOnEmpty(){

    assertEquals(true, queueADT.isEmpty());
  }


  @Test
  public void isEmptyOnNotEmpty(){
    addTwoToQ();

    assertEquals(false, queueADT.isEmpty());
  }


  @Test
  public void getIndex(){

    queueADT.enqueue("Hello");
    queueADT.enqueue("MyNameIs");

    assertEquals(1, queueADT.indexOf("MyNameIs"));
  }

  @Test
  public void getIndexOnEmptyQ(){

    assertEquals(-1, queueADT.indexOf("Hello"));
  }


  @Test
  public void containsTrue(){
    queueADT.enqueue("Hello");
    addTwoToQ();

    assertEquals(true, queueADT.contains("Hello"));
  }

  @Test
  public void containsFalse(){

    assertThrows(NullPointerException.class, () -> queueADT.contains("Hello"));
  }

  private void addTwoToQ()
  {
    queueADT.enqueue("Hello");
    queueADT.enqueue("HelloAndGoodBye");
  }

}