public class Cat extends Animal implements SpeakAble, RunAble{

    public Cat(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String speak() {
        return "myau";
    }

    @Override
    public String run() {
        return "50 км/ч";
    }
    
}
