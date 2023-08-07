package homework;


import homework.controller.UserController;
import homework.decorator.CalculatorWithLogger;
import homework.log.Loggable;
import homework.log.impl.ConsoleLogger;
import homework.model.Calculable;
import homework.model.Calculator;
import homework.view.UserView;

public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController(new Calculator());
        UserView calculator = new UserView(controller);
        calculator.run();

//        Calculable calculable = new Calculator();
//        Loggable logger = new ConsoleLogger();
//        Calculable calculable1 = new CalculatorWithLogger(calculable, logger);
//        UserController controller = new UserController(calculable1);
//        UserView calculator = new UserView(controller);
//        calculator.run();


    }
}
