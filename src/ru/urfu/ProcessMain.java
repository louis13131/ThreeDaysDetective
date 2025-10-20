package ru.urfu;

import java.util.Scanner;

public class ProcessMain
{
    public static void run(){
        ConsoleInteraction helloMessage = new ConsoleInteraction();
        helloMessage.print(Strings.helloMessage);
        ConsoleInteraction consoleInteraction = new ConsoleInteraction() ;

        while(true){
            consoleInteraction.print("Введите команду: ");
            if (consoleInteraction.getAnswerBeforeGame().equals("Игра началась")){
                Game game = new Game();
                game.start();
            }

        }
    }

}
