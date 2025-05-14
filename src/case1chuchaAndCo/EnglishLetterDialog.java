package case1chuchaAndCo;

public class EnglishLetterDialog extends CharacterDialog{

    public EnglishLetterDialog(String title, String error) {
        super(title, error);
    }

    @Override
    protected boolean isAllowed(Character result) {
        result = Character.toLowerCase(result);
        return result >= 'a' && result <= 'z';
    }
}
