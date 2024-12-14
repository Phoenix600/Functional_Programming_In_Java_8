import java.util.function.Consumer;

class ConsumerInterfaceImpl implements Consumer<String>
{
    @Override
    public void accept(String data)
    {
        System.out.println("ConsumerInterfaceImpl class : " + data);
    }
}

/// Example On Consumer<T> Interface
public class Example8 {
    public static void main(String...args)
    {
        /// Consumer Interface Implementation
        Consumer<String> consumer = new ConsumerInterfaceImpl();
        consumer.accept("No One Cares How Feel It's All About Making Dollar Bills !!! ~JUICE");

        /// public interface Consumer<T>
        /// Represents an operation that accepts a single input argument and returns no result.
        Consumer<String> printLambdaExpression = (data)-> System.out.println(data);
        printLambdaExpression.accept("Pranay Ramteke");

        /// public interface Consumer<String>
        /// Represents an operation that accepts a single string input as an argument and returns no result.
        /// It simply prints the string data on console
        Consumer<String> printfDummy = System.out::println;
        printfDummy.accept("Sample Data Console Via Consumer Interface");
    }
}
