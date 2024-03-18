package Temp_Hold.lesson_012_Sorting;

import java.util.Arrays;

public class HA12_SelectionSorting {
    public static void main(String[] args) {
        int[] data = {5,5,7,3,2};
        System.out.println("We shall sort this array "+Arrays.toString(data));
        System.out.println("We shall use Selection Sorting");

        int temp;
        int minIndex;
        for (int i = 0; i< data.length; i++) {
            minIndex = i;
            for (int c = i+1; c<data.length; c++) {
                if (data[c]<data[i]) {
                    minIndex = c;
                }
            }
            if (minIndex != i) {
                //swap data[i] with data[minIndex]
                temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
            System.out.println("This is our array for iteration "+i+" of the selection sorting");
            System.out.println(Arrays.toString(data));
        }
    }
}
