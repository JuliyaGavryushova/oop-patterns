package event;

import event.listener.impl.Subscriber;
import event.publisher.impl.HH;

public class JobSearch {
    public static void main(String[] args) {
        HH hh = new HH();
        hh.addVacancy("Middle Java");
        hh.addVacancy("Senior Java");

        hh.add(new Subscriber("Ivan"));
        hh.add(new Subscriber("Petr"));
        hh.add(new Subscriber("Sveta"));

        hh.addVacancy("Junior Java");
    }
}
