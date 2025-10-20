package ru.urfu;

import java.io.Console;
import java.util.Scanner;

public class Game {
    Killer lidiaChertkova;
    Victim dmitriyOrlov;
    Victim annaVoronova;
    Victim petrVoronov;
    Victim grigoriyZharov;

    public Game(){
        lidiaChertkova = new Killer(Strings.lidia);
        dmitriyOrlov = new Victim(Strings.dmitriy, "alive");
        annaVoronova = new Victim(Strings.anna, "alive");
        petrVoronov = new Victim(Strings.petr, "alive");
        grigoriyZharov = new Victim(Strings.grigoriy, "alive");
    }

    public void start() {
        String welcome = Strings.welcomeMessage;
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        consoleInteraction.print(welcome);

        while (true) {
            String answer = consoleInteraction.getAnswerInGame(this);

            if  (answer.equals("Игра завершена")) {
                break;
            }
        }
    }

}
