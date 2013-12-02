package Trainings.Training4;


import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        int[] array1 = {1,5,4,23,65,32,78};
        int[] array2 = {3,5,24,4,1,2,32,5};

        int[] finalArray = leftJoin(array1,array2);
        int[] testArray = {1,5,4,23,65,32,78,5,4,1,32,5};

        boolean isEquals = isArraysEquals(finalArray, testArray);

        if(!isEquals)
            System.out.println("Fail");
        else
            System.out.println("OK");
    }

    public static boolean isArrayEquals (int[] array1,int[] array2){
        boolean isEqual = Arrays.equals(array1,array2);
        if (isEqual){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isArraysEquals (int[] array1,int[] array2){
        if (Arrays.equals(array1,array2))
            return true;
        else if (array1.length != array2.length)
                return false;
        else {
                Arrays.sort(array1);
                Arrays.sort(array2);

                for (int i=0;i<array1.length;i++){
                    if (array1[i]!=array2[i]){
                        return false;
                    }
                }
            }
            return true;
    }

    public static int[] leftJoin(int[] leftArray, int[] rightArray){
        int[] commonArray = joinArraysCommonValues(rightArray,leftArray);
        int[] resultArray = joinArraysValues(leftArray,commonArray);
        return resultArray;
    }

    public static int[] joinArraysCommonValues(int[] array1, int[] array2){
        int tempArrayLength = (array1.length < array2.length) ? array1.length : array2.length;
        int[] tempArray = new int[tempArrayLength];
        int index = 0;

        for (int i=0;i<array1.length;i++){
            for (int j=0;j<array2.length;j++){
                if (array1[i]==array2[j]){
                    tempArray[index]=array1[i];
                    index++;
                }
            }
        }

        int[] resultArray = new int[index];

        for (int i=0;i<index;i++){
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    public static int[] joinArraysValues(int[] array1, int[] array2){
        int[] resultArray = new int[array1.length + array2.length];
        //local code review (vtegza): array copy could be used here @ 02.12.13
        for (int i=0;i<array1.length;i++){
            resultArray[i] = array1[i];
        }

        //local code review (vtegza): array copy could be used here @ 02.12.13
        for (int i=0;i<array2.length;i++){
            resultArray[array1.length + i] = array2[i];
        }
        return resultArray;
    }

}
