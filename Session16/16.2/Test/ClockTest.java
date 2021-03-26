import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest
{


  @Test
  public void testSecondsConstructorWorks(){
    //arrange
    Clock clock = new Clock(3600);
    //no act?
    //assert
    assertEquals(1, clock.getHour());
    assertEquals(0, clock.getMinute());
    assertEquals(0, clock.getSecond());
  }

  @Test
  public void testSecondsConstrutorDoesntWork(){

    assertThrows(IllegalArgumentException.class, () -> new Clock(-1));
  }

  @Test
  public void testSecoundsConstrutorZero(){
    Clock clock = new Clock(0);

    assertEquals(0, clock.getHour());
    assertEquals(0, clock.getMinute());
    assertEquals(0, clock.getSecond());
  }



  @Test
  public void testOtherConstructorWorks(){
    //arrange
    Clock clock = new Clock(1, 2, 3);
    //no act?
    //assert
    assertEquals(1, clock.getHour());
    assertEquals(2, clock.getMinute());
    assertEquals(3, clock.getSecond());
  }

  @Test
  public void testOtherConstrutorDoesntWork(){

    assertThrows(IllegalArgumentException.class, () -> new Clock(-1, -1,-1));
  }

  @Test
  public void testOtherConstrutorZero(){
    Clock clock = new Clock(0, 0, 0);

    assertEquals(0, clock.getHour());
    assertEquals(0, clock.getMinute());
    assertEquals(0, clock.getSecond());
  }


}