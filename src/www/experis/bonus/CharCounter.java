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
            System.out.println(inputString.charAt(i));
        }

        System.out.println(charCounterList);
    }
}
