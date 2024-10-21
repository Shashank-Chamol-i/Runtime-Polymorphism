class Shapes
{
    void display()
    {
        System.out.println("Display shapes : ");
    }
}
class Rectangle extends Shapes
{
    void display()
    {
        System.out.println("Rectangle Shape : ");
    }
}
class Triangle extends Shapes
{
    void display()
    {
        System.out.println("Triangle shape : ");
    }
}
class Circle extends Shapes
{
    void display()
    {
        System.out.println("Circle Shsape : ");
    }
}
public class Program03 {
    public static void main(String[] args)
    {
        Shapes s;
        s = new Rectangle();
        s.display();
        s = new Triangle();
        s.display();
        s = new Circle();
        s.display();


    }
}
