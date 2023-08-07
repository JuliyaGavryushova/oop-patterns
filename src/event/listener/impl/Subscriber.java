package event.listener.impl;

import event.listener.Listener;

import java.util.List;

public class Subscriber implements Listener {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancy) {
        System.out.printf("Dear %s!%n We have some changes in vacancies:%s%n", name, vacancy);
        System.out.printf("%n====================================%n");
    }
}
