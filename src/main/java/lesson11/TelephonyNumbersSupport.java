package lesson11;

import java.util.*;



public class TelephonyNumbersSupport {

    private static Map<String, String> list = new LinkedHashMap<>();
    public void get(String family){
        list.forEach((s, s2) -> {
            if (family.equals(s)){
                System.out.println( s + " " + s2);
            }
        });
    }
    public void add(String family, String number) {

        boolean check = false;
        for (String s: list.keySet()) {
            if (s.equals(family)) {
                check = true;
                continue;
            }
        }

        if (!check) {
            list.put(family, number);
        }
        else {
            String a = list.get(family) + " " + number;
            list.replace(family, a);
        }
    }
}
