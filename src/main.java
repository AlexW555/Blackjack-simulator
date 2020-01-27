import java.awt.*;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;
import java.util.*;


    public class main {

        public static int playerHandTotal;
        public static int dealerHandTotal;

        public static void main(String[] args) throws InterruptedException {
            int amount;
            System.out.println("Hello welcome to Blackjack, please enter in how much money you would like to start with: ");
            Scanner scan = new Scanner(System.in);
            amount = scan.nextInt();
            System.out.println("You will start with £" + amount);

            Deck deck = new Deck();
            deck.shuffle();
            System.out.print(deck);
            System.out.println("\n");


            Hand playerHand = new Hand(deck.drawCard(), deck.drawCard());
            Hand dealerHand = new Hand(deck.drawCard(), deck.drawCard());

            Player player1 = new Player(playerHand);
            Dealer dealer1 = new Dealer(dealerHand);

            player1.playerGetHandTotal();

            if (player1.decision()) {
                while (player1.play(deck.drawCard())) {
                    if (!player1.decision()) {
                        break;
                    }
                }
            }


            dealerHandTotal = dealer1.dealerGetHandTotal();
            while (dealerHandTotal <= 16) {
                dealerHandTotal = dealer1.play(deck.drawCard());
            }
        }
    }

