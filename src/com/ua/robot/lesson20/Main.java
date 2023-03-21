package com.ua.robot.lesson20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> dictionary = new HashMap<>();
        dictionary.put("річка", List.of("river", "川", "Fluss"));
        dictionary.put("сонце", List.of("sun", "太陽", "Sonne"));
        dictionary.put("яблуко", List.of("apple", "りんご", "Apfel"));
        dictionary.put("молоко", List.of("milk", "牛乳", "Milch"));
        dictionary.put("дерево", List.of("tree", "木", "Baum"));
        dictionary.put("книга", List.of("book", "本", "Buch"));
        dictionary.put("місто", List.of("city", "市", "Stadt"));
        dictionary.put("батько", List.of("father", "お父さん", "Vater"));
        dictionary.put("мама", List.of("mother", "お母さん", "Mutter"));
        dictionary.put("хліб", List.of("bread", "パン", "Brot"));
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        List<String> translations = dictionary.get(word);
        String englishTranslation = translations.get(0);
        System.out.println("Переклад слова \"" + word + "\" на англійську мову: " + englishTranslation);
        String japaneseTranslation = translations.get(1);
        System.out.println("Переклад слова \"" + word + "\" на японську мову: " + japaneseTranslation);
        String germanTranslation = translations.get(2);
        System.out.println("Переклад слова \"" + word + "\" на німецьку мову: " + germanTranslation);
    }
}
