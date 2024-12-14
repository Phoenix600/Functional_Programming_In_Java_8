import javax.swing.text.html.Option;
import java.util.Optional;

interface BinaryIntegerOperations
{
    public abstract int operate(int a, int b);
}

public class Example1 {
    public static void main(String[] args) {

        BinaryIntegerOperations operation = (a,b)->a+b;
        int result = operation.operate(12,14);
        System.out.println("Add : " + result);

        operation = (a,b)->a-b;
        result = operation.operate(12,13);
        System.out.println("Sub :" + result);

        operation = (a,b)->a%b;
        result = operation.operate(25656,5);
        System.out.println("Mod : " + result);

        operation = (a,b)->a/b;
        result = operation.operate(456,3);
        System.out.println("Div : " + result);

        operation = (a,b)->a*b;
        result = operation.operate(12,15);
        System.out.println("Mul : " + result);

    }
}
