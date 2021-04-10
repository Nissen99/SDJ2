public class LoggerImlpProxy implements Logger
{


  private LoggerImlp loggerImlp = new LoggerImlp();
  private String lvl;


  public LoggerImlpProxy(String lvl){
    setLvl(lvl);
  }


  @Override public void addToList(String logItem)
  {
  if (lvl.equals("sparse")){
    if (logItem.toLowerCase().contains("error")){
      loggerImlp.addToList(logItem);
    }
  }
  else if (lvl.equals("verbose")){
    loggerImlp.addToList(logItem);
  }

  }








  public void setLvl(String lvl)
  {
    this.lvl = lvl;
  }

}
