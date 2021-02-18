public class Starter
{
  public static void main(String[] args)
  {
    Bird mouse = new Bird();

    BirdWatcher birdWatcher = new BirdWatcher();
    BlindBirdWatcher blindBirdWatcher = new BlindBirdWatcher();


    mouse.addPropertyChangeListener(birdWatcher);
    mouse.addPropertyChangeListener(blindBirdWatcher);

    mouse.sing();
    mouse.dive();
    mouse.flap();

//  Thread t1 = new Thread(mouse);
//
//   t1.start();
  }
}
