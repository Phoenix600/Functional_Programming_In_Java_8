import java.util.function.BiFunction;
import java.util.function.Function;

class MyDummyCalculator
{
    public static int add(int x1, int x2)
    {
        return  x1+x2;
    }
}


public class Example12 {

    public static int logbase2(int num)
    {
        int ans = 1;
        while (num > 2)
        {
            ans++;
            num  = num/2;
        }

        return ans;
    }

    public static void main(String...args)
    {
        /// Traditional Way of using lambda Expression
        Function<Integer,Double> sqrtFunction1 = (input)->Math.sqrt(input);
        System.out.println(sqrtFunction1.apply(144));

        /// Using Lambda Expression With Method Reference ( To A Static Method )
        Function<Integer, Double> sqrtFunction2 = Math::sqrt;
        System.out.println(sqrtFunction2.apply(196));

        /// Tradition Way Of Suing Lambda Expressions
        Function<Integer,Integer> log1 = (input)->Example12.logbase2(input);
        int result = log1.apply(512);
        System.out.println("LogBase2 To 512 : " + result);

        /// Attaching Static Method To Lambda Expression
        Function<Integer,Integer> log = Example12::logbase2;
        result = log.apply(256);
        System.out.println("LogBase2 To 32 = " + result);

        /// BiFunction Interface represents the operation which takes two inputs in parameter list
        /// and produces result of third type specified in reference variable
        /// Traditional Way of Working With Lambda Expressions
        BiFunction<Integer,Integer,Integer> addNums = (input1,input2)->MyDummyCalculator.add(input1,input2);
        result = addNums.apply(14,15);
        System.out.println("BiFunction Result : " + result);

        /// Attaching the Static Method To Lambda Expression Using Method Reference
        BiFunction<Integer,Integer,Integer> addTwoInt = MyDummyCalculator::add;
        result = addTwoInt.apply(12,13);
        System.out.println("BiFunction Result : " + result);



    }
}
