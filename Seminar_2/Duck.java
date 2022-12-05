public class Duck extends Animal implements FlyAble, RunAble, SpeakAble, SwimAble{

    public Duck(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String fly() {
        return "90 км/ч";
    }

    @Override
    public String run() {
        return "10 км/ч";
    }

    @Override
    public String speak() {
        return "kra";
    }

    @Override
    public String swim() {
        return "5 км/ч";
    }
}
