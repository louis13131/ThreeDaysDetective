package ru.urfu;

import java.util.Scanner;

public class ProcessMain
{
    public void run(){
        ConsoleInteraction helloMessage = new ConsoleInteraction();
        helloMessage.print(Strings.helloMessage);
        ConsoleInteraction consoleInteraction = new ConsoleInteraction() ;
        ProcessCommand processCommand = new ProcessCommand();

        while(true){
            consoleInteraction.print("Введите команду: ");
            String instruction = consoleInteraction.getCommand();
            String answer = processCommand.getAnswerBeforeGame(instruction);
            consoleInteraction.print(answer);
            if (answer.equals("Игра началась")){
                Game game = new Game();
                consoleInteraction.print(Strings.welcomeMessage);
                while (true) {
                    consoleInteraction.print("Введите команду: ");
                    instruction = consoleInteraction.getCommand();
                    answer = game.processCommandInGame(instruction);
                    consoleInteraction.print(answer);

                    if  (answer.equals("Игра завершена")) {
                        break;
                    }
                }
            }
        }
    }

}
