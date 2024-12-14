import java.util.function.UnaryOperator;

/// Represents an operation on a single operand that produces a result of the same type as its operand. This is a specialization of Function for the case where the operand and result are of the same type.
/// This is a functional interface whose functional method is Function.apply(Object).
class UnaryOperatorInterface implements UnaryOperator<String>
{
    @Override
    public String apply(String s) {
        return s + " Interface";
    }
}

/// UnaryOperatorInterface Examples
public class Example11 {

    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = new UnaryOperatorInterface();
        String result = unaryOperator.apply("Data");
        System.out.println(result);

        UnaryOperator<String> operator = (data)-> data.toUpperCase();
        System.out.println(operator.apply("jvm"));

    }
}
