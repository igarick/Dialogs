package case2AlekseiRaketa;

import java.util.function.Function;

public class Main1 {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        function.apply("asd");
//        Function<String, Integer> function = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        };


        System.out.println(function.apply("asd"));

    }

}
