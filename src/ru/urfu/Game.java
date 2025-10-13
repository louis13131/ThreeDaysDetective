package ru.urfu;

import java.util.Scanner;

public class Game {
    public static void start() {
        String welcome = Strings.welcomeMessage;
        System.out.println(welcome);
        Killer Lidia = new Killer(Strings.character1);
        Victim Dmitriy = new Victim(Strings.character2, "alive");
        Victim Anna = new Victim(Strings.character3, "alive");
        Victim Petr = new Victim(Strings.character4, "alive");
        Victim Grigoriy = new Victim(Strings.character5, "alive");

        Scanner input = new Scanner(System.in);

        while (true) {
            String instruction = input.next();
            switch (instruction) {
                case "/info":
                    String person = input.nextLine().substring(1);

                    switch (person) {
                        case "Лидия Черткова":
                            Lidia.getInfo();
                            break;
                        case "Дмитрий Орлов":
                            Dmitriy.getInfo();
                            break;
                        case "Анна Воронова":
                            Anna.getInfo();
                            break;
                        case "Пётр Воронов":
                            Petr.getInfo();
                            break;
                        case "Григорий Жаров":
                            Grigoriy.getInfo();
                            break;
                        default:
                            System.out.println("Такого персонажа не существует");


                    }
                    break;

                case "/help":
                    System.out.println(Strings.helpMessage);
                    break;
                case "/exit":
                    System.out.println("Игра завершена");
                    return;

                default:
                    System.out.println("Такой команды не существует");
            }
        }
    }

}
