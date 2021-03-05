package transferobjects;

import java.io.Serializable;

public class Request implements Serializable
{


  private String text;

  public Request(String text){
    this.text = text;
  }

  public String getText()
  {
    return text;
  }
}
