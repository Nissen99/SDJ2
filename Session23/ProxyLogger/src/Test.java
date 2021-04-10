public class Test
{
  public static void main(String[] args)
  {

    LoggerImlpProxy loggerImlpProxy = new LoggerImlpProxy("verbose");


    loggerImlpProxy.addToList("Yikes");
    loggerImlpProxy.addToList("Yikes error");
    loggerImlpProxy.addToList("Yikes ERROr");

    System.out.println("------------SWAP------------");
    loggerImlpProxy.setLvl("sparse");

    loggerImlpProxy.addToList("Yikes");
    loggerImlpProxy.addToList("Yikes error");
    loggerImlpProxy.addToList("Yikes ERROr");
  }
}
