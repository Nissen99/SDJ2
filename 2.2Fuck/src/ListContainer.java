import java.util.ArrayList;
import java.util.List;

public class ListContainer
{

  private List<Integer> integers;


  public ListContainer(){
    integers = new ArrayList<>();
  }


  public synchronized void addInt(int i){
    integers.add(i);
  }

  public int howLong(){
    return integers.size();
}



}
