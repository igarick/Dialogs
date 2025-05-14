package case2AlekseiRaketa;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;
import java.util.function.Function;

public abstract class AbstractDialog<T> implements Dialog<T> {

    protected final String title;
    protected final String error;
    protected final Function<String, T> mapper;
    protected final Scanner scanner = new Scanner(System.in);

    public AbstractDialog(String title, String error, Function<String, T> mapper) {
        this.title = title;
        this.error = error;
        this.mapper = mapper;
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
            try {
                T result = mapper.apply(input);
                if (isAllowed(result)) {
                    return result;
                }
            } catch (IllegalArgumentException e) {

            }
            showError();
        }
    }
//    @Override
//    public T input() {
//        while (true) {
//            showTitle();
//            String input = scanner.nextLine();
//
//            if (isTypeValid(input)) {
//                T result = parseInput(input);
//                if (isAllowed(result)) {
//                    return result;
//                }
//            }
//            showError();
//        }
//    }
    abstract protected boolean isAllowed(T result);

}
