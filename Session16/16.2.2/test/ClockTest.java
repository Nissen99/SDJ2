import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest
{

  private Clock clock;

@BeforeEach
public void before(){
  //arrange
  clock = new Clock(0);
}
  @Test
  public void testOneSecondTic(){

    //act
    clock.tic();

    //assert
    assertEquals(1, clock.getSecond(), "should get number of timed ticed");

  }


  @Test
  public void testOneMinuteTic()
  {

    //act
    for (int i = 0; i < 60; i++)
    {
      clock.tic();

    }

    //assert
    assertEquals(1, clock.getMinute(), "should get number of timed ticed/60");

  }

  @Test
  public void testOneHourTic()
  {

    //act
    for (int i = 0; i < 3600; i++)
    {
      clock.tic();

    }

    //assert
    assertEquals(1, clock.getHour(), "should get number of timed ticed/3600");

  }


  @Test
  public void tenSecondTic(){
  //act
    for (int i = 0; i < 10; i++)
    {
      clock.tic();
    }

    //assert
    assertEquals(10, clock.getSecond(), "Should have ticed 10 times");
  }


  @Test
  public void tenMinuteTic()
  {

    //act
    for (int i = 0; i < 60*10; i++)
    {
      clock.tic();

    }

    //assert
    assertEquals(10, clock.getMinute(), "should get number of timed ticed 10 min");

  }

  @Test
  public void tenHourTic()
  {

    //act
    for (int i = 0; i < 3600*10; i++)
    {
      clock.tic();

    }

    //assert
    assertEquals(10, clock.getHour(), "should get number of timed ticed 10 hours");

  }

  @Test
  public void hundredSecondTic(){
    //act
    for (int i = 0; i < 10*10; i++)
    {
      clock.tic();
    }

    //assert
    assertEquals(40, clock.getSecond(), "Should have ticed 10 times");
  }


  @Test
  public void hundredMinuteTic()
  {

    //act
    for (int i = 0; i < 60*10*10; i++)
    {
      clock.tic();

    }

    //assert
    assertEquals(40, clock.getMinute(), "should get number of timed ticed 10 min");

  }

  @Test
  public void hundredHourTic()
  {

    //act
    for (int i = 0; i < 3600*10*10; i++)
    {
      clock.tic();

    }

    //assert
    assertEquals(4, clock.getHour(), "should get number of timed ticed 10 hours");

  }






}