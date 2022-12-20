package Seminar_4;

public class Archer extends Warrior{
    private Integer range;

    public Integer getRange() {
        return range;
    }

    public Archer(String name, Integer healthPoint, Weapon weapon, Integer range) {
        super(name, healthPoint, weapon);
        this.range = range;
    }  

    @Override
    public String toString() {
        return String.format("Archer - %s, range - %d", super.toString(), range);
    }
}
