package homework.view;

import homework.controller.UserController;

import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        double arg1 = promptDouble("Введите первый аргумент: ");
        while (true) {
            String cmd = prompt("Введите команду (+, -, *, /) : ");
            double arg2 = promptDouble("Введите второй аргумент: ");
            if (cmd.equals("+")) {
                System.out.println("Результат: " + userController.sumArg(arg1, arg2));
                break;
            }
            if (cmd.equals("-")) {
                System.out.println("Результат: " + userController.difArg(arg1, arg2));
                break;
            }
            if (cmd.equals("*")) {
                System.out.println("Результат: " + userController.multiArg(arg1, arg2));
                break;
            }
            if (cmd.equals("/")) {
                System.out.println("Результат: " + userController.divArg(arg1, arg2));
                break;
            }
        }

    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
