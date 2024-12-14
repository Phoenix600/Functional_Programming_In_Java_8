import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Example14 {
    public static void main(String[] args) {

        /// Reference to the instance method of an arbitrary object
        /// sometimes, we call a method of argument in the lambda expression
        /// In that case, we can use a method reference to call an instance
        /// method of an arbitrary object of specific type
        Function<String,String> function = (String input)->{return input.toLowerCase();};
        System.out.println(function.apply("JAVA INFINITE CANNON EVENTS"));

        /// Attaching The Method Reference
        Function<String,String> function1 = String::toLowerCase;
        System.out.println(function.apply("THANOS WAS RIGHT"));


        ///  Comparator Functional Interface
        String[] letters = {"A","E","I","O","U","a","i","o","u"};
        Comparator<String> comparator = (String t,String u)->{return t.compareToIgnoreCase(u);};
        Arrays.sort(letters,comparator);
        System.out.println(Arrays.deepToString(letters));

        Comparator<String> comparator_letter = String::compareToIgnoreCase;

        /// Comparator Functional Interface
        Integer[] nums = {78,35,4,2,0,999};
        Comparator<Integer> comparator1 = (Integer t, Integer u)->u.compareTo(t);
        Arrays.sort(nums,comparator1);
        System.out.println(Arrays.deepToString(nums));

        Comparator<Integer> comparator_num = Comparator.reverseOrder();

    }
}
