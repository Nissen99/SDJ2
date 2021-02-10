public class Program implements Runnable
{

  private String action, program;
  private int count;
  private long RUNTIME = 100000;

public Program(String program, String action, int count){
  this.program = program;
  this.action = action;
  this.count = count;
}

  @Override public void run()
  {
    for (int i = 0; i < count; i++)
    {
      System.out.println(program+" "+ action);
      try
      {
        Thread.sleep(RUNTIME/count);
      }
      catch (InterruptedException e)
      {

      }

    }


  }
}
