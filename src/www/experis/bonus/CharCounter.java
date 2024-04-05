package www.experis.bonus;

import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la parola");
        String inputString = scanner.nextLine();
        char[] inputToCharArray = inputString.toCharArray();
        for (int i = 0, j = inputString.length() - 1; i < inputString.length(); i++ ,j--) {
            System.out.println("i = " + inputToCharArray[i]);
            System.out.println("j = " + inputToCharArray[j]);
        }
    }
}
