package Seminar_7.DecoratorFactory.src.calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory calculableFactory2 = new CalculateFactory(calculableFactory, new Logger("Seminar_7/DecoratorFactory/src/calculator/log.txt"));
        ViewCalculator view = new ViewCalculator(calculableFactory2);
        view.run();
    }
}