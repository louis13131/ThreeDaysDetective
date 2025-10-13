package ru.urfu;

import java.util.Scanner;

public class ProcessMain
{
    public static void run(){
        String helloMessage = Strings.helloMessage;
        System.out.println(helloMessage);
        Scanner output = new Scanner(System.in);


        while(true){
            String text = output.nextLine();

            switch (text){
                case "/help":
                    System.out.println(Strings.helpMessage);
                    break;
                case "/start_game":
                    Game game = new Game();
                    game.start();
                    break;

                default:
                    System.out.println("Такой команды не существует");
            }
        }
    }
}
