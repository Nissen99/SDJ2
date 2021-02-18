public class Stater
{
  public static void main(String[] args)
  {


    DreamTeamFan dreamTeamFan = new DreamTeamFan();
    OldBoysFan oldBoysFan = new OldBoysFan();
    Referee referee = new Referee();


    SoccerMatch soccerMatch = new SoccerMatch();

    soccerMatch.addPropertyChangeListener(dreamTeamFan);
    soccerMatch.addPropertyChangeListener(oldBoysFan);
    soccerMatch.addPropertyChangeListener(referee);



    soccerMatch.startMatch();
  }
}
