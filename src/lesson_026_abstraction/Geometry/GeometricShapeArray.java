package lesson_026_abstraction.Geometry;

import lesson_021_Junit.Pokemon.Pokemon;
import lesson_027_interface.GeometryShape;

public class GeometricShapeArray {

    private GeometricShape[] array;
    private int count;

    //GETTER SETTER

    public GeometricShape[] getArray() {
        return array;
    }

    public void setArray(GeometricShape[] array) {
        this.array = array;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //CONSTRUCTOR

    public GeometricShapeArray () {
        this.array = new GeometricShape[5];
        int count = 0;
    }

    public GeometricShapeArray (int length) {
        this.array = new GeometricShape[length];
        int count = 0;
    }

    public void add(GeometricShape shape) {
        //check if there are empty slots in the array - there must be either inside or in the end due to resize
        for (int i = 0; i< this.array.length; i++) {
            if (this.array[i] == null) {
                this.array[i] = shape;
                count++;
                //Getting out of method
                return;
            }
        }
        //in case we don't jump out - resize
        resize();
        this.array[array.length-1] = shape;
        count++;
    }

    // resizing arrayList
    public void resize() {
        GeometricShape[] array2 = new GeometricShape[this.array.length+1];
        for (int i=0; i<this.array.length; i++) {
            array2[i] = this.array[i];
        }
        this.array = array2;
    }

    //removing nth element of the list
    public void remove(int index) {
        if (index>=this.array.length) {
            System.out.println("Sorry, the index provided is too high for the length of this array list.");
        } else {
            // move all elements after [index] to the left
            for (int i=index; i<this.array.length-1; i++) {
                this.array[i] = this.array[i+1];
            }
            //remove final element as to prevent doubling
            this.array[this.array.length-1] = null;
            this.count--;
            System.out.println("Element "+index+" removed.");
        }
    }

    //Show Array
    public void showArrayList() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i<this.array.length; i++ ) {
            if (this.array[i]!=null) {
                this.array[i].showInfo();
            } else {
                System.out.println("Slot "+i+" is empty");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }
}
