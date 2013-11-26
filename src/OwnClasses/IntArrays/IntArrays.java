package OwnClasses.IntArrays;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.11.13
 * Time: 23:55
 * To change this template use File | Settings | File Templates.
 */
public class IntArrays {
    //method joins 2 arrays to 1
    public static int[] joinArraysValues(int[] array1, int[] array2){
        int[] resultArray = new int[array1.length + array2.length];
        for (int i=0;i<array1.length;i++){
            resultArray[i] = array1[i];
        }

        for (int i=0;i<array2.length;i++){
            resultArray[array1.length + i] = array2[i];
        }
        return resultArray;
    }

    //method selects unique values from 2 arrays into 1
    public static int[] joinArraysDistinctValues(int[] array1, int[] array2){
        int[] joinedArray = joinArraysValues(array1,array2);
        int[] resultArray = selectDistinctFromArray(joinedArray);
        return resultArray;
    }

    //method selects common values from 2 arrays into 1
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

    //method selects different values from 2 arrays into 1
    public static int[] joinArraysDifferentValues(int[] array1, int[] array2){
        int[] tempArray = new int[array1.length+array2.length];
        int index = 0;

        for (int i=0;i<array1.length;i++){
            boolean contains = false;
            for (int j=0; j<array2.length;j++){
                if (array1[i]==array2[j]){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                tempArray[index] = array1[i];
                index++;
            }
        }

        for (int i=0;i<array2.length;i++){
            boolean contains = false;
            for (int j=0; j<array1.length;j++){
                if (array2[i]==array1[j]){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                tempArray[index] = array2[i];
                index++;
            }
        }

        int[] resultArray = new int[index];

        for (int i=0;i<index;i++){
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    //method selects unique common values from 2 arrays into 1
    public static int[] joinArraysDistinctCommonValues(int[] array1, int[] array2){
        int[] tempArray = joinArraysCommonValues(array1,array2);
        int[] resultArray = selectDistinctFromArray(tempArray);
        return resultArray;
    }

    //method selects unique different values from 2 arrays into 1
    public static int[] joinArraysDistinctDifferentValues(int[] array1, int[] array2){
        int[] tempArray = joinArraysDifferentValues(array1,array2);
        int[] resultArray = selectDistinctFromArray(tempArray);
        return resultArray;
    }

    //method selects unique values from one array to another
    public static int[] selectDistinctFromArray(int[] array){
        int[] tempArray = new int[array.length];
        int index = 0;

        for (int i=0; i<array.length;i++){

            boolean contains = false;
            for (int j=0;j<index;j++){
                if (array[i]==tempArray[j]){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                tempArray[index]=array[i];
                index++;
            }
        }

        int[] resultArray = new int[index];

        for (int i=0;i<index;i++){
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }
}

