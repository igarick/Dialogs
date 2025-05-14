import java.util.List;

public class StringSelectDialog extends AbstractDialog<String> {

    private final List<String> keys;

    public StringSelectDialog(String title, String error, List<String> keys) {
        super(title, error);
        this.keys = keys;
    }

    @Override
    protected boolean isTypeValid(String input) {
        return true;
    }

    @Override
    protected String parseInput(String input) {
        return input;
    }

    @Override
    protected boolean isAllowed(String result) {
        for (String s : keys) {
            if (s.equalsIgnoreCase(result)) {
                return true;
            }
        }
        return false;
    }
}
