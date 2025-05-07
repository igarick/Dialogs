import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Dialog<Integer> integerDialog = new IntegerMinMaxDialog("Введи 0 - 10",
//        "Неверный ввод", 0, 10);
//        int input = integerDialog.input();
//        System.out.println(input);

        List<String> keys = List.of("да", "нет");
        Dialog<String> stringDialog = new StringSelectDialog("Введите да/нет",
                "Неверный ввод", keys);
        String input = stringDialog.input();
        System.out.println(input);
    }
}