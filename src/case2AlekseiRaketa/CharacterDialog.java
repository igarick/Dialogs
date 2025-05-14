package case2AlekseiRaketa;

public class CharacterDialog extends AbstractDialog<Character> {

    public CharacterDialog(String title, String error) {
        super(title,
                error,
                s -> {
                    if (s.length() != 1) {
                        throw new IllegalArgumentException();
                    }
                    return s.charAt(0);
                }
        );
    }

//    @Override
//    protected Character parseInput(String input) {
//        if (input.length() != 1) {
//            throw new IllegalArgumentException();
//        }
//        return input.charAt(0);
//    }

    @Override
    protected boolean isAllowed(Character result) {
        return true;
    }
}
