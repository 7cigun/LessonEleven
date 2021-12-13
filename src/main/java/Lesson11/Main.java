package Lesson11;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    private static final String[] NOT_UNIQUE_ARRAY = {"a", "a", "a", "b", "b", "c", "d", "d", "d", "e", "f", "g"};

    public static void main(String[] args) {

        Map<String, Integer> makeOriginal = new TreeMap<>();

        for (String element : NOT_UNIQUE_ARRAY) {
            Integer count = makeOriginal.get(element);
            if (count == null) {
                count = 0;
            }
            makeOriginal.put(element, ++count);
        }

        makeOriginal.forEach((word, frequency) -> System.out.printf("%s : %d%n", word, frequency));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Conor", "333-22-33");
        phoneBook.add("Conor", "222-33-22");
        phoneBook.add("Conor", "333-22-22");
        phoneBook.add("Reese", "333-22-22");
        phoneBook.add("T800", "888-88-88");
        phoneBook.add("T1000", "111-11-11");

        Set<String> allNames = phoneBook.getAllNames();
        for (String surname : allNames) {
            Set<String> phones = phoneBook.get(surname);
            System.out.printf("%s: %s%n", surname, phones);

        }

    }
}
