package lesson_035_JavaFramework2;

import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    //age-based comparison
    public int compareTo (Person another) {
        return this.age - another.age;
    }
}

class NameComparator implements Comparator<Person> {
    //name-based comparison

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}





public class L35 {
    public static void main(String[] args) {
        //COMPARE AND COMPARATOR
        Person rafik = new Person("Refik", 21);
        Person rafik2 = new Person("Refik", 21);
        Person ivan = new Person("Ivan", 20);
        Person peter = new Person("Peter", 20);

        NameComparator comparator1 = new NameComparator();
        //AGE-Based comparisons
        System.out.println("CompareTo - AGE-BASED");
        System.out.println("CompareTo ivan and peter "+ivan.compareTo(peter));
        System.out.println("CompareTo ivan and rafik "+ivan.compareTo(rafik));
        //NAME-Based comparisons
        System.out.println("Compare - NAME-BASED");
        System.out.println("Compare rafik and rafik2 "+comparator1.compare(rafik, rafik2));
        System.out.println("Compare ivan and peter "+comparator1.compare(ivan, peter));

        List<Person> list = new ArrayList<>();
        list.sort((o1,o2) -> o1.age-o2.age);
        list.sort(comparator1);



        //HASH MAP and MAP
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("HAshMap AND MAP");
        System.out.println("Create Map");
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 200);
        map.put("Banana", 100);
        map.put("Orange", 300);
        map.put("Apple", 150);
        System.out.println("Apple Price: "+map.get("Apple"));
        System.out.println("Banana Price: "+map.get("Banana"));
        //Iteration by key
        for (String key : map.keySet()) {
            System.out.println(key+" costs "+map.get(key));
        }

        System.out.println("Keys: "+map.keySet());
        System.out.println("Values: "+map.values());
        System.out.println("Is there apple price: "+map.containsKey("Apple"));
        System.out.println("Is there a price of 200 : "+map.containsValue(200));
        map.replace("Apple",500);
        System.out.println("Apple price : "+map.get("Apple"));
        System.out.println("amount : "+map.size());

        //Linked List and Queue
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Linked List and Queue");
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        System.out.println("Remove and return of 1st element (apple)");
        System.out.println(queue.poll());
        System.out.println("Watch and NOT remove 1st element (now banana)");
        System.out.println(queue.peek());
    }

}
