import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Example15 {
    public static void main(String[] args) {
        /// 4. Reference To The Constructor
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Watermelon");

        System.out.println(fruits);

        /// Creating the set from list using lambda expression
        Function<List<String>,Set<String>> setFunction = (list)->new HashSet<>(list);

        Set<String> fruitSet = setFunction.apply(fruits);
        System.out.println(fruitSet);


        ///  Attaching the constructor reference to Functional Interface
        Function<List<String>,Set<String>> set = HashSet::new;
        fruitSet = set.apply(fruits);
        System.out.println(fruits);

    }
}
