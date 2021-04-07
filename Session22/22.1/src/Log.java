import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Log
{

  private static Log log;
  private  Queue<LogLine> logQueue = new LinkedList<>();
  private  DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
  private static Lock lock = new ReentrantLock();

  private Log(){}

public static Log getInstance(){

    if (log == null)
    {
      synchronized (lock)
      {
        if (log == null)
        {
          log = new Log();
        }
      }
    }
    return log;
}



  public synchronized void add(String log){

    if (log == null || "".equals(log)){
      return;
    }

    logQueue.add(new LogLine(log, dateFormat.format(Calendar.getInstance().getTime())));
    System.out.println(log);
  }


  public synchronized Queue<LogLine> getAll(){
    return logQueue;
}

  @Override
  public synchronized String toString(){
    return logQueue.toString();
  }

}
