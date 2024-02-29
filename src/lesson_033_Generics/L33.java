package lesson_033_Generics;

class Box<T> {
     private T content;

    public Box(T data) {
        this.content = data;
    }

    public Box() {
        this.content = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

class BoxDouble<T1, T2> {
    private T1 content1;
    private T2 content2;

    public BoxDouble(T1 a, T2 b) {
        this.content1 = a;
        this.content2 = b;
    }

    public BoxDouble() {
        this.content1 = null;
        this.content2 = null;
    }

    public T1 getContent1() {
        return content1;
    }

    public T2 getContent2() {
        return content2;
    }

    public void setContent(T1 content1, T2 content2) {
        this.content1 = content1;
        this.content2 = content2;
    }
}

public class L33 {
    public static void main(String[] args) {

        //STRING BOX
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics!");
        System.out.println(stringBox.getContent());

        //INT BOX
        Box<Integer> intBox = new Box<Integer>(25);
        System.out.println(intBox.getContent());


        boolean answer = checkBox(stringBox);
        //WON'T WORK with INT BOX!!!
        //boolean answer2 = checkBox(intBox);
        System.out.println("Checkwhether stringbox is empty");
        System.out.println(answer);



        Box<Integer> intBox2 = new Box<Integer>(36);
        Box<Integer> intBox3 = new Box<Integer>(25);
        boolean comp1 = isEqual(intBox, intBox3);
        boolean comp2 = isEqual(intBox, intBox2);
        boolean comp3 = Util.<Integer>isEqual(intBox, intBox2);
        System.out.println("Compare intbox and intbox3");
        System.out.println(comp1);
        System.out.println("Compare intbox and intbox2");
        System.out.println(comp2);
        System.out.println("Compare via outsource methos intbox and intbox2");
        System.out.println(comp3);

    }

    static boolean checkBox(Box<String> stringbox) {
        return stringbox.getContent()!=null;
    }

    static <T> boolean isEqual(Box<T> box1, Box<T> box2) {
        //compare boxes
        return box1.getContent().equals(box2.getContent());
    }
}

class Util {
    static <T> boolean isEqual(Box<T> box1, Box<T> box2) {
        //compare boxes
        return box1.getContent().equals(box2.getContent());
    }

    //This will not work with generic is equal - confuses Java due to overlap
    /*
    static boolean isEqual(Box<Integer> box1, Box<String> box2) {
        //compare boxes

        String a = Integer.toString(box1.getContent());
        System.out.println(a);
        String b = box2.getContent();
        System.out.println(b);
        System.out.println("Compare"+a+" and "+b);
        return a.equals(b);
    }

     */


}
