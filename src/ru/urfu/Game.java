package ru.urfu;

public class Game {
    private Killer lidiaChertkova;
    private Victim dmitriyOrlov;
    private Victim annaVoronova;
    private Victim petrVoronov;
    private Victim grigoriyZharov;

    public Game(){
        lidiaChertkova = new Killer(Strings.lidia);
        dmitriyOrlov = new Victim(Strings.dmitriy);
        annaVoronova = new Victim(Strings.anna);
        petrVoronov = new Victim(Strings.petr);
        grigoriyZharov = new Victim(Strings.grigoriy);
    }

    private String[] stringParsing(String instruction){
        return instruction.trim().split(" ", 2);
    }

    public String processCommandInGame(String instruction){
        String[] parts = stringParsing(instruction);
        String comand = parts[0];
        String argument = (parts.length > 1) ? parts[1] : "";
        String answer = "";
        switch (comand) {
            case "/info":

                switch (argument) {
                    case "Лидия Черткова":
                        answer = lidiaChertkova.getInfo();
                        break;
                    case "Дмитрий Орлов":
                        answer = dmitriyOrlov.getInfo();
                        break;
                    case "Анна Воронова":
                        answer = annaVoronova.getInfo();
                        break;
                    case "Пётр Воронов":
                        answer = petrVoronov.getInfo();
                        break;
                    case "Григорий Жаров":
                        answer = grigoriyZharov.getInfo();
                        break;
                    default:
                        answer = "Такого персонажа не существует";


                }
                break;

            case "/help":
                answer = Strings.helpMessage;
                break;
            case "/start_game":
                answer = "Игра уже началась";
                break;
            case "/exit":
                answer = "Игра завершена";
                break;

            default:
                answer = "Такой команды не существует";
        }
        return answer;
    }
}
