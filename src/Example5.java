
@FunctionalInterface
interface MyDisplayFunctionInterface
{
    abstract void Display(String msg);

    default void method1()
    {
        System.out.println("Default Method");
        sayHello();
    }

    static void method2()
    {
        System.out.println("Static Method");
    }

    private void sayHello()
    {
        System.out.println("Hello MyDisplayFunctionInterface interface");
    }
}



public class Example5 {

    public static void main(String[] args)
    {

    }
}
