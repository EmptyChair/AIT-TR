package u_24_03_14_Stream_2;

import java.util.List;

import static java.util.stream.Stream.of;

public class Stream {
    public static void main(String[] args) {
        //STREAM - TASKS

        //INPUT DATA
        String[] strings = {
                "apple", "orange", "pineapple",
                "apple", "cucumber", "lemon", "lemon",
                "tomato", "corn", "cabbage", "banana",
                "lime", "lemon"
        };
        String[] strings2 = {
                "apple", "orange", "pineapple",
                "apple", "cucumber", "lemon", "lemon", "lemon", "lemon", "lemon",
                "tomato", "corn", "cabbage", "banana",
                "lime", "lemon"
        };
        String[] strings3 = {
                "apple", "orange", "pineapple",
                "apple", "cucumber",
                "tomato", "corn", "cabbage", "banana",
                "lime",
        };
        List<Cat> cats = List.of(
                new Cat("Marsik"),
                new Cat("Barsik"),
                new Cat("Masik"),
                new Cat("Boris"),
                new Cat("Matroskin")
        );

        int[] arr = { 4, 8, -5, 1, 3, -1, 654, -21, 324, -16, 564, 65, -165, 16, 51, -65 };
        int[] data = {5,3,4,6,55,4,7,56,53,4,4,4};
        String[] strings4 = {"Lorem",  "ipsum",  "dolor",  "sit",  "amet,",  "String",  "consectetur",  "adipiscing",  "elit,",
                "sed",  "do",  "eiusmod",  "tempor",  "incididunt",  "ut",  "labore",  "et",  "dolore",  "magna",  "aliqua.",
                "Ut",  "enim",  "ad",  "minim",  "veniam,",  "quis",  "nostrud",  "exercitation",  "ullamco",  "laboris",
                "nisi",  "ut",  "aliquip",  "ex",  "ea",  "commodo",  "consequat.",  "Duis",  "aute",  "irure",  "dolor",
                "in",  "reprehenderit",  "in",  "voluptate",  "velit",  "esse",  "cillum",  "dolore",  "eu",  "fugiat",
                "nulla",  "pariatur.",  "Excepteur",  "sint",  "occaecat",  "cupidatat",  "non",  "proident,",  "sunt",
                "in",  "culpa",  "qui",  "officia",  "deserunt",  "mollit",  "anim",  "id",  "est",  "laborum."  };

        //TASK 1: count the number of ''word'' in the list
        countStringElements("lemon", strings);
        countStringElements("lemon", strings2);
        countStringElements("lemon", strings3);
        countStringElements("sun", strings);
        countStringElements("apple", strings);

        //TASK 2: print Hash table via the
        showAsHashTable(cats);
        showAsHashTable2(cats);

        //TASK 3: turn an int array into a String, with numbers separated by commas
        //System.out.println(intArrayToString0_42());

        //TASK 4: choose word longer than 5

        //TASK 5: choose top 5 numbers in the array

        //TASK 6: turn String into an abbreviation

        //TASK 7: how many times is the word present in the string array
        System.out.println("Word ex is contained "+countWordContainedInArray(strings4, "ex")+" times.");
        System.out.println("Word mia is contained "+countWordContainedInArray(strings4, "mia")+" times.");
        System.out.println("Word dolor is contained "+countWordContainedInArray(strings4, "dolor")+" times.");
        System.out.println("Word String is contained "+countWordContainedInArray(strings4, "String")+" times.");
        System.out.println("Word lemon is contained "+countWordContainedInArray(strings, "lemon")+" times.");
        System.out.println("Word lem is contained "+countWordContainedInArray(strings, "lem")+" times.");
        System.out.println("Word an is contained "+countWordContainedInArray(strings, "an")+" times.");
        //TASK 8: at least 1 String in String array longer than 8 chars.
        isOneStringLongerThan(strings4,8);
        isOneStringLongerThan(strings4,15);
        isOneStringLongerThan(strings,10);
        isOneStringLongerThan(strings,5);

    }

    public static void isOneStringLongerThan (String [] array, int n) {
        boolean answer = java.util.stream.Stream.of(array)
                .anyMatch(s->s.length()>n);
        if (answer)
            System.out.println("Yes, there is at least one word longer than "+n+" characters in this String collection.");
        else
            System.out.println("No, there is no word longer than "+n+" characters in this String collection.");
    }

    public static long countWordContainedInArray (String [] array, String word) {
        return java.util.stream.Stream.of(array)
                .filter(s->s.contains(word))
                .count();
    }
    /*
    public static int[] chooseTop5Numbers (int [] array) {
        Object[] newArray;
        if( array.length<5) {
            System.out.println("Array too short!");
            return null;
        } else {
            newArray = Stream.of(array).
                    sorted()
                    .skip(array.length-5)
                    .toArray();
        }


    }


    public static void chooseStringLonger3 (int n, String[] strings) {
        of(strings).allMatch(s->s.length()>n);
    }

    public static String intArrayToString0_42 () {
            String line = "";
            line = IntStream.range(0,42)
                    .mapToObj(s->String.valueOf(s))
                    .collect(Collectors.joining(", "));
            return line;
    }

     */

    public static void countStringElements(String word, String[] strings) {
        long elementCount = of(strings)
                .filter(s->s.equals(word))
                .count();
        System.out.println("The word "+word+" comes up in the list "+elementCount+" times.");
    }

    public static void showAsHashTable (List<Cat> list) {
        System.out.println("Showing cat list with hash codes:");
        list.stream().forEach(c -> System.out.println("Cat "+c.name+" with HashCode "+c.hashCode()));
    }
    public static void showAsHashTable2 (List<Cat> list) {
        System.out.println("Showing list of codes with cat names:");
        list.stream().peek(c-> System.out.print(c.hashCode()+" | ")).forEach(c-> System.out.println(c.name));

    }

}
