import java.util.List;
import java.util.Scanner;

public class StringSelectDialog extends AbstractDialog<String> {

    private final List<String> keys;

    public StringSelectDialog(String title, String error, List<String> keys) {
        super(title, error);
        this.keys = keys;
    }

    @Override
    public String input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(title);
            String input = scanner.nextLine();

            if (contains(input)) {
                return input;
            }

            System.out.println(error);
        }
    }

    private boolean contains(String key) {
        for (String s : keys) {
            if (s.equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }
}
