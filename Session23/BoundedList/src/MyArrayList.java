import java.util.ArrayList;

public class MyArrayList implements ListADT
{

  private ArrayList<String> arrayList = new ArrayList<>();
  private int cap;


  public MyArrayList(int cap){
    this.cap = cap;
  }

  @Override public void add(String s)
  {
    if (canAdd()){
      arrayList.add(s);
    }else {
      couldNotAdd();
    }

  }

  private void couldNotAdd()
  {
    throw new IndexOutOfBoundsException("You’re supposed to use the ArrayList from Java");
  }

  private boolean canAdd()
  {
    return arrayList.size() + 1 < cap;
  }

  @Override public void add(int idx, String s)
  {
    if (canAdd()){
      arrayList.add(idx, s);
    }else {
      couldNotAdd();
    }


  }

  @Override public void set(int idx, String s)
  {
    arrayList.set(idx, s);

  }

  @Override public String get(int idx)
  {
    return arrayList.get(idx);
  }

  @Override public String remove(int idx)
  {
    return arrayList.remove(idx);
  }

  @Override public boolean remove(String s)
  {
    return arrayList.remove(s);
  }

  @Override public boolean contains(String s)
  {
    return arrayList.contains(s);
  }

  @Override public boolean isEmpty(String s)
  {
    return arrayList.isEmpty();
  }

  @Override public int size()
  {
    return arrayList.size();
  }
}
