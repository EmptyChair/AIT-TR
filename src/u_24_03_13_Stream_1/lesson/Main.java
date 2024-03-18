package u_24_03_13_Stream_1.lesson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "pineapple");

        //show fruits
        fruits.stream().mapToInt(s ->s.length()).forEach(i-> System.out.println(i));

        //filtrate by p, add dollar sign at the start, show
        fruits.stream().filter(s->s.contains("p")).map(s-> "$" + s).forEach(s->System.out.println(s));

        String [] strings = {"apple", "banana", "pineapple"};
        Stream<Object> objectStream = Arrays.stream(strings);

        //Stream.generate();
    }
}
