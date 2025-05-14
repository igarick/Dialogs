import java.util.Scanner;

public abstract class AbstractDialog<T> implements Dialog<T> {

    protected final String title;
    protected final String error;
    protected final Scanner scanner = new Scanner(System.in);

    public AbstractDialog(String title, String error) {
        this.title = title;
        this.error = error;
    }

    protected void showTitle() {
        System.out.println(title);
    }

    protected void showError() {
        System.out.println(error);
    }

    @Override
    public T input() {
        while (true) {
            showTitle();
            String input = scanner.nextLine();

            if (isTypeValid(input)) {
                T result = parseInput(input);
                if (isAllowed(result)) {
                    return result;
                }
            }
            showError();
        }
    }

    abstract protected boolean isTypeValid(String input);

    abstract protected T parseInput(String input);

    abstract protected boolean isAllowed(T result);


}
