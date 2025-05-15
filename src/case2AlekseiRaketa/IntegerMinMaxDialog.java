package case2AlekseiRaketa;

import java.util.function.Predicate;

public class IntegerMinMaxDialog extends AbstractDialog<Integer> {

    public IntegerMinMaxDialog(String title, String error, int min, int max) {
        super(title,
                error,
                Integer::parseInt,
                n -> n >= min && n <= max);
        // new MinMaxRealisater(min, max)); - создается объект вместо лямбды

    }

//             Аналог того, что происходит в "n -> n >= min && n <= max"
//    - создается класс в котором реализуется метод
//
//    private static class MinMaxRealisater implements Predicate<Integer> {
//
//      private final int min;
//      private final int max;
//
//        public MinMaxRealisater(int min, int max) {
//            this.min = min;
//            this.max = max;
//        }
//
//        @Override
//        public boolean test(Integer n) {
//            return n >= min && n <= max;
//        }
//    }
}
