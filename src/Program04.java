class PAPA
{
    int speedLimit = 90;
}
class Chai extends PAPA
{
    int speedLimit = 150;
}
public class Program04 {
    public static void main(String[] args)
    {
        PAPA p = new Chai();
        System.out.println(p.speedLimit);

    }
}
