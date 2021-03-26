package transferobjects;

import java.io.Serializable;

public class Request implements Serializable
{


  private String requestType;
  private String text;

  public Request(String text, String requestType){
    this.text = text;
    this.requestType = requestType;
  }

  public Request(String text){
    this.text = text;
  }

  public String getText()
  {
    return text;
  }

  public String getRequestType(){
    return requestType;
  }

}
