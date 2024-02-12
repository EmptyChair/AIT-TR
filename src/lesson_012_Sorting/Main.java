package lesson_012_Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("This is a lesson about searching array!");

        int[] array1 = {1,3,546,7,54,123,7,98,45,67,99,51,23,81,56};
        System.out.println("This is our array: "+Arrays.toString(array1));




        int max = 1;
        System.out.println("Biggest element is :"+max);
        int min = 1;
        System.out.println("Smallest element is"+min);

        // add search of a particular element
        // add search for element's index
    }

    public boolean isElementOfArray (int e, int[] array) {
        for (int i : array) {
            if (array[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int isElementOfArray_Index (int e, int[] array) {
        for (int i : array) {
            if (array[i] == e) {
                return i;
            }
        }
        return -1;
    }
}