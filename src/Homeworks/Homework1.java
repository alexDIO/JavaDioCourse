package Homeworks;

import OwnClasses.IntArrays.IntArrays;

public class Homework1 {
    public static void main(String[] args){
        int[] array1 = {1,2,6,4,5,6,12,11,56,88};
        int[] array2 = {1,6,3,7,5,7,13,6,12,33};

        //selection of all values from arrays
        int[] finalArray1 = IntArrays.joinArraysValues(array1,array2);
        for (int elem : finalArray1)
            System.out.println(elem);

        //selection of all unique values from arrays
        int[] finalArray2 = IntArrays.joinArraysDistinctValues(array1,array2);
        for (int elem : finalArray2)
            System.out.println(elem);

        //selection of values, which contains in both arrays
        int[] finalArray3 = IntArrays.joinArraysCommonValues(array1,array2);
        for (int elem : finalArray3)
            System.out.println(elem);

        //selection of values, which contains only in one of arrays
        int[] finalArray4 = IntArrays.joinArraysDifferentValues(array1,array2);
        for (int elem : finalArray4)
            System.out.println(elem);

        //selection of unique values, which contains in both arrays
        int[] finalArray5 = IntArrays.joinArraysDistinctCommonValues(array1,array2);
        for (int elem : finalArray5)
            System.out.println(elem);

        //selection of unique values, which contains only in one of arrays
        int[] finalArray6 = IntArrays.joinArraysDistinctDifferentValues(array1,array2);
        for (int elem : finalArray6)
        System.out.println(elem);
    }
}


