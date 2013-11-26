package OwnClasses.Human;

import OwnClasses.Tests.Tests;

public class HumanDelegate{

    private final Humans resource;

    public HumanDelegate(Humans resource){
        this.resource = resource;
    }

    public Human[] rightJoinHumansValues(Human[] leftArray, Human[] rightArray, Human[] sampleArray) {
        Human resultArray[] = resource.rightJoinHumansValues(leftArray, rightArray);
        Tests.testPrint(resource.isHumanArraysEquals(resultArray, sampleArray), "rightJoinHumansValues");
        System.out.println("Method realised via delegate");
        return resultArray;
    }

    public Human[] joinHumansValues(Human[] array1, Human[] array2){
        System.out.println("Method realised via delegate");
        return resource.joinHumansValues(array1, array2);
    }

    public Human[] joinHumansDistinctValues(Human[] array1, Human[] array2, Human[] sampleArray){
        Human resultArray[] = resource.joinHumansDistinctValues(array1, array2);
        Tests.testPrint(resource.isHumanArraysEquals(resultArray, sampleArray), "joinHumansDistinctValues");
        System.out.println("Method realised via delegate");
        return resultArray;
    }

    public Human[] joinHumansDifferentValues(Human[] array1, Human[] array2){
        System.out.println("Method realised via delegate");
        return resource.joinHumansDifferentValues(array1, array2);
    }

    public Human[] joinHumansDistinctCommonValues(Human[] array1, Human[] array2, Human[] sampleArray){
        Human resultArray[] = resource.joinHumansDistinctCommonValues(array1, array2);
        Tests.testPrint(resource.isHumanArraysEquals(resultArray, sampleArray), "joinHumansDistinctCommonValues");
        System.out.println("Method realised via delegate");
        return resultArray;
    }

    public Human[] joinHumansDistinctDifferentValues(Human[] array1, Human[] array2, Human[] sampleArray){
        Human resultArray[] = resource.joinHumansDistinctDifferentValues(array1, array2);
        Tests.testPrint(resource.isHumanArraysEquals(resultArray, sampleArray), "joinHumansDistinctCommonValues");
        System.out.println("Method realised via delegate");
        return resultArray;
    }

    public Human[] selectDistinctFromArray(Human[] array){
        System.out.println("Method realised via delegate");
        return resource.selectDistinctFromArray(array);
    }

    public boolean isHumanArraysEquals(Human[] array1, Human[] array2){
        System.out.println("Method realised via delegate");
        return resource.isHumanArraysEquals(array1, array2);
    }


}
