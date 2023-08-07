package decorator.factory.calculator.log.impl;

import decorator.factory.calculator.log.Loggable;

import java.time.LocalDateTime;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.err.printf("%n%s : %s%n", LocalDateTime.now(), message);
    }
}
