package Temp_Hold.lesson_024_objectAndString;

public class L24Main {
    public static void main(String[] args) {

        //LECTURE - SAVING STRINGS

        String str = "Hello"; // 1 String-type Object
        str = str + " World!"; // 1+2 =3 String objects
        str = str + " I'm Karl!"; // 3+2 String Objects
        // not good, 5 objects for a trivial task
        str = "Blast! "+str+" Bye!"; //5+4=9 String Objects, OMG!!!
        String str2 = str;
        str2 = str2 + " BAM!";
        String str3 = new String("Hi");

        //STRING BUILDER
        StringBuilder shoppingList;
        shoppingList = new StringBuilder(); //1 StringBuilder

        shoppingList.append("Milk"); //1 String, 1 SB
        shoppingList.append(", eggs"); //2 String, 1 SB
        shoppingList.append(", bread"); //3 String, 1 SB
        shoppingList.append(", butter");//4 String, 1 SB

        System.out.println("Shopping list:" + shoppingList.toString());
        //RESULT: SB is better at saving space and optimizing

        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());



    }

}
