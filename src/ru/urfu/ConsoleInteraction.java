package ru.urfu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleInteraction {
    private Scanner scanner;

    public ConsoleInteraction() {
        scanner = new Scanner(System.in);
    }

    public String readLine(){
        return scanner.nextLine();
    }

    public String getAnswerBeforeGame(){
        String input = readLine();
        String answer = "";
        switch (input){
            case "/help":
                System.out.println(Strings.helpMessage);
                break;
            case "/start_game":
                answer = "Игра началась";
                break;

            default:
                System.out.println("Такой команды не существует");
        }
        return answer;
    }

    public String GetAnswerInGame(){
        String input = readLine();
        String answer = "";
        return answer;
    }

    public void print(String text){
        System.out.println(text);
    }
}