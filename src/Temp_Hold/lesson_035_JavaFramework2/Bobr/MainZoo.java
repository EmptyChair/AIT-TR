package Temp_Hold.lesson_035_JavaFramework2.Bobr;

import java.util.*;

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
        System.out.println("Declaring Array List");
        List<Bobr> bobrList = new ArrayList<>();
        System.out.println("Adding Beavers to Arraylist...");
        bobrList.add(b1);
        bobrList.add(b2);
        bobrList.add(b3);
        bobrList.add(b4);
        bobrList.add(b5);
        bobrList.add(b6);
        bobrList.add(b7);
        bobrList.add(b8);
        bobrList.add(b9);
        bobrList.add(b10);
        System.out.println(bobrList);
        //System.out.println("Cloning lists two times ");
        //List<Bobr> bobrList2 = (ArrayList<Bobr>) bobrList.clone();
        //List<Bobr> bobrList3 = (ArrayList<Bobr>) bobrList.clone();

        System.out.println("Sorting bobrList using Collections.sort...");
        Collections.sort(bobrList);
        System.out.println(bobrList);
        System.out.println("Sorting bobrList using Collections.sort and Name comparator...");
        Collections.sort(bobrList, new BobrNameComparator());
        System.out.println(bobrList);
        System.out.println("Sorting bobrList using Collections.sort and relative count comparator...");
        Collections.sort(bobrList, new BobrRelativeCountComparator());
        System.out.println(bobrList);
        System.out.println("Sorting bobrList using Collections.sort and lambda expression comparator...");
        //also a name sorting
        bobrList.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(bobrList);

        System.out.println("Creating map...");
        Map<String,Integer> bobrMap = new HashMap<>();
        System.out.println("Adding beavers to map...");
        for (Bobr x : bobrList) {
            bobrMap.put(x.getName(), x.getRelativesCount());
        }

        System.out.println("Showing new bobrMap...");
        for (String name : bobrMap.keySet()) {
            System.out.println("Beaver named "+name+" has "+bobrMap.get(name)+" relatives");
        }
    }
}
