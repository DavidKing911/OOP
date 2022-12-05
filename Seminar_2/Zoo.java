import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(
          new Fish("Dori", "seld", "black", 0, 2)
        , new Cat("Barsik", "vislauh", "black", 4, 6)
        , new Dog("Sharik", "ratveiler", "brown", 4, 2)
        , new Duck("kru", "rate", "white", 2, 1)
        , new Shark("sharky", "killer whale", "black", 0, 7)));
    }

    public void talk() {
        for (SpeakAble item : getSpeakAble()) {
            System.out.printf("%s\n", item.speak());
        }
    }
    public List<SpeakAble> getSpeakAble() {
        List<SpeakAble> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof SpeakAble) {
                result.add((SpeakAble)speakItem);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<RunAble> getRunAble() {
        List<RunAble> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof RunAble) {
                result.add((RunAble)speakItem);
            }
        }
        return result;
    }

    public List<FlyAble> getFlyAble() {
        List<FlyAble> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof FlyAble) {
                result.add((FlyAble)speakItem);
            }
        }
        return result;
    }

    public List<SwimAble> getSwimAble() {
        List<SwimAble> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof SwimAble) {
                result.add((SwimAble)speakItem);
            }
        }
        return result;
    }

    public void run() {
        for (RunAble item : getRunAble()) {
            System.out.printf("%s %s\n", item.toString(), item.run());
        }
    }

    public void fly() {
        for (FlyAble item : getFlyAble()) {
            System.out.printf("%s %s\n", item.toString(), item.fly());
        }
    }

    public void swim() {
        for (SwimAble item : getSwimAble()) {
            System.out.printf("%s %s\n", item.toString(), item.swim());
        }
    }
}
