/*package Homeworks;

//local code review (vtegza): use packages @ 22.11.13
import OwnClasses.Human.Human;
import OwnClasses.Human.Humans;
import OwnClasses.Tests.Tests;

public class Homework2 {


    public static void main(String[] args){

    Human john = new Human("John", 20 ,"Tailor");
    Human bill = new Human("Bill", 33, "Baker");
    Human sara = new Human("Sara", 25);
    Human walter = new Human("Walter", 31, "Sailor");
    Human adam = new Human("Adam", 18);
    Human michael = new Human("Michael", 38);
    Human oscar = new Human("Oscar", 33);
    Human jessica = new Human("Jessica", 28, "Lawyer");
    Human david = new Human("David", 47);
    Human monica = new Human("Monica", 25);
    Human mathew = new Human("Mathew", 33, "Judge");
    Human stanley = new Human("Stanley", 26);
    Human rachel = new Human("Rachel",29);

    Human[] inputArray1 = {john,bill,sara,walter,adam,sara,michael,oscar,jessica,david};
    Human[] inputArray2 = {john,sara,monica,mathew,adam,mathew,stanley,sara,michael,rachel};

    //selection of all unique Humans from 2 arrays
    Human[] finalArray1 = Humans.joinHumansDistinctValues(inputArray1,inputArray2);
    Human[] sampleArray1 = {john,bill,sara,walter,adam,michael,oscar,jessica,david,monica,mathew,stanley,rachel};

    Tests.testPrint(Humans.isHumanArraysEquals(finalArray1,sampleArray1), "First");

    //selection of all unique common Humans from 2 arrays
    Human[] finalArray2 = Humans.joinHumansDistinctCommonValues(inputArray1,inputArray2);
    Human[] sampleArray2 = {john,sara,adam,michael};

    Tests.testPrint(Humans.isHumanArraysEquals(finalArray2,sampleArray2), "Second");

    //selection of all unique different values from 2 arrays
    Human[] finalArray3 = Humans.joinHumansDistinctDifferentValues(inputArray1,inputArray2);
    Human[] sampleArray3 = {bill,walter,oscar,jessica,david,monica,mathew,stanley,rachel};

    Tests.testPrint(Humans.isHumanArraysEquals(finalArray3,sampleArray3), "Third");

    Human[] rightJoinArray = Humans.rightJoinHumansValues(inputArray1,inputArray2);
    Human[] rightJoinArrayTest = {john,sara,monica,mathew,adam,mathew,stanley,sara,michael,rachel,
            john,sara,adam,michael};

    Tests.testPrint(Humans.isHumanArraysEquals(rightJoinArray,rightJoinArrayTest), "Right join");
    }
}
 */