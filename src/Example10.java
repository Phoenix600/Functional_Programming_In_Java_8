import java.util.function.Consumer;
import java.util.function.Predicate;

class PredicateInterfaceImpl implements Predicate<String>
{
    @Override
    public boolean test(String data)
    {
        if(data.equalsIgnoreCase("java"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
public class Example10 {
    public static void main(String[] args) {

        Predicate<String> strPredicate = new PredicateInterfaceImpl();
        boolean result = strPredicate.test("JAVA");
        System.out.println("TEST RESULT : " + result);

        result = strPredicate.test("python");
        System.out.println("TEST RESULT : " + result);


        Predicate<String> strPredicate1 = (data)-> data.compareTo("JVM") == 0;
        result = strPredicate1.test("jvm");
        System.out.println("TEST RESULT : " + result);

    }
}
