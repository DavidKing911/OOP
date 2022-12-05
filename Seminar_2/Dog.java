public class Dog extends Animal implements SpeakAble, RunAble{

    public Dog(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String speak() {
        return "gav";
    }
    
    @Override
    public String run() {
        return "50 км/ч";
    }
}
