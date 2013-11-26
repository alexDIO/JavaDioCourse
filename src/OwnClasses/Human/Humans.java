package OwnClasses.Human;

import java.util.Arrays;

//local code review (vtegza): try to use not static methods @ 22.11.13
public class Humans {
    //right join
    public Human[] rightJoinHumansValues(Human[] leftArray, Human[] rightArray){
        //Human[] tempArray = new Human[leftArray.length + rightArray.length];
        int index = rightArray.length;
        Human[] tempArray = Arrays.copyOf(rightArray,leftArray.length + rightArray.length);
        Human[] commonArray = Humans.joinHumansDistinctCommonValues(rightArray,leftArray);
        for (Human element : commonArray){
            tempArray[index] = element;
            index++;
        }
        Human[] resultArray = new Human[index];

        for (int i=0;i<index;i++){
            resultArray[i] = tempArray[i];
        }

        return resultArray;

    }

    //method joins 2 arrays to 1
    public static Human[] joinHumansValues(Human[] array1, Human[] array2){
        Human[] resultArray = new Human[array1.length + array2.length];
        //local code review (vtegza): use array copy @ 22.11.13
        for (int i=0;i<array1.length;i++){
            resultArray[i] = array1[i];
        }

        for (int i=0;i<array2.length;i++){
            resultArray[array1.length + i] = array2[i];
        }
        return resultArray;
    }

    //method selects unique values from 2 arrays into 1
    public static Human[] joinHumansDistinctValues(Human[] array1, Human[] array2){
        Human[] joinedArray = joinHumansValues(array1, array2);
        Human[] resultArray = selectDistinctFromArray(joinedArray);
        return resultArray;
    }

    //method selects common values from 2 arrays into 1
    public static Human[] joinHumansCommonValues(Human[] array1, Human[] array2){
        int tempArrayLength = (array1.length < array2.length) ? array1.length : array2.length;
        Human[] tempArray = new Human[tempArrayLength];
        int index = 0;

        for (int i=0;i<array1.length;i++){
            for (int j=0;j<array2.length;j++){
                if (array1[i].equals(array2[j])){
                    tempArray[index]=array1[i];
                    index++;
                }
            }
        }

        Human[] resultArray = new Human[index];

        for (int i=0;i<index;i++){
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    //method selects different values from 2 arrays into 1
    public static Human[] joinHumansDifferentValues(Human[] array1, Human[] array2){
        Human[] tempArray = new Human[array1.length+array2.length];
        int index = 0;

        //local code review (vtegza): replace with for each @ 22.11.13
        for (int i=0;i<array1.length;i++){
            boolean contains = false;
            //local code review (vtegza): replace with for each @ 22.11.13
            for (int j=0; j<array2.length;j++){
                if (array1[i].equals(array2[j])){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                tempArray[index] = array1[i];
                index++;
            }
        }

        //local code review (vtegza): for each @ 22.11.13
        for (int i=0;i<array2.length;i++){
            boolean contains = false;
            //local code review (vtegza): for each @ 22.11.13
            for (int j=0; j<array1.length;j++){
                if (array2[i].equals(array1[j])){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                tempArray[index] = array2[i];
                index++;
            }
        }

        Human[] resultArray = new Human[index];

        for (int i=0;i<index;i++){
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    //method selects unique common values from 2 arrays into 1
    public static Human[] joinHumansDistinctCommonValues(Human[] array1, Human[] array2){
        Human[] tempArray = joinHumansCommonValues(array1, array2);
        Human[] resultArray = selectDistinctFromArray(tempArray);
        return resultArray;
    }

    //method selects unique different values from 2 arrays into 1
    public static Human[] joinHumansDistinctDifferentValues(Human[] array1, Human[] array2){
        Human[] tempArray = joinHumansDifferentValues(array1, array2);
        Human[] resultArray = selectDistinctFromArray(tempArray);
        return resultArray;
    }

    //method selects unique values from one array to another
    public static Human[] selectDistinctFromArray(Human[] array){
        Human[] tempArray = new Human[array.length];
        int index = 0;

        //local code review (vtegza): use for each @ 22.11.13
        for (int i=0; i<array.length;i++){

            boolean contains = false;
            for (int j=0;j<index;j++){
                if (array[i].equals(tempArray[j])){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                tempArray[index]=array[i];
                index++;
            }
        }

        Human[] resultArray = new Human[index];

        for (int i=0;i<index;i++){
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    //method compares 2 arrays of Humans
    public static boolean isHumanArraysEquals(Human[] array1, Human[] array2){
        if (Arrays.equals(array1,array2))
            return true;
        else if (array1.length != array2.length){
                return false;
            }
        else {
                Arrays.sort(array1,new SortHumanByAgeAndName());
                Arrays.sort(array2,new SortHumanByAgeAndName());

             for (int i=0; i<array1.length;i++){
                 if (!array1[i].equals(array2[i])){
                     return false;
                 }
             }
        }
        return true;
    }
}
