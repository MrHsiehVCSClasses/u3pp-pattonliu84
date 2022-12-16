package u3pp;
import java.util.Scanner;

public class Blackjack {
    private Deck myDeck = new Deck();
    private Card[] user;
    private Card[] dealer;
    private boolean boPlay;


    public BlackJack {
    Deck myDeck = new Deck();
    Card[] user = new Card[15];
    Card[] dealer = new Card[15];
    boPlay = false;
    
        myDeck.shuffle();
    }

    public void play(Scanner scanner){
        System.out.println("Lets play BlackJack! Enter: y(Yes) or n(No)");
        String answer = scanner.nextLine();

        if(answer.equals("y")){
            System.out.println("alright, lets start playing!");
            boPlay = true;
        } else if (answer.equals("n")){
        System.out.println("aw, sad to see you go!");
            boPlay = false;
        } else {
            System.out.println("invalid");
            boPlay = false;
        }
    }    

    while (boPlay = true){
        
    }
    

    public static int calcPoints(Card[] hand){
        int handValue = 0;
        for (int i=0; i<hand.length; i++){
            if(hand[i] == null){
                return handValue;
            } else if(hand[i].getValue().equals("1") ||hand[i].getValue().equals("2") ||hand[i].getValue().equals("3") ||hand[i].getValue().equals("4") ||hand[i].getValue().equals("5") ||hand[i].getValue().equals("6") ||hand[i].getValue().equals("7") ||hand[i].getValue().equals("8") ||hand[i].getValue().equals("9") ||hand[i].getValue().equals("10")){
            handValue += Integer.valueOf(hand[i].getValue());
            } else if(hand[i].getValue().equals("Jack") ||hand[i].getValue().equals("Queen") ||hand[i].getValue().equals("King")){
                handValue += 10;
            }  else if(hand[i].getValue().equals("Ace")){
                handValue += 11;
            }
        }
        return handValue;        
    }

 

    public static String determineResult(Card[] userHand, Card[] dealerHand){
        int userHandN = calcPoints(userHand);
        int dealerHandN = calcPoints(dealerHand);

        if(dealerHandN == userHandN){
            return "Tie";

        } else if (21 - userHandN < 21 - dealerHandN){
            return "Win";

        } else if(21 - userHandN > 21 - dealerHandN){
            return "L";

        } else {
            return null;
        }
    }

    public static boolean isBust(Card[] hand){
        if(calcPoints(hand)<=21){
            return false;
        } else {
            return true;
        }
        
    }

    public static boolean isBlackjack(Card[] hand){
        if(hand.length >2){
            if(hand[2] != null){
            return false;
            }
        }
            if(calcPoints(hand) == 21){
                return true;
            }
            return false;
        }

    public static boolean shouldDealerKeepHitting(Card[] hand){
        if(calcPoints(hand)<=16){
            return true;
        }
        return false;
        }

}
