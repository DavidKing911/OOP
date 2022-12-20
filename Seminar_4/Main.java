package Seminar_4;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Железный Человек", 200, new Staff(), new HeavyShield());
        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("Человек Паук", 100, new Bow(), new BucklerShield(), 10));
        red.add(new Archer("Дэдпул", 150, new Bow(), 10));
        red.add(new Archer("Сорвиголова", 150, new LongBow(), new BucklerShield(), 10));
        Hero hero2 = new Hero("Капитан Америка", 200, new Bow(), new HeavyShield());
        Team<Mage> blue = new Team<>(hero2);
        blue.add(new Mage("Черная Вдова", 100, new Staff(), new RoundShield(), 15, 100));
        blue.add(new Mage("Халк", 150, new Staff(), new RoundShield(), 15, 100));
        blue.add(new Mage("Соколиный Глаз", 130, new Staff(), 15, 100));
        Hero hero3 = new Hero("Капитан Марвел", 200, new Bow());
        Team<Warrior> multi = new Team<>(hero3);
        multi.add(new Mage("Доктор Стрэндж", 143, new Staff(), new RoundShield(), 15, 100));
        multi.add(new Archer("Тор", 172, new Bow(), new BucklerShield(), 10));
        multi.add(new Archer("Алая Ведьма", 120, new Bow(), new BucklerShield(), 10));
        System.out.println(red);
        System.out.println(blue);
        System.out.println(multi);
        System.out.println(red.getTeamHealthPoint());
        System.out.println(blue.getTeamHealthPoint());
        System.out.println(multi.getTeamHealthPoint());

    }
}