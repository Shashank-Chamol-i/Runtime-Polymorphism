class GrandFather
{
    void display()
    {
        System.out.println("Born in year  1932 : ");
    }
}
class Father extends GrandFather
{
    void display()
    {
        System.out.println("Born in year  1971 : ");
    }
}
class I extends Father
{
    void display()
    {
        System.out.println("Born in year 2003 : ");
    }
}
class SmallI extends I
{
    void display()
    {
        System.out.println("On the Way : ");
    }
}
class Program05 extends SmallI {
    public static void main(String[] args)
    {
        GrandFather g,g1,g2,g3,g4;
        g3 = new GrandFather();
        g = new Father();
        g1 = new I();
        g2 = new SmallI();
        g4 = new Program05();
        g3.display();
        g.display();
        g1.display();
        g2.display();
        g4.display();
    }
}
/*
* Since Program05 does not override the display method so it invoke the
* method of SmallI */

