package OwnClasses.Human;

import OwnClasses.Human.Humans;
public class HumanDelegate{
    private final Humans resource;

    public HumanDelegate(Humans resource){
        this.resource = resource;
    }

    public Human[] rightJoinHumansValues(Human[] leftArray, Human[] rightArray) {
        System.out.println("Method realised via delegate");
        return resource.rightJoinHumansValues(leftArray,rightArray);
    }
}
