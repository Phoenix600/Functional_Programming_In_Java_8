import jdk.jfr.Description;

import java.math.BigDecimal;
import java.math.BigInteger;

@Description(value = "Handles all numerical types")
interface  GenericBinaryOperationInterface<T>
{
    public abstract T operation(T t1, T t2);
}

public class Example3 {
    public static void main(String[] args) {
        GenericBinaryOperationInterface<Double> op = (d1,d2)->{return d1+d2;};
        Double result1 = op.operation(12.0,14.0);
        System.out.println("Double<Type>  SUM : " + result1);

        GenericBinaryOperationInterface<Float> op1 = (f1,f2)->f1+f2;
        Float result2 = op1.operation(12f,15f);
        System.out.println("Float<Type> SUM : " + result2);

        // Also Try For Byte, Short, Long


        // Important classes from POV of Spring Framework
        GenericBinaryOperationInterface<BigDecimal> op2 = (bd1,bd2)->bd1.add(bd2);
        BigDecimal result3 = op2.operation(new BigDecimal("12127349824283424234323232.734837483748348343434343433434"), new BigDecimal("678264287648746343434382342347.3463746374343434"));
        System.out.println("BigDecimal<Type> SUM : " + result3);

        GenericBinaryOperationInterface<BigInteger> op3 = (bi1, bi2)->bi1.add(bi2);
        BigInteger result4 = op3.operation(new BigInteger("32648723462374234234"),new BigInteger("7483462387420348322344"));
        System.out.println("BigInteger<Type> SUM : " + result4);


    }
}
