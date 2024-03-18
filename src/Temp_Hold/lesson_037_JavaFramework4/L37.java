package Temp_Hold.lesson_037_JavaFramework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class L37 {
    public static void main(String[] args) {
        // create a list
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Grapefruit");
        // create an Iterator
        Iterator<String> iterator = fruits.iterator();
        // use Iterator to search through the list
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Sorting the List in alphabetic order using Collections:
        Collections.sort(fruits);
        System.out.println("Fruit List sorted in Alphabetic order "+fruits);
        // Reverse the order of elements in the list
        Collections.reverse(fruits);
        System.out.println("Fruit List sorted in Reverse order "+fruits);
        // Mix the list in random order using Collections:
        Collections.shuffle(fruits);
        System.out.println("Fruit List sorted in Random order "+fruits);
        // fill the list with all the same element - Mango
        Collections.fill(fruits,"Mango");
        System.out.println("Fruit List filled with Mangos "+fruits);
        // Adding two new elements
        fruits.add("Pineapple");
        fruits.add("Grape");
        // swapping elements with indexes 1 and 5
        Collections.swap(fruits,1,6);
        System.out.println("Fruit List with elements 1 and 6 swapped "+fruits);
        // Binary search through the list - make it alphabetical first!
        Collections.sort(fruits);
        int paIndex = Collections.binarySearch(fruits,"Pineapple");
        System.out.println("Binary search for Pineapple has shown us it is at index "+paIndex+" - "+fruits.get(paIndex));
        int roseIndex = Collections.binarySearch(fruits, "Rose");
        System.out.println("Binary search for Rose has shown us it is at index "+roseIndex+" aka not in the chain");
    }
}


