class Parent
{
    void show()
    {
        System.out.println("Parent show's method :");
    }
}
class Child extends Parent
{
    void show()
    {
        System.out.println("Child show's method : ");
    }
}
public class Program01 {
    public static void main(String[] args)
    {
        Parent pp = new Child();
        pp.show();
    }
}
