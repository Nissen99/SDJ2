public class BoundedArrayQueueMonitor implements StringQueue
{

  BoundedArrayQueue boundedArrayQueue;

  public BoundedArrayQueueMonitor(int cap){
    boundedArrayQueue = new BoundedArrayQueue(cap);
  }

  @Override public synchronized void enqueue(String element)
  {
    boundedArrayQueue.enqueue(element);
  }

  @Override public synchronized String dequeue()
  {
    return boundedArrayQueue.dequeue();
  }

  @Override public synchronized String first()
  {
    return boundedArrayQueue.first();
  }

  @Override public synchronized int size()
  {
    return boundedArrayQueue.size();
  }

  @Override public synchronized boolean isEmpty()
  {
    return boundedArrayQueue.isEmpty();
  }

  @Override public synchronized int indexOf(String element)
  {
    return boundedArrayQueue.indexOf(element);
  }

  @Override public synchronized boolean contains(String element)
  {
    return boundedArrayQueue.contains(element);
  }
}
