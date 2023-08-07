package homework.decorator;

import homework.controller.UserController;
import homework.log.Loggable;
import homework.model.Calculable;

public class CalculatorWithLogger implements Calculable {
    private Calculable calculator;
    private Loggable logger;

    public CalculatorWithLogger(Calculable calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public double sum(double arg1, double arg2) {
        logger.log("Вычисляю сумму");
        return calculator.sum(arg1, arg2);
    }

    @Override
    public double dif(double arg1, double arg2) {
        logger.log("Вычисляю разность");
        return calculator.dif(arg1, arg2);
    }

    @Override
    public double multi(double arg1, double arg2) {
        logger.log("Вычисляю произведение");
        return calculator.multi(arg1, arg2);
    }

    @Override
    public double div(double arg1, double arg2) {
        logger.log("Вычисляю деление");
        return calculator.div(arg1, arg2);
    }
}
