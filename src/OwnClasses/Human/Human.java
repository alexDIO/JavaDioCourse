package OwnClasses.Human;

import java.util.Comparator;
//method equals compares only name and age, without profession
public class Human {

    private final String name;
    private final int age;
    private final String profession;

    private Human(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.profession=builder.profession;
    }

    public static class Builder{
        private String name;
        private int age;
        private String profession;

        public Builder(){
            this.build();
        }

        public Builder(Human original){
            this.name=original.name;
            this.age=original.age;
            this.profession=original.profession;
        }

        public Builder name (String name){
            this.name=name;
            return this;
        }

        public Builder age (int age){
            this.age=age;
            return this;
        }
        public Builder profession (String profession){
            this.profession=profession;
            return this;
        }

        public Human build(){
            return new Human(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (!name.equals(human.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

 }




class SortHumanByAgeAndName implements Comparator<Human>{
    public int compare(Human human1, Human human2) {

        int age1 = human1.getAge();
        int age2 = human2.getAge();

        if(age1 > age2) {
            return 1;
        }
        else if(age1 < age2) {
            return -1;
        }
        else {
            String name1 = human1.getName();
            String name2 = human2.getName();

            return name1.compareTo(name2);
        }
    }
}
