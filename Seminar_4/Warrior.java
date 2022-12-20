package Seminar_4;

public class Warrior {
    private String name;
    private Integer healthPoint;
    private Weapon weapon;
    
    public Warrior(String name, Integer healthPoint, Weapon weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", weapon, name, healthPoint);
    }
}
