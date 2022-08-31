package HomeWork;

public class Main {
    public static void main(String[]args){
        Person person1 = new Person("Adam","female");
        Person person2 = new Person("Eva","male");
        Person person3 = new Person("Kain","female");
        Person person03 = new Person("Avel","female");
        Person[] person ={person1,person2,person3,person03};
        Apartment apartment = new Apartment(person);
        Person person4 = new Person("James","female");
        Person person5 = new Person("Grace","male");
        Person person6 = new Person("Joshua","female");
        Person person7 = new Person("Mark","female");
        Person[] person0 ={person4,person5,person6,person7};
        Dormitory dormitory = new Dormitory(person0);
        Person person8  = new Person("Kent","female");
        Person person9  = new Person("Ada","male");
        Person person10 = new Person("Craig","gender");
        Person person11 = new Person("Annie","male");
        Person person12 = new Person("James","gender");
        Person[] people = {person8,person9,person10,person11,person12};
        Hotel hotel = new Hotel(people);

        apartment.getInfo();
        apartment.whatDoesHeDo();
        apartment.rent();


        dormitory.getInfo();
        dormitory.rent();
        dormitory.whatDoesHeDo();

        hotel.getInfo();
        hotel.utilities();
        hotel.whatDoesHeDo();
    }
}
