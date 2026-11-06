package ru.alfabank.tasks_w11.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ValidateLogin {
    static void main() {
        Predicate<String> isEmpty= s->s.trim().isEmpty();
        Predicate<String> isCorrectLength=s->s.trim().length()>=3&&s.trim().length()<=16;
        Predicate<String> isAllowedChars=s->s.matches("[a-zA-Z0-9_]+");
        Predicate<String> isValid=isEmpty.negate().and(isCorrectLength.and(isAllowedChars));

        //test1
        List<String> words1=new ArrayList<>(Arrays.asList("ab","user_01"," verylongnameeeeeee ","okay"));
        words1.removeIf(isValid.negate());
        System.out.println(words1);

        //test2
        List<String> words2=new ArrayList<>(Arrays.asList("", " "));
        words2.removeIf(isValid.negate());
        System.out.println(words2);
    }
}
