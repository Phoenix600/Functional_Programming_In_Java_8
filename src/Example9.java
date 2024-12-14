import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierFunctionalInterface implements Supplier<LocalDateTime>
{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

/// Examples On Supplier Interface
public class Example9 {

    public static void main(String[] args) {

        /// SupplierImplementation Class Example
        Supplier<LocalDateTime> supplier1 = new SupplierFunctionalInterface();
        System.out.println( "Using Class Implementation : " + supplier1.get());

        /// Using Lambda Expressions
        Supplier<LocalDateTime> supplier2 = ()->LocalDateTime.now();
        System.out.println( "Using Lambda Expression : " + supplier2.get());

    }
}
