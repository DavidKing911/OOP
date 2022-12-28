package Seminar_7.DecoratorFactory.src.calculator;

public class Calculate implements Calculable {
    
    private Calculable calc;
    private Loggable logger;

    public Calculate(Calculable calc, Loggable logger) {
        this.calc = calc;
        this.logger = logger;

    }

    @Override
    public Calculable sum(int arg) {
        logger.Log("Running sum " + arg);
        Calculable result = calc.sum(arg);
        logger.Log("Complete " + result.getResult());
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        logger.Log("Running multi " + arg);
        Calculable result = calc.multi(arg);
        logger.Log("Complete " + result.getResult());
        return result;
    }

    @Override
    public int getResult() {
        logger.Log("Get result: " );
        int result = calc.getResult();
        logger.Log("result: " + result);
        return result;
    }
    
}