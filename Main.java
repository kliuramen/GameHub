public class Main
{
    public static void main(String[] args)
    {
        Hand p1Left = new Hand();
        Hand p1Right = new Hand();
        Hand p2Left = new Hand();
        Hand p2Right = new Hand();
        Player kenny = new Player(p1Left, p1Right);
        Player bobby = new Player(p2Left, p2Right);
    }
}