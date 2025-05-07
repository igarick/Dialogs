import java.util.Scanner;

public abstract class AbstractDialog<T> implements Dialog<T> {

    protected final String title;
    protected final String error;
    protected final Scanner scanner = new Scanner(System.in);

    public AbstractDialog(String title, String error) {
        this.title = title;
        this.error = error;
    }
}
