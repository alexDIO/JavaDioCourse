package OwnClasses.Tests;

public class Tests {
    public static void testPrint(boolean check){
        if (check)
            System.out.println("Test passed");
        else
            System.out.println("Test failed");

    }

    public static void testPrint(boolean check, String text){
        if (check)
            System.out.println(text + " test passed");
        else
            System.out.println(text + " test failed");

    }
}
