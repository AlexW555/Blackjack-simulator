import java.util.Scanner;
import java.util.*;


    public class main {
        public static void main(String[] args) {
            int amount;
            System.out.println("Hello welcome to Blackjack, please enter in how much money you would like to start with: ");
            Scanner scan = new Scanner(System.in);
            amount = scan.nextInt();
            System.out.println("You will start with £" + amount);

        }
    }
