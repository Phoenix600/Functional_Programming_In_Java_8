
interface Shape
{
    public abstract void draw();
}

class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}

class Square implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing Square");
    }
}

public class Example0 {
    public static void main(String[] args) {

        Shape s = new Rectangle();
        s.draw();

        s = new Square();
        s.draw();

        s = ()->{System.out.println("Drawing Polygon");};
        s.draw();

        s = ()->{System.out.println("Drawing Triangle");};
        s.draw();


    }
}
