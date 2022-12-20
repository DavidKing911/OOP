package Seminar_4;

public class Mage extends Warrior {
    private Integer range;
    private Integer mana;

    public Mage(String name, Integer healthPoint, Weapon weapon, Integer range, Integer mana) {
        super(name, healthPoint, weapon);
        this.range = range;
        this.mana = mana;
    }
    
    @Override
    public String toString() {
        return String.format("Mage - %s, mana - %d, range - %d", super.toString(), mana, range);
    }
}
