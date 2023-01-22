public class Chopsticks
{
    int[] numList = {0, 1, 2, 3, 4, 5};
    // hand one attacks hand two 
    public void attack(Hand one, Hand two)
    {
        int temp1 = one.getFingers();
        int temp2 = two.getFingers();
       two.setFingers(temp1 + temp2);
    }
    // a player can split their one hand and revive a hand
    public void split(Hand one, Hand two)
    {
        if(one.getFingers() == 2 && two.getLive() == false)
        {
            one.setFingers(1);
            two.setFingers(1);
            two.setLive(true);
        }
    }
    // the sum of a players fingers are made as a single hand
    public void combine(Hand one, Hand two)
    {
        
        if(one.getFingers() + two.getFingers() <= 4)
        {
            one.setFingers(one.getFingers() + two.getFingers());
        }
    }



}