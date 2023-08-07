package homework.controller;

import homework.model.Calculable;
import homework.model.Calculator;

public class UserController {
    private Calculable calculable;

    public UserController(Calculable calculable) {
        this.calculable = calculable;
    }


    public double sumArg(double arg1, double arg2) {
        return calculable.sum(arg1, arg2);
    }

    public double difArg(double arg1, double arg2) {
        return calculable.dif(arg1, arg2);
    }

    public double multiArg(double arg1, double arg2) {
        return calculable.multi(arg1, arg2);
    }

    public double divArg(double arg1, double arg2) {
        return calculable.div(arg1, arg2);
    }
}
