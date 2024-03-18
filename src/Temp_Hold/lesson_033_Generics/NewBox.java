package Temp_Hold.lesson_033_Generics;

import Temp_Hold.lesson_026_abstraction.Geometry.Rechtangle;

import static java.lang.System.*;

public class NewBox<T> {

    private T data;

    NewBox() {
        this.data = null;
        System.out.println("Created an empty box");
    }

    NewBox(T a) {
        this.data = a;
        System.out.println("Created a box with value "+a);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isValueEqual(Object value) {
        return this.data.equals(value);
    }

    static <T> boolean isEqual(NewBox<T> box1, NewBox<T> box2) {
        return box1.getData().equals(box2.getData());
    }
}

class NewBoxMain {
    public static void main(String[] args) {
        NewBox<String> box1 = new NewBox();
        box1.setData("pack1");
        NewBox<String> box2 = new NewBox("pack1");
        NewBox<String> box3 = new NewBox("pack2");
        System.out.println("Compare box 1 and pack1 expression "+box1.isValueEqual("pack1"));
        System.out.println("Compare box 1 and box 2 "+NewBox.isEqual(box1,box2));
        System.out.println("Compare box 1 and box 3 "+NewBox.isEqual(box1,box3));
    }
}
