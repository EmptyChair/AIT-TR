package Temp_Hold.lesson_036_JavaFramework3;

import java.nio.charset.Charset;
import java.util.*;

public class SetHashSet_Example {
    public static void main(String[] args) {
        System.out.println("Exploring set/hashset");
        System.out.println("Setting up new set");
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Banana");
        fruits.add("Banana");
        fruits.add("Bomb");
        System.out.println("Show fruits "+fruits);
        boolean isNew = fruits.add("Cherry");
        System.out.println("Cherry added? " +isNew);
        System.out.println("Show fruits "+fruits);
        isNew = fruits.add("Apple"); //attempting to add apple again
        System.out.println("Apple added? " +isNew);
        System.out.println("Show fruits "+fruits);

        String data = "gögksj58ot4te689guhgrbshjflnvknjkna,aödq0493589340692854tilugreld";
        System.out.println("data as was " +data);
        System.out.println("data cleared of double symbols " +clearKarl(data));
        //System.out.println("data cleared of double symbols and sorted" +sorting(clearKarl(data)));
        /*
        аргумент: String data
удалить все дублирующиеся символы сформировав из строки - коллекцию
преобразовать к списку и отсортировать
         */
    }

    public static String clearKarl(String data) {
        Set<Character>  charsets = new HashSet<>();
        for (char c: data.toCharArray()) {
            //rely on the fact that Hashset only takes unique symbols
            charsets.add(c);
        }
        List<Character> charList = new ArrayList<>(charsets);
        Collections.sort(charList);
        String s = charList.toString();
        //System.out.println(charsets);
        return s;

    }




        /*
    public static String clearMine(String data) {
        char[] chars = data.toCharArray();
        for (int i = 0; i<chars.length; i++) {
            char temp = chars[i];
            for (int c = i+1; c<chars.length; c++) {
                if (chars[c]== temp) {
                    chars = ArrayUtils.removeElement(chars, chars[c]);
                }

            }
        }
    }

         */

/*
    public static String sorting (String data) {
        return;
    }

 */
}
