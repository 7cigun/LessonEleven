package Lesson11;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    private static Map<String, Set<String>> phonesName = null;

    public PhoneBook() {
        phonesName = new TreeMap<>();
    }

    public static void add(String surname, String phoneNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }

    private static Set<String> getPhones(String surname) {
        Set<String> phones = phonesName.getOrDefault(surname, new HashSet<>());
        if (phones.isEmpty()) {
            phonesName.put(surname, phones);
        }

        return phones;

    }

    public static Set<String> get(String surname) {
        return getPhones(surname);
    }

    public static Set<String> getAllNames() {
        return phonesName.keySet();
    }

}
