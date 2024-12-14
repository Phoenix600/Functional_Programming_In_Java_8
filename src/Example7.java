import java.util.function.Consumer;
import java.util.function.Function;



public class Example7 {


    public static void main(String[] args) {

        /// public interface Function<T,R>
        /// Represents a function that accepts one argument and produces a result.
        Function<Integer, Integer> function = (data)->data*data;
        int result = function.apply(12);
        System.out.println("12*12 = " + result);

        function = (data)->data*data*data;
        result = function.apply(8);
        System.out.println("8*8*8 = " + result);

        Function<Integer, Boolean> function1 = (data)->{
            if(data%2 == 0){
                return true;
            }
            else
            {
                return false;
            }
        };

        Boolean result1 = function1.apply(133);
        System.out.println("133 isEven : " + result1);



    }
}
