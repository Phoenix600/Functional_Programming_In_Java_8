import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable
{
    abstract void print(String msg);
}

class InstanceMethodReferenceDemo
{
    public void display(String data)
    {
        data = data.toUpperCase();
        System.out.println(data);
    }

    public int add(int x, int y)
    {
        return x+y;
    }
}


/// Using Lambda Expressions With Method Reference (Instance Method)
public class Example13 {
    public static void main(String[] args) {

        InstanceMethodReferenceDemo instance = new InstanceMethodReferenceDemo();

        /// Traditional Way working with Functional Interfaces by attaching the object method as Lambda Expression's implementation
        Printable printable = (data)->instance.display(data);
        printable.print("sample data");

        /// Attaching the direct reference of instance method to functional interface
        Printable printable1 = instance::display;
        printable1.print("java: just another virtual accelerator");

        /// Traditional Way working with Functional Interfaces by attaching the object method as Lambda Expression's implementation
        BiFunction<Integer,Integer,Integer> addTwoNum = (t,u)->{
            System.out.println("Labda Expression Apply() Method");
            return instance.add(t,u);
        };
        int result = addTwoNum.apply(12,14);
        System.out.println("Sum[INT,INT] : " + result);

        /// Attaching the direct reference of instance method to functional interface
        BiFunction<Integer,Integer,Integer> addNums = instance::add;
        result = addNums.apply(17,-5);
        System.out.println("Sum[INT,-INT] : " + result);



    }
}
