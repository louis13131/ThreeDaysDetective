package ru.urfu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsoleInteractionTest {

    @Test
    public void processCommandInGameHelpTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.processCommandInGame("/help",  game);
        Assertions.assertEquals(Strings.helpMessage, result);
    }

    @Test
    public void getAnswerInGameInfoLidiaTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.processCommandInGame("/info Лидия Черткова",  game);
        Assertions.assertEquals(game.lidiaChertkova.getInfo(), result);
    }

    @Test
    public void getAnswerInGameInfoAnnaTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.processCommandInGame("/info Анна Воронова",  game);
        Assertions.assertEquals(game.annaVoronova.getInfo(), result);
    }

    @Test
    public void getAnswerInGameInfoDmitriyTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.processCommandInGame("/info Дмитрий Орлов",  game);
        Assertions.assertEquals(game.dmitriyOrlov.getInfo(), result);
    }

    @Test
    public void getAnswerInGameInfoPetrTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.processCommandInGame("/info Пётр Воронов",  game);
        Assertions.assertEquals(game.petrVoronov.getInfo(), result);
    }

    @Test
    public void getAnswerInGameInfoGrigoriyTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.processCommandInGame("/info Григорий Жаров",  game);
        Assertions.assertEquals(game.grigoriyZharov.getInfo(), result);
    }

    @Test
    public void getAnswerInGameInfoIncorrectNameTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.processCommandInGame("/info Иван Иванов", game);
        Assertions.assertEquals("Такого персонажа не существует", result);
    }

    @Test
    public void getAnswerInGameExitTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.processCommandInGame("/exit",  game);
        Assertions.assertEquals("Игра завершена", result);
    }

    @Test
    public void getAnswerInGameIncorrectCommandTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.processCommandInGame("/incorrectCommand",  game);
        Assertions.assertEquals("Такой команды не существует", result);
    }

    @Test
    public void getAnswerBeforeHelpTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.getAnswerBeforeGame("/help");
        Assertions.assertEquals(Strings.helpMessage, result);
    }

    @Test
    public void getAnswerBeforeStartTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.getAnswerBeforeGame("/start_game");
        Assertions.assertEquals("Игра началась", result);
    }

    @Test
    public void getAnswerBeforeIncorrectTest() {
        Game game = new Game();
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String result = consoleInteraction.getAnswerBeforeGame("/not_comand");
        Assertions.assertEquals("Такой команды не существует", result);
    }
}
