package case1chuchaAndCo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        case1chuchaAndCo.Dialog<Integer> integerDialog = new case1chuchaAndCo.IntegerMinMaxDialog("Введи 0 - 10",
//        "Неверный ввод", 0, 10);
//        int input = integerDialog.input();
//        System.out.println(input);
//
//        List<String> keys = List.of("да", "нет");
//        case1chuchaAndCo.Dialog<String> stringDialog = new case1chuchaAndCo.StringSelectDialog("Введите да/нет",
//                "Неверный ввод", keys);
//        String input2 = stringDialog.input();
//        System.out.println(input2);

//        case1chuchaAndCo.Dialog<Character> russianCharacterDialog = new case1chuchaAndCo.RussianLetterDialog("Введите букву русского алфавита",
//                "Неверный ввод");
//        char input3 = russianCharacterDialog.input();
//        System.out.println(input3);
//
//        case1chuchaAndCo.Dialog<Character> englishCharacterDialog = new case1chuchaAndCo.EnglishLetterDialog("Введите букву английского алфавита",
//                "Неверный ввод");
//        char input4 = englishCharacterDialog.input();
//        System.out.println(input4);

        List<String> keys = List.of("ru", "en");
        Dialog<String> stringDialog = new StringSelectDialog("Введите ru для русской версии или en для английской",
                "Неверный ввод", keys);
        String languageKey = stringDialog.input();
        Dialog<Character> letterDialog;
        if (languageKey.equals("ru")) {
            letterDialog = new RussianLetterDialog("Введите букву русского алфавита",
                "Неверный ввод");
        } else {
            letterDialog = new EnglishLetterDialog("Введите букву английского алфавита",
                    "Неверный ввод");
        }

    Game game = new Game(letterDialog);
    game.start();
    }
    public static class Game {

        private Dialog<Character> letterDialog;

        public Game(Dialog<Character> letterDialog) {
            this.letterDialog = letterDialog;
        }

        public void start () {
            System.out.println(letterDialog.input());
        }
    }
}