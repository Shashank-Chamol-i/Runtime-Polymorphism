class Bank
{
    double roi()
    {
        return 0;
    }
}
class ICIC extends Bank
{
    double roi()
    {
        return 5.6;
    }
}
class HDFC extends Bank
{
    double roi()
    {
        return 6.3;
    }
}
class SBI extends Bank
{
    double roi()
    {
        return 6.9;
    }
}
public class Program02 {
    public static void main(String[] args)
    {
        Bank b;
        b = new ICIC();
        System.out.println("ICIC : "+ b.roi());
        b = new HDFC();
        System.out.println("HDFC : "+b.roi());
       b = new SBI();
        System.out.println("SBI : "+b.roi());
    }
}
