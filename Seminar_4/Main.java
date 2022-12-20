package Seminar_4;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hiro", 150, new Staff());
        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("Man", 100, new Bow(), 20));
        red.add(new Archer("Alex", 100, new Bow(), 15));
        Team<Warrior> blue = new Team<>(hero1);
        blue.add(new Archer("Man", 100, new Bow(), 20));
        blue.add(new Mage("Alex", 100, new Staff(), 15, 30));
        System.out.println(red);
        System.out.println(blue);
    }
}
