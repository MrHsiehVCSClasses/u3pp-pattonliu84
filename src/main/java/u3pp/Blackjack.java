package u3pp;
import java.util.Scanner;

public class Blackjack {
    private Card[] user;
    private Card[] dealer;
    private boolean bo;

    public Blackjack(){
        user = new Card[15];
        dealer = new Card[15];
        bo = false;
        Deck deck = new Deck();
        deck.shuffle();
    }



            //Determines results. If the cards that user has is smaller than dealer, then user wins. Vice versa. 
    public static String determineResult(Card[] user, Card[] dealer){
        int userN = calcPoints(user);
        int dealerN = calcPoints(dealer);
        int userLeft = 21 - userN;
        int dealerLeft = 21 - dealerN;
        if(dealerN == userN){
            return "Tie";
            } else if(userLeft < dealerLeft){
                return "Win";
            } else if(userLeft > dealerLeft){
                return "Lose";
            }
                return null;
            }

   //If the second card is not null, and it is 21, then true and user/dealer hits blackjack. 
    public static boolean isBlackjack(Card[] hand){
        if(hand.length >2){
            if(hand[2] != null){
                return false;
                }
            }


            if(calcPoints(hand) == 21){
                return true;
            } else {
                return false;
            }
            
    }

    //Checks if busts, which is higher than 21. 
    public static boolean isBust(Card[] hand){
        if (calcPoints(hand) > 21) {
            return true;
        }
        return false;
    }

         

    //Continue if points are higher than 16
    public static boolean shouldDealerKeepHitting(Card[] hand){
        if(calcPoints(hand)<=16){
            return true;
        } else{
            return false;
        }
    }

    //takes an arrays of cards and returns the amount of points.
    public static int calcPoints(Card[]hand){
        int handValue = 0;
        for(int i=0; i<hand.length; i++){
            if(hand[i] == null){
                return handValue;
            }
            if(hand[i].getValue().equals("1") || hand[i].getValue().equals("2") ||hand[i].getValue().equals("3") ||hand[i].getValue().equals("4") ||hand[i].getValue().equals("5") ||hand[i].getValue().equals("6") ||hand[i].getValue().equals("7") ||hand[i].getValue().equals("8") ||hand[i].getValue().equals("9") ||hand[i].getValue().equals("10")){
            handValue += Integer.valueOf(hand[i].getValue());
            } else if(hand[i].getValue().equals("Jack") ||hand[i].getValue().equals("Queen") ||hand[i].getValue().equals("King")){
                handValue += 10;
            }  else if(hand[i].getValue().equals("Ace")){
                handValue += 11;
            }
        }
        return handValue;       
    }
}


