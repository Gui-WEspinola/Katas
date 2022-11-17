package Katas.Kyu6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Character[] characters = new Character[text.length()];
        List<String> inputText = Stream.of(text).collect(Collectors.toList());

        System.out.println(inputText);

        return 0;
    }
}