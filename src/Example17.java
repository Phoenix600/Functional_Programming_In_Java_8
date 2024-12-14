import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

/// TODO: Open This Program in DEBUG MODE
/// Optional Class Example-1
public class Example17 {
    public static void main(String[] args)
    {
        String email = "pranayramteke@gmail.com";

        ///  Ways to create object of Optional Class of(), empty(), ofNullable()
        Optional<Object> optional1 =  Optional.empty();
        System.out.println(optional1);

        ///  if email null, then of() method will throw exception
        ///  Whenever you're sure that object won't be null, then should go for Optional.of() method
        // email = null;
        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);

        /// If the given object is null Optional.ofNullable() method returns the empty optional object
        /// if the given object is not null, then it will return the Optional Object wrapped around the passed object.
        /// ✅ Try to use this more often
        // email = null;
        Optional<String> emailOptional1 = Optional.ofNullable(email);
        System.out.println(emailOptional1);

        /// Returns the value from the optional object
        String actualEmail = emailOptional1.get();
        System.out.println("Email : " + actualEmail);
        System.out.println("Email : " + emailOptional1.get()); // will throw NoSuchElementException() if actual object is not present in optional object.


        /// Correct Approach To call get() method by using isPresent() method
        if(emailOptional1.isPresent())
        {
            actualEmail = emailOptional1.get();
            System.out.println();
        }
        else{
            System.out.println("No value is present");
        }

        ///  orElse() method used for retrieving the default value from optional object
        String user_email = "ext-pranayr@3verse.com";
//        user_email = null;     // Uncomment during testing for watcher
        Optional<String> userEmailOptional = Optional.ofNullable(user_email);
        userEmailOptional.orElse("default@gmail.com");

        Long id = null;
        // id = 12121212L;
        Optional<Long>employeeIdOptional = Optional.ofNullable(id);

        /// Adding Optional Value
        Long idFetched = employeeIdOptional.orElse(10101010L);
        idFetched = employeeIdOptional.orElseGet(()-> new Random(1000000L).nextLong());

        /// Throwing exception if the value is not present in optional object
//        idFetched = employeeIdOptional.orElseThrow(()->new IllegalArgumentException("Id does not exists in DB"));


        String username = "phoenix@600";
        Optional<String> optionalUsername = Optional.ofNullable(username);
        optionalUsername.ifPresent((data)->System.out.println(data.toUpperCase()));

        String data = "  abc  ";
        if(data != null && data.contains("abc"))
        {
            System.out.println(data);
        }

        /// If a value is present, and the value matches the given predicate,
        /// return an Optional describing the value, otherwise return an empty Optional.
        Optional<String> optionalData = Optional.of(data);
        optionalData
                .filter((e) -> e.contains("abc"))
                .ifPresent((e)-> System.out.println(e));

        /// map method in Optional provides a way to transform value in Optional form to another form
        optionalData.map((e)->e.trim())
                .ifPresent((e)-> System.out.println(e));
    }
}
