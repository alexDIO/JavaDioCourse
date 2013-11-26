package Homeworks;

import OwnClasses.Human.Human;
import OwnClasses.Human.HumanDelegate;
import OwnClasses.Human.Humans;

public class Homework2_3 {


    public static void main(String[] args){

    Human john = new Human.Builder()
        .name("John")
        .age(20)
        .profession("Tailor")
        .build();

    Human bill = new Human.Builder()
        .name("Bill")
        .age(33)
        .profession("Baker")
        .build();


    Human sara = new Human.Builder()
        .name("Sara")
        .age(25)
        .build();

    Human walter = new Human.Builder()
        .name("Walter")
        .age(31)
        .profession("Sailor")
        .build();

    Human adam = new Human.Builder()
        .name("Adam")
        .age(18)
        .build();

    Human michael = new Human.Builder()
        .name("Michael")
        .age(38)
        .build();

    Human oscar = new Human.Builder()
        .name("Oscar")
        .age(33)
        .build();

    Human jessica = new Human.Builder()
        .name("Jessica")
        .age(28)
        .profession("Lawyer")
        .build();

    Human david = new Human.Builder()
        .name("David")
        .age(47)
        .build();

    Human monica = new Human.Builder()
        .name("Monica")
        .age(25)
        .build();

    Human mathew = new Human.Builder()
        .name("Mathew")
        .age(33)
        .profession("Judge")
        .build();

    Human stanley = new Human.Builder()
        .name("Stanley")
        .age(26)
        .build();

    Human rachel = new Human.Builder()
        .name("Rachel")
        .age(24)
        .build();

    Human[] inputArray1 = {john,bill,sara,walter,adam,sara,michael,oscar,jessica,david};
    Human[] inputArray2 = {john,sara,monica,mathew,adam,mathew,stanley,sara,michael,rachel};

    Humans resource = new Humans();
    HumanDelegate humanDelegate = new HumanDelegate(resource);

    //selection of all unique Humans from 2 arrays + test
    Human[] sampleArray1 = {john,bill,sara,walter,adam,michael,oscar,jessica,david,monica,mathew,stanley,rachel};
    Human[] finalArray1 = humanDelegate.joinHumansDistinctValues(inputArray1,inputArray2,sampleArray1);

    //selection of all unique common Humans from 2 arrays+test
    Human[] sampleArray2 = {john,sara,adam,michael};
    Human[] finalArray2 = humanDelegate.joinHumansDistinctCommonValues(inputArray1,inputArray2,sampleArray2);

    //selection of all unique different values from 2 arrays+test
    Human[] sampleArray3 = {bill,walter,oscar,jessica,david,monica,mathew,stanley,rachel};
    Human[] finalArray3 = humanDelegate.joinHumansDistinctDifferentValues(inputArray1,inputArray2,sampleArray3);

    //selection of all values from rightArray and all common different values
    Human[] rightJoinArrayTest = {john,sara,monica,mathew,adam,mathew,stanley,sara,michael,rachel,
            john,sara,sara,adam,sara,sara,michael};
    Human[] rightJoinArray = humanDelegate.rightJoinHumansValues(inputArray1,inputArray2,rightJoinArrayTest);

    }
}
