package decorator.factory.calculator.dec;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.log.Loggable;

public class CalculatorLogger implements Calculable {
    private Calculable calculator;
    private Loggable logger;

    public CalculatorLogger(Calculable calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Вичисляю сумму чисел: %d %d", calculator.getResult(), arg));
        return calculator.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Умножаю числа: %d %d", calculator.getResult(), arg));
        return calculator.multi(arg);
    }

    @Override
    public int getResult() {
        logger.log(String.format("Результат = %d", calculator.getResult()));
        return calculator.getResult();
    }
}
