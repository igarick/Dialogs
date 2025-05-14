package case2AlekseiRaketa;

public class IntegerMinMaxDialog extends AbstractDialog<Integer> {

    private final int min;
    private final int max;

    public IntegerMinMaxDialog(String title, String error, int min, int max) {
        super(title,
                error,
                s -> Integer.parseInt(s));
        this.min = min;
        this.max = max;
    }

    @Override
    protected boolean isAllowed(Integer result) {
        return result >= min && result <= max;
    }
}
