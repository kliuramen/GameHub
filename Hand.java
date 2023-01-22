public class Hand 
{
    private boolean isLive;
    private int fingers;
    public Hand()
    {
        isLive = true;
        fingers = 1;
    }
    public boolean getLive()
    {
        return isLive;
    }
    public int getFingers()
    {
        return fingers;
    }
}
