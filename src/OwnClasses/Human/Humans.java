package OwnClasses.Human;

import java.util.Arrays;

//local code review (vtegza): name it ib better way, if it is util class - it could be named as HumanUtils or HumanHelper @ 02.12.13
public class Humans {
    //right join
    public Human[] rightJoinHumansValues(Human[] leftArray, Human[] rightArray) throws ArrayIndexOutOfBoundsException{
        Human[] commonArray = joinHumansCommonValues(leftArray,rightArray);
        Human[] resultArray = joinHumansValues(commonArray,rightArray);
        return resultArray;
    }

    //method joins 2 arrays to 1
    public Human[] joinHumansValues(Human[] array1, Human[] array2){
        Human[] resultArray = Arrays.copyOf(array1,array1.length + array2.length);
        for (int i=0;i<array2.length;i++){
            resultArray[array1.length + i] = array2[i];
        }
        return resultArray;
    }

    //method selects unique values from 2 arrays into 1
    public Human[] joinHumansDistinctValues(Human[] array1, Human[] array2) throws ArrayIndexOutOfBoundsException{
        Human[] joinedArray = joinHumansValues(array1, array2);
        Human[] resultArray = selectDistinctFromArray(joinedArray);
        return resultArray;
    }

    //method selects common values from 2 arrays into 1
    public Human[] joinHumansCommonValues(Human[] array1, Human[] array2){
        Human[] tempArray = new Human[array1.length+array2.length];
        int index = 0;

        for (Human element1 : array1){
            for (Human element2 : array2){
                if (element1.equals(element2)){
                    tempArray[index]=element1;
                    index++;
                }
            }
        }

        Human[] resultArray = new Human[index];

        //local code review (vtegza): array copy could be used here @ 02.12.13
        for (int i=0;i<index;i++){
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    //method selects different values from 2 arrays into 1
    public Human[] joinHumansDifferentValues(Human[] array1, Human[] array2){
        Human[] tempArray = new Human[array1.length+array2.length];
        int index = 0;

        for (Human element1 : array1){
            boolean contains = false;
            for (Human element2 : array2){
                if (element1.equals(element2)){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                tempArray[index] = element1;
                index++;
            }
        }

        for (Human elem2 : array2){
            boolean contains = false;
            for (Human elem1 : array1){
                if (elem2.equals(elem1)){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                tempArray[index] = elem2;
                index++;
            }
        }

        Human[] resultArray = new Human[index];
        //local code review (vtegza): array copu could be used here @ 02.12.13
        for (int i=0;i<index;i++){
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    //method selects unique common values from 2 arrays into 1
    public Human[] joinHumansDistinctCommonValues(Human[] array1, Human[] array2) throws ArrayIndexOutOfBoundsException{
        Human[] tempArray = joinHumansCommonValues(array1, array2);
        Human[] resultArray = selectDistinctFromArray(tempArray);
        return resultArray;
    }

    //method selects unique different values from 2 arrays into 1
    public Human[] joinHumansDistinctDifferentValues(Human[] array1, Human[] array2) throws ArrayIndexOutOfBoundsException{
        Human[] tempArray = joinHumansDifferentValues(array1, array2);
        Human[] resultArray = selectDistinctFromArray(tempArray);
        return resultArray;
    }

    //method selects unique values from one array to another
    public Human[] selectDistinctFromArray(Human[] array){
        Human[] tempArray = new Human[array.length];
        int index = 0;

        for (Human element1 : array){

            boolean contains = false;
            for (Human element2 : tempArray){
                if (element1.equals(element2)){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                tempArray[index]=element1;
                index++;
            }
        }

        Human[] resultArray = new Human[index];
        //local code review (vtegza): Array Copy could be used here @ 02.12.13
        for (int i=0;i<index;i++){
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    //method compares 2 arrays of Humans
    public boolean isHumanArraysEquals(Human[] array1, Human[] array2){
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
