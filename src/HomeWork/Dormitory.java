package HomeWork;

import java.util.Arrays;

public class Dormitory  extends Person   implements Interface{
private Person[] family;
    public Dormitory(Person[] family){
        this.family = family;
    }


    public void rent(){
        System.out.println("rent for dormitory");
    }


    void getInfo() {
        System.out.println("how many people lives in dormitory "+family.length);
        for (Person i:family) {
            System.out.println(i);
            System.out.println("------------------------------------------");
        }

    }


    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "family=" + Arrays.toString(family) +
                '}';
    }

    @Override
    public void whatDoesHeDo() {

    }
}
