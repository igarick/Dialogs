package case2AlekseiRaketa;

import java.util.List;

public class CharacterDialog extends AbstractDialog<Character> {

    public CharacterDialog(String title, String error) {
        super(title,
                error,
                s -> {
                    if (s.length() != 1) {
                        throw new IllegalArgumentException();
                    }
                    return s.charAt(0);
                },
                c -> true
        );
    }
}
