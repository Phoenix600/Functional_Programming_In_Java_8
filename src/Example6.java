import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>
{
    @Override
    public Integer apply(String data)
    {
        return data.length();
    }
}

public class Example6 {

    public static void main(String[] args)
    {
        Function<String,Integer> function = new FunctionImpl();
        int len =  function.apply("Rajesh");
        System.out.println("Len of string : " + len);
    }
}
