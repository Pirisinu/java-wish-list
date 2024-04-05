package www.experis.wishList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to you're wish list.");
        boolean exit = false;
        List<Gift> wishList = new ArrayList<Gift>();

        do {
            System.out.println(wishList.size());
            exit = true;

        } while (!exit);
    }
}
