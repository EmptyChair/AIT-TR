package lesson_034_JavaFramework;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;


public class Hash {
    public static void main(String[] args) {
        Map<String, String> hashtable = new Hashtable<>();
        Set<String> hashset1 = new HashSet<>();

        //"Apple" added to hashset
        hashset1.add("Apple");
        hashset1.add("Banana");
        hashset1.add("Mandarin");
        hashset1.add("Apple");

        System.out.println(hashset1);

    }
}
