package Temp_Hold.lesson_019_ArrayList;

import java.util.Arrays;

//OVERCOME ARRAY LENGTH CHANGE LIMITATIONS

class ArrayList {

    //ATTRIBUTES

    private int[] data;
    private int count = 0;
    private static int initial_size = 10;

    //GETTERS AND SETTERS

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //CONSTRUCTORS

    public ArrayList(int[] data) {
        // array
        setData(data);
        //change count
        setCount(countElements(data));
        // setCount(data.length);
    }


    public ArrayList(int length) {
        // array
        int[] array = new int[length];
        setData(array);
        setCount(0);
    }



    public ArrayList() {
        // array
        setData(new int[initial_size]);
        setCount(0);
    }

    //METHODS

    //count elements
    public int countElements(int[] data) {
        int c = 0;
        for (int i= 0; i<data.length; i++) {
            if (data[i]!=0) {
                c++;
            }
        }
        return c;
    }


    //SHOW AList

    public void showList() {
        System.out.println("The AList is as following: "+Arrays.toString(getData()));
        System.out.println("Its length is "+getCount());
    }

    //ADD ELEMENT TO DATA

    public void add(int value) {
        int[] tempArray = data;
        boolean added = false;
        // CASE 1: there are empty spaces to be filled (Zeros)
        for (int i= 0; i<tempArray.length; i++) {
            if (tempArray[i] == 0) {
                tempArray[i] = value;
                added = true;
                break;
            }
        }
        // CASE 2: new slot is needed
        if (!added) {
            int[] tempArray2 = new int [tempArray.length+1];
            tempArray2[tempArray2.length-1] = value;
            for (int i= 0; i<tempArray.length; i++) {
                tempArray2[i] = tempArray[i];
            }
            //add count
            setCount(getCount()+1);
            this.data = tempArray2;
            return;
            //return new PokemonTeam(tempArray2);
        }
        System.out.println("Element "+value+" added!");
        //return new array
        this.data = tempArray;
        //return new PokemonTeam(tempArray);
    }

    public void removeByIndex(int a) {
        System.out.println("Removing the "+a+"th element of the PokemonTeam");
        getData()[a] = 0;
        setCount(countElements(getData()));
    }

}
