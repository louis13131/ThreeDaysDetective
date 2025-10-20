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

    public String readWord(){
        return scanner.next();
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
        String answer = "";
        String instruction = readWord();
        switch (instruction) {
            case "/info":
                String person = readLine().substring(1);

                switch (person) {
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
        print(answer);
        return answer;
    }

    public void print(String text){
        System.out.println(text);
    }
}