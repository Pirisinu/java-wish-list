package www.experis.bonus;

import java.util.HashMap;
import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la parola");
        String inputString = scanner.nextLine();

        HashMap<Character, Integer> charCounterList = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            charCounterList.put(c, charCounterList.getOrDefault(c, 0) + 1);
        }
        for (char c : charCounterList.keySet()){
            System.out.println(c + "= " +charCounterList.get(c));
        }

    }
}
