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

    public String getAnswerInGame(Game game){
        print("Введите команду: ");
        String instruction = readLine();
        String answer = processCommandInGame(instruction, game);
        print(answer);
        return answer;

    }

    protected String processCommandInGame(String instruction, Game game){
        String[] parts = instruction.trim().split(" ", 2);
        String command = parts[0];  // Команда (первое слово)
        String argument = (parts.length > 1) ? parts[1] : "";
        String answer = "";
        switch (command) {
            case "/info":

                switch (argument) {
                    case "Лидия Черткова":
                        answer = game.lidiaChertkova.getInfo();
                        break;
                    case "Дмитрий Орлов":
                        answer = game.dmitriyOrlov.getInfo();
                        break;
                    case "Анна Воронова":
                        answer = game.annaVoronova.getInfo();
                        break;
                    case "Пётр Воронов":
                        answer = game.petrVoronov.getInfo();
                        break;
                    case "Григорий Жаров":
                        answer = game.grigoriyZharov.getInfo();
                        break;
                    default:
                        answer = "Такого персонажа не существует";


                }
                break;

            case "/help":
                answer = Strings.helpMessage;
                break;
            case "/exit":
                answer = "Игра завершена";
                break;

            default:
                answer = "Такой команды не существует";
        }
        return answer;
    }

    public void print(String text){
        System.out.println(text);
    }
}