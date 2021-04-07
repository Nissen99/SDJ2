public class Logger implements Runnable
{




  @Override public void run()
    {
      Log.getInstance().add("Hello");
      Log.getInstance().add("Hello1");
      Log.getInstance().add("Hello2");
      Log.getInstance().add("Hello3");
      Log.getInstance().add("Hello4");
      Log.getInstance().add("Hello5");
      Log.getInstance().add("Hello6");
      Log.getInstance().add("Hello7");


      System.out.println(Log.getInstance().toString());

      Log.getInstance().add("Nope1");
      Log.getInstance().add("Nope2");
      Log.getInstance().add("Nope3");
      Log.getInstance().add("Mope4");
      Log.getInstance().add("Nope5");
      Log.getInstance().add("Nope6");
      Log.getInstance().add("Nope7");
      Log.getInstance().add("Nope8");

      System.out.println(Log.getInstance().toString());

    }


}
