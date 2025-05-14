package case2AlekseiRaketa;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dialog<Integer> integerDialog = new IntegerMinMaxDialog("Введи 0 - 10",
        "Неверный ввод", 0, 10);
        int input = integerDialog.input();
        System.out.println(input);

        Dialog<Character> characterDialog = new CharacterDialog("Введите char",
                "Неверный ввод");
        char input3 = characterDialog.input();
        System.out.println(input3);
    }
}
