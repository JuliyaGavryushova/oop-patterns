package decorator.factory.calculator;

import decorator.factory.calculator.dec.CalculableWithLoggerFactory;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
//        ICalculableFactory calculableFactory = new CalculableFactory();
//        CalculatorView view = new CalculatorView(calculableFactory);
//        view.run();

        ICalculableFactory calculableFactory = new CalculableWithLoggerFactory();
        CalculatorView view = new CalculatorView(calculableFactory);
        view.run();
    }
}
