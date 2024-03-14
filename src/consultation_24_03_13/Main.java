package consultation_24_03_13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class Main {
    public static void main(String[] args) {
        //RUNNABLE
        //hello Function using runnable
        Runnable helloFunction = Main::sayHello;
        helloFunction.run();
        //Lambda-equivalent
        // () - parameters
        // {} - function
        Runnable helloFunctionLambda = () -> {
            System.out.println("Hello with Lambda Function!");
        };
        helloFunctionLambda.run();

        // SUPPLIER
        Supplier<String> helloSupplier = () -> "Supplier Hello!";

        Runnable helloRS = ()-> System.out.println(helloSupplier);

        //CONSUMER
        Consumer<String> printer = System.out::println;
        printer.accept("Morning");

        int[] arr = { 4, 8, -5, 1, 3, -1, 654, -21, 324, -16, 564, 65, -165, 16, 51, -65 };

        long sizeNegatives = Arrays.stream(arr)
                .filter(i-> i<0)
                .count();
        //count returns long, so size must be long
        System.out.println("The number of negatives in arr equals "+sizeNegatives);
        long sizeEvens = Arrays.stream(arr)
                .filter(i-> i%2==0)
                .count();
        System.out.println("The number of evens in arr equals "+sizeEvens);


        //
        List<String> list = List.of("Hello", "How are you","Neat!");
        int letterNumber = list.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(letterNumber);

    }

    public static void sayHello() {
        System.out.println("Hello!");
    }
}
