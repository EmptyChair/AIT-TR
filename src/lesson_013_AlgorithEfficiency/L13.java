package lesson_013_AlgorithEfficiency;

import java.util.Arrays;

public class L13 {
    public static void main(String[] args) {

        int [] array1 = {10};
        System.out.println("Unsorted array 1 "+Arrays.toString(array1));
        System.out.println("Sorted array 1 "+Arrays.toString(mergeSort(array1)));



        int [] array2 = {10,2,7,65,85,4,11};
        System.out.println("Unsorted array 1 "+Arrays.toString(array2));
        System.out.println("Sorted array 2 "+Arrays.toString(mergeSort(array2)));

        int [] array3 = {    35,                24,              5,
                23, 10,  18, 12,  27,  28, 16,
                12,
                45,
                40,
                40,
                41,
                50,
                35,
                33,
                8,
                10,
                48,
                33,
                10};
        System.out.println("Unsorted array 3 "+Arrays.toString(array3));
        System.out.println("Sorted array 3 "+Arrays.toString(mergeSort(array3)));

    }

    public static int[] mergeSort(int[] array) {
        int [] result = copyArray(array);
        int step = 2;
        //while our sub-array size does not grow larger than array size
        while (result.length>=step) {
            //walk through the array in steps, simulating re-arrangement of 2-element pairs, 4-element sets etc
            for (int i=0; i<result.length; i = i+step ){
                System.out.println("Working in groups of "+step);
                //if i plus 2/4/8... does NOT go beyond the bound, grab step-sized sub-set and re-arrange it
                if ((i+step) < result.length) {
                    result = sort(result, i, i + step - 1);
                    System.out.println(Arrays.toString(result));
                    //if i plus 2/4/8... DOES go beyond the bound,grab what's left of the array and re-arrange that subset
                } else {
                    result = sort(result, i, result.length - 1);
                    System.out.println(Arrays.toString(result));
                }
            }
            //increase sub-array size for the next cycle
            step = step*2;
        }
        return result;
    }

    public static int[] sort(int[] array, int start, int end) {
        System.out.println("Sorting through elements "+start+" and "+end);
        //end is inclusive, ergo the last element to be sorted
        //work beginning with start and till the element before the end, to avoid grabbing outside the range
        for (int c=start; c<end; c++) {
            //current element saved
            int temp = array[c];
            //compare current element with subsequent elements
            for (int a=c+1; a<=end; a++) {
                //if current element bigger than the next element - swap and save
                if (temp>array[a]) {
                    array[c] = array[a];
                    array[a] = temp;
                    temp = array[c];
                }
            }
        }
        return array;
    }


    public static int[] copyArray(int[] array) {
        int [] copy = new int [array.length];
        for (int i = 0; i<array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

}
