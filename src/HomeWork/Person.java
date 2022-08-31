package HomeWork;

public class Person{
    private String name;
    private String gender;

//    private String aLiveOrDead;
//    private String eyesColor;
//    private double weight;
//    private double height;

    @Override
    public String toString() {
        return
                "name = " + name + "\n" +
                "gender = " + gender ;
    }

    Person(){

    }
    Person(String name,  String gender/*, String aLiveOrDead, String eyesColor,
                   double weight, double height*/) {
        this.name = name;
        this.gender = gender;
//        this.aLiveOrDead = aLiveOrDead;
//        this.eyesColor = eyesColor;
//        this.weight = weight;
//        this.height = height;
    }


    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }



//    public String getaLiveOrDead() {
//        return aLiveOrDead;
//    }
//
//    void setALiveOrDead(String aLiveOrDead) {
//        this.aLiveOrDead = aLiveOrDead;
//    }
//
//    public String getEyesColor() {
//        return eyesColor;
//    }
//
//    void setEyesColor(String eyesColor) {
//        this.eyesColor = eyesColor;
//    }
//    public double  getWeight(){
//        return weight;
//    }
//    void setWeight(double weight){
//        this.weight = weight;
//    }
//    public double  getHeight(){
//        return height;
//    }
//    void setHeight(double height){
//        this.height = height;
//    }

}
