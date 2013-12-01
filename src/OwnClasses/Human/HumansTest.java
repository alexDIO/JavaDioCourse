package OwnClasses.Human;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumansTest {

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

    @Test
    public void testRightJoinHumansValues() throws Exception {

        Human[] inputArray1 = {walter,adam,sara};
        Human[] inputArray2 = {john,bill,sara};

        Human[] sampleArray = {sara,john,bill,sara};

        Humans testHumans = new Humans();

        Human[] returnArray = testHumans.rightJoinHumansValues(inputArray1,inputArray2);

        assertEquals(sampleArray, returnArray);
    }

    @Test
    public void testJoinHumansDistinctValues() throws Exception {
        Human[] inputArray1 = {walter,adam,sara};
        Human[] inputArray2 = {john,bill,sara,sara,bill};

        Human[] sampleArray = {walter,adam,sara,john,bill};

        Humans testHumans = new Humans();

        Human[] returnArray = testHumans.joinHumansDistinctValues(inputArray1,inputArray2);

        assertEquals(sampleArray, returnArray);
    }

    @Test
    public void testJoinHumansDistinctCommonValues() throws Exception {
        Human[] inputArray1 = {walter,adam,sara};
        Human[] inputArray2 = {john,bill,adam,sara};

        Human[] sampleArray = {adam,sara};

        Humans testHumans = new Humans();

        Human[] returnArray = testHumans.joinHumansDistinctCommonValues(inputArray1,inputArray2);

        assertEquals(sampleArray, returnArray);
    }

    @Test
    public void testJoinHumansDistinctDifferentValues() throws Exception {
        Human[] inputArray1 = {walter,adam,sara};
        Human[] inputArray2 = {john,bill,sara};

        Human[] sampleArray = {walter,adam,john,bill};

        Humans testHumans = new Humans();

        Human[] returnArray = testHumans.joinHumansDistinctDifferentValues(inputArray1,inputArray2);

        assertEquals(sampleArray, returnArray);
    }

    @Test
    public void testJoinHumansValues() throws Exception {
        Human[] inputArray1 = {walter,adam,sara};
        Human[] inputArray2 = {john,bill,sara};

        Human[] sampleArray = {walter,adam,sara,john,bill,sara};

        Humans testHumans = new Humans();

        Human[] returnArray = testHumans.joinHumansValues(inputArray1,inputArray2);

        assertEquals(sampleArray, returnArray);
    }

    @Test
    public void testJoinHumansCommonValues() throws Exception {
        Human[] inputArray1 = {walter,adam,sara,sara};
        Human[] inputArray2 = {john,bill,adam,sara,sara};

        Human[] sampleArray = {adam,sara,sara,sara,sara};

        Humans testHumans = new Humans();

        Human[] returnArray = testHumans.joinHumansCommonValues(inputArray1,inputArray2);

        assertEquals(sampleArray, returnArray);
    }

    @Test
    public void testJoinHumansDifferentValues() throws Exception {
        Human[] inputArray1 = {walter,sara,sara};
        Human[] inputArray2 = {john,bill,adam,sara,sara};

        Human[] sampleArray = {walter,john,bill,adam};

        Humans testHumans = new Humans();

        Human[] returnArray = testHumans.joinHumansDifferentValues(inputArray1,inputArray2);

        assertEquals(sampleArray, returnArray);
    }
    @Test
    public void testJoinHumansDifferentValuesDuplicates1() throws Exception {
        Human[] inputArray1 = {john,sara};
        Human[] inputArray2 = {john,bill,adam,sara,sara};

        Human[] sampleArray = {bill,adam};

        Humans testHumans = new Humans();

        Human[] returnArray = testHumans.joinHumansDifferentValues(inputArray1,inputArray2);

        assertEquals(sampleArray, returnArray);
    }
    @Test
    public void testJoinHumansDifferentValuesDuplicates2() throws Exception {
        Human[] inputArray1 = {john,bill,adam,sara,sara};
        Human[] inputArray2 = {john,sara};

        Human[] sampleArray = {bill,adam};

        Humans testHumans = new Humans();

        Human[] returnArray = testHumans.joinHumansDifferentValues(inputArray1,inputArray2);

        assertEquals(sampleArray, returnArray);
    }

    @Test
    public void testSelectDistinctFromArray() throws Exception {
        Human[] inputArray = {john,bill,adam,sara,sara,walter,john,bill};

        Human[] sampleArray = {john,bill,adam,sara,walter};

        Humans testHumans = new Humans();

        Human[] returnArray = testHumans.selectDistinctFromArray(inputArray);

        assertEquals(sampleArray, returnArray);
    }
}
