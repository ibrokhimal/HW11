package lesson11;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //firstMethod();
        TelephonyNumbersSupport tel = new TelephonyNumbersSupport();
        tel.add("Timofei", "123");
        tel.add("Timofei", "32");
        tel.add("das", "121233");
        tel.add("12343", "1000");
        tel.get("Timofei");
    }

    private static void firstMethod() {
        // ое как но сделал прошу пон€ть и простить
        List<String> list = new ArrayList<>(Arrays.asList("BOB", "Hi", "Mark", "BOB",
                "FOR", "MY", "Mark", "Liens", "Kenya", "BOB",
                "Hi", "Mark", "BOB", "FOR", "MY", "Mark",
                "JOE", "Little", "York", "City", "Hulk", "Iron"));

        Iterator<String> iterator = list.iterator();
        Set<String> set = new HashSet<>();

        while (iterator.hasNext()) {
            set.add(iterator.next());
        }

        int[] count = new int[set.size()];
        int j = 0;
        for (String s: set) {
            for (int i = 1; i < list.size(); i++) {
                if (s.equals(list.get(i))) {
                    count[j]++;
                }
                if (count.length == set.size()){
                    continue;
                }
            }
            j++;
        }

        j = 0;
        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next() + " " + count[j]);
            j++;
        }
    }
}
