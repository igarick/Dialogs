package case1chuchaAndCo;

public class CharacterDialog extends AbstractDialog<Character>{

    public CharacterDialog(String title, String error) {
        super(title, error);
    }

    @Override
    protected boolean isTypeValid(String input) {
        return input.length() == 1;
    }

    @Override
    protected Character parseInput(String input) {
        return input.charAt(0);
    }

    @Override
    protected boolean isAllowed(Character result) {
        return true;
    }
}
