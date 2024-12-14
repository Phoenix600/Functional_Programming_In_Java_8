import java.util.concurrent.TimeUnit;
import java.util.function.Function;

class MyCustomRunnable implements Runnable
{

    @Override
    public void run() {
        System.out.println("Run Method Called");
    }
}

public class Example4 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyCustomRunnable());
        thread.start();

        ///  Example using lambda expression
        Runnable runnable = ()->{
            System.out.println("Run method using lambda expression");
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
