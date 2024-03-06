package lesson_036_JavaFramework3.Bobr;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class MainZoo {
    public static void main(String[] args) {
        System.out.println("Declaring Beavers...");
        Bobr b1 = new Bobr();
        Bobr b2 = new Bobr();
        Bobr b3 = new Bobr("Little Tooth", 3,7);
        Bobr b4 = new Bobr("Master Builder", 2,6);
        Bobr b5 = new Bobr("Dam Breaker", 3,5);
        Bobr b6 = new Bobr("Yellow Tail", 4,1);
        Bobr b7 = new Bobr("Dead Eye", 6,7);
        Bobr b8 = new Bobr("Splinter", 7,9);
        Bobr b9 = new Bobr("Biter", 21,4);
        Bobr b10 = new Bobr("Taskmaster", 2,5);
        Bobr b11 = new Bobr("Carolus Rex", 3,1);


        System.out.println("Adding Beavers to Arraylist...");
        List<Bobr> bobrList = new ArrayList<>();
        bobrList.add(b1);
        bobrList.add(b2);
        bobrList.add(b3);
        bobrList.add(b4);
        bobrList.add(b5);
        bobrList.add(b6);
        bobrList.add(b7);
        bobrList.add(b8);
        bobrList.add(b9);
        bobrList.add(b3);
        bobrList.add(b3);


        System.out.println("Declaring Hashset List");
        Set<Bobr> bobrHSet = new HashSet<>();
        System.out.println("Adding Beavers to HashSet...");
        bobrHSet.add(b1);
        bobrHSet.add(b2);
        bobrHSet.add(b3);
        bobrHSet.add(b4);
        bobrHSet.add(b5);
        bobrHSet.add(b11);


        System.out.println("Iterating through the Hashset looking for the same beavers in the arraylist...");
        //variable to count number of same beavers discovered in the main arraylist
        int count = 0;
        //Working through the hashset
        for (Bobr x : bobrHSet) {
            System.out.println(" ");
            System.out.println("Looking for Beaver "+x.getName());
            System.out.println("Let's search for it in the old Array List ");
            for (Bobr a : bobrList) {
                if (x.equals(a)) {
                    count++;
                    System.out.println("Beaver " + x.getName() + " has been found in the list for the " + count + ". time!");
                }
            }
            count=0;
            System.out.println("Done searching for this one, let's move on to the next!");
            System.out.println(" ");
        }


    }
}
