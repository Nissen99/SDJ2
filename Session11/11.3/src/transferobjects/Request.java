package transferobjects;

import java.io.Serializable;

public class Request implements Serializable
{


  private String msg;
  private Enum upperOrLower;

  public Request(String msg)
  {
    this.msg = msg;
  }

  public Request(String msg, Enum upperOrLower){
    this.msg = msg;
    this.upperOrLower = upperOrLower;
  }





  public String getText(){
    return msg;
  }



}
