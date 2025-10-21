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
            String input = consoleInteraction.readLine();
            if (consoleInteraction.getAnswerBeforeGame(input).equals("Игра началась")){
                Game game = new Game();
                game.start();
            }

        }
    }

}
