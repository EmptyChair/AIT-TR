package u_24_03_13_Stream_1.consultation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {

        //RUNNABLE
        //hello Function using runnable - method say hello down
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
        Supplier<String> helloSupplier = ()-> "Supplier Hello!";
        Runnable helloRS = ()-> System.out.println(helloSupplier.get());
        helloRS.run();



        //CONSUMER
        Consumer<String> printer = System.out::println;
        printer.accept("Consumer Hello with a Supplier!");
        printer.accept(helloSupplier.get());


        //STREAMING
        int[] arr = { 4, 8, -5, 1, 3, -1, 654, -21, 324, -16, 564, 65, -165, 16, 51, -65 };
        // filter and count negatives
        long sizeNegatives = Arrays.stream(arr)
                .filter(i-> i<0)
                .count();
        //count returns long, so sizeNegatives must be long
        System.out.println("The number of negatives in arr equals "+sizeNegatives);

        // filter and count evens
        long sizeEvens = Arrays.stream(arr)
                .filter(i-> i%2==0)
                .count();
        System.out.println("The number of evens in arr equals "+sizeEvens);

        //count the number of letters in the list
        List<String> list = List.of("Hello", "How are you","Neat!");
        int letterCount;
        int letterCount2;
        letterCount = list.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Number of letters in the list: "+letterCount);

        letterCount2 = list.stream().map(String::length).reduce(0,Integer::sum);
        System.out.println("Number of letters in the list (calculated differently): "+letterCount2);

    }

    public static void sayHello() {
        System.out.println("Hello!");
    }
}
