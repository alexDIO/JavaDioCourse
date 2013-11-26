package classWorks;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 26.11.13
 * Time: 10:25
 * To change this template use File | Settings | File Templates.
 */

import OwnClasses.Human.*;

public class lesson05 {

    public static void main(String[] args)
    {

    Human ivan = new Human.Builder()
            .name("Ivan")
            .age(56)
            .profession("dvornick")
            .build();

        Human john = new Human.Builder ("John", 20 ,"Tailor");
        Human bill = new Human("Bill", 33, "Baker");
        Human sara = new Human("Sara", 25);


        Human[] inputArray1 = {john,bill,sara,walter,adam,sara,michael,oscar,jessica,david};
        Human[] inputArray2 = {john,sara,monica,mathew,adam,mathew,stanley,sara,michael,rachel};

    }

}
