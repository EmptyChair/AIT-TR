package lesson_019_ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {25,47,98,85,36,21,57};
        int[] array2 = new int[] {25,47,98,0,36,0,57};

        System.out.println("This is array");
        for (int a : array) {
            System.out.print(" "+a+" ");
        }
        System.out.println("");
        System.out.println("This is array 2");
        for (int b : array2) {
            System.out.print(" "+b+" ");
        }

        ArrayList list1 = new ArrayList();
        list1.showList();
        ArrayList list2 = new ArrayList(array);
        list2.showList();
        ArrayList list3 = new ArrayList(array2);
        list3.showList();

        list3.add(5);
        list3.showList();

        list3.add(25);
        list3.showList();

        list3.add(50);
        list3.showList();

        list3.removeByIndex(3);
        list3.showList();

        list3.add(100);
        list3.showList();

        list3.add(101);
        list3.showList();

        list3.add(102);
        list3.showList();


    }
}
