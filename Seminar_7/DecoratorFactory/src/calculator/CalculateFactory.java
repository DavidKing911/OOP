package Seminar_7.DecoratorFactory.src.calculator;

public class CalculateFactory implements ICalculableFactory {
    ICalculableFactory iCalculableFactory;
    Loggable logger;

    public CalculateFactory(ICalculableFactory iCalculableFactory, Loggable logger) {
        this.iCalculableFactory = iCalculableFactory;
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new Calculate(iCalculableFactory.create(primaryArg), logger);
    }

}