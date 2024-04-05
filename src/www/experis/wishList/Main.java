package www.experis.wishList;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to you're wish list.");
        boolean exit = false;
        List<Gift> wishList = new ArrayList<Gift>();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Do you want to include a gift? Y/N:");
            String choice = scan.nextLine();
            switch (choice.toUpperCase()){
                case "Y":
                    System.out.print("Insert gift name: ");
                    String giftName = scan.nextLine();
                    Gift gift = new Gift(giftName);
                    wishList.add(gift);
                    System.out.print("Length of wish list: ");
                    System.out.println(wishList.size());
                    break;
                case "N":
                    exit = true;
                    break;
                default:
                    System.out.println("Choise not valid.");
                    break;
            }

        } while (!exit);
        scan.close();

        System.out.println("-----------------------");
        System.out.print("Final length wish list: ");
        System.out.println(wishList.size());
        System.out.println("-----------------------");
        System.out.print("Wish list tostring(): ");
        System.out.println(wishList);
        System.out.println("-----------------------");
        System.out.println("Wish list enhanced for:");
        for (Gift g : wishList){
            System.out.println(g);
        }
        System.out.println("-----------------------");

        // Write on file

        try(FileWriter writer = new FileWriter("resources/wishList.txt")){
            for (Gift g : wishList){
                if (g != null){
                    writer.write(g.toString()+"\n");
                }
            }
        } catch (IOException e){
            System.out.println("An error occurred while writing to the file.");
        }
    }

}
