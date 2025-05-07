import java.util.Scanner;

public class IntegerMinMaxDialog extends AbstractDialog<Integer> {

    private final int min;
    private final int max;

    public IntegerMinMaxDialog(String title, String error, int min, int max) {
        super(title, error);
        this.min = min;
        this.max = max;
    }

    @Override
    public Integer input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(title);
            String input = scanner.nextLine();

            if (isInteger(input)) {
                int result = Integer.parseInt(input);
                if (result >= min && result <= max) {
                    return result;
                }
            }
            System.out.println(error);
        }

    }


    private boolean isInteger(String input) {
        try {
            int result = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
