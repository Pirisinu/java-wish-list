package www.experis.wishList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to you're wish list.");
        boolean exit = false;
        List<Gift> wishList = new ArrayList<Gift>();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Do you want to include a gift? Y/N:");
            String choice = scan.nextLine();
            switch (choice){
                case "y":

                    break;
                case "N":
                    exit = true
                    break;
                default:
                    System.out.println("Choise not valid.");
                    break;
            }

            System.out.println(wishList.size());
            exit = true;

        } while (!exit);
    }
}
