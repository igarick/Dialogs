package case1chuchaAndCo;

public class RussianLetterDialog extends CharacterDialog{
    public RussianLetterDialog(String title, String error) {
        super(title, error);
    }

    @Override
    protected boolean isAllowed(Character result) {
        result = Character.toLowerCase(result);
        return result >= 'а' && result <= 'я' || result == 'ё';
    }
}
