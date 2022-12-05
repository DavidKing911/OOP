public class Fish extends Animal implements SwimAble{

    public Fish(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String swim() {
        return "20 км/ч";
    }
}
