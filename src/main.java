import java.util.Scanner;
import java.util.*;


    public class main {
        public static void main(String[] args) {
            int amount;
            System.out.println("Hello welcome to Blackjack, please enter in how much money you would like to start with: ");
            Scanner scan = new Scanner(System.in);
            amount = scan.nextInt();
            System.out.println("You will start with £" + amount);
            Deck deck = new Deck();

           // System.out.print(deck);
            deck.shuffle();
            System.out.print(deck);
           // System.out.println("\n");
           // System.out.print(deck.drawCard());
            //System.out.print(deck.drawCard());
            System.out.println("\n");
            Hand hand = new Hand(deck.drawCard(), deck.drawCard());
            System.out.print(hand);
            deck.getValue(deck.drawCard(), deck.drawCard());







        }
    }
