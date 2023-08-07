package decorator.factory.calculator.dec;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.Calculator;
import decorator.factory.calculator.ICalculableFactory;
import decorator.factory.calculator.log.impl.ConsoleLogger;

public class CalculableWithLoggerFactory implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLogger(new Calculator(primaryArg), new ConsoleLogger());
    }
}
