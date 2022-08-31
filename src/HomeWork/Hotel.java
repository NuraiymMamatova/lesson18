package HomeWork;

import java.util.Arrays;

public class Hotel extends Person implements Interface{

    private Person[] family;
    Hotel(Person[] family){
        this.family = family;
    }
    void utilities(){
        System.out.println("utilities for hotel");
    }

    @Override
    public String toString() {
        return "Hotel" +
                "family =" + Arrays.toString(family) ;
    }

    void getInfo() {
        System.out.println("how many people lives in hotel "+family.length);
        for (Person i:family) {
            System.out.println(i);
            System.out.println("------------------------------------------");

        }

    }

    @Override
    public void whatDoesHeDo() {

    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }
}
