package HomeWork;

import java.util.Arrays;

public class Apartment extends Person implements Interface {

    private Person[] family;
    Apartment(Person[] family){
        this.family = family;
    }
    void rent(){
        System.out.println("rent for apartment");
    }


    void getInfo(){
        System.out.println("how many people lives in apartment "+family.length);
        for (Person i:family) {
            System.out.println(i);
            System.out.println("------------------------------------------");
        }

    }


    public Person[] getFamily(){
        return family;
    }
    public void setFamily(Person[] family){
        this.family = family;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "family=" + Arrays.toString(family) +
                '}';
    }

    @Override
    public void whatDoesHeDo() {

    }
}
