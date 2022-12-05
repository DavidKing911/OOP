public class Shark extends Animal implements SwimAble{
    
    public Shark(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String swim() {
        return "30 км/ч";
    }
}
