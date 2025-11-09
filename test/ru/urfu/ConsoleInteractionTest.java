package ru.urfu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsoleInteractionTest {

    @Test
    public void processCommandInGameHelpTest() {
        Game game = new Game();
        String result = game.processCommandInGame("/help");
        Assertions.assertEquals(Strings.helpMessage, result);
    }

    @Test
    public void getAnswerInGameInfoLidiaTest() {
        Game game = new Game();
        String result = game.processCommandInGame("/info Лидия Черткова");
        String expected = String.format("--- Информация о %s %s --- \n%s лет \nРод занятий: %s \nОписание: %s \nМотив: %s", Strings.lidia);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getAnswerInGameInfoAnnaTest() {
        Game game = new Game();
        String result = game.processCommandInGame("/info Анна Воронова");
        String expected = String.format("--- Информация о %s %s --- \n%s лет \nРод занятий: %s \nОписание: %s \nМотив: %s", Strings.anna);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getAnswerInGameInfoDmitriyTest() {
        Game game = new Game();
        String result = game.processCommandInGame("/info Дмитрий Орлов");
        String expected = String.format("--- Информация о %s %s --- \n%s лет \nРод занятий: %s \nОписание: %s \nМотив: %s", Strings.dmitriy);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getAnswerInGameInfoPetrTest() {
        Game game = new Game();
        String result = game.processCommandInGame("/info Пётр Воронов");
        String expected = String.format("--- Информация о %s %s --- \n%s лет \nРод занятий: %s \nОписание: %s \nМотив: %s", Strings.petr);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getAnswerInGameInfoGrigoriyTest() {
        Game game = new Game();
        String result = game.processCommandInGame("/info Григорий Жаров");
        String expected = String.format("--- Информация о %s %s --- \n%s лет \nРод занятий: %s \nОписание: %s \nМотив: %s", Strings.grigoriy);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getAnswerInGameInfoIncorrectNameTest() {
        Game game = new Game();
        String result = game.processCommandInGame("/info Иван Иванов");
        Assertions.assertEquals("Такого персонажа не существует", result);
    }

    @Test
    public void getAnswerInGameExitTest() {
        Game game = new Game();
        String result = game.processCommandInGame("/exit");
        Assertions.assertEquals("Игра завершена", result);
    }

    @Test
    public void getAnswerInGameIncorrectCommandTest() {
        Game game = new Game();
        String result = game.processCommandInGame("/incorrectCommand");
        Assertions.assertEquals("Такой команды не существует", result);
    }

    @Test
    public void getAnswerInGameStart_gameTest() {
        Game game = new Game();
        String result = game.processCommandInGame("/start_game");
        Assertions.assertEquals("Игра уже началась", result);
    }

    @Test
    public void getAnswerBeforeHelpTest() {
        ProcessCommand processCommand = new ProcessCommand();
        String result = processCommand.getAnswerBeforeGame("/help");
        Assertions.assertEquals(Strings.helpMessage, result);
    }

    @Test
    public void getAnswerBeforeStartTest() {
        ProcessCommand processCommand = new ProcessCommand();
        String result = processCommand.getAnswerBeforeGame("/start_game");
        Assertions.assertEquals("Игра началась", result);
    }

    @Test
    public void getAnswerBeforeIncorrectTest() {
        ProcessCommand processCommand = new ProcessCommand();
        String result = processCommand.getAnswerBeforeGame("/not_comand");
        Assertions.assertEquals("Такой команды не существует", result);
    }
}

