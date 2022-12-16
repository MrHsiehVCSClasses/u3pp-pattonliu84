package u3pp;
import java.util.Random;

public class Deck {

Random rand = new Random();
Card[] deck = new Card[52];
private int deckIndex = 0;
private int cardsLeft = 52;

	//intiates 52 cards
int k = 0;
public Deck(){
    int k = 0;
    for(int i=0; i<4; i++){
        for(int j=0; j<13; j++){
            
            deck[k] = new Card(Card.SUITS[i], Card.VALUES[j]);
            k += 1;
        }
    }
    for(int i=0; i<deck.length; i++){
        System.out.println(deck[i]);
    }
}

	//checks the number of cards left
    public int numLeft(){
        return cardsLeft;

    }
        //If no cards left, shuffles the deck
    public Card deal(){
        if(cardsLeft > 0){
        deckIndex += 1;
        cardsLeft -= 1;
        return deck[deckIndex-1];
        } else {
            shuffle();
            deckIndex += 1;
            cardsLeft -= 1;
            return deck[deckIndex-1];
        } 
    }
       //shuffles by exchanging the placement of deck
    public void shuffle(){
        Random rand = new Random();
        deckIndex = 0;
        cardsLeft = 52;
        for(int i = 0; i < deck.length; i++){
            int r = rand.nextInt(deck.length);
			Card temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
        }
    }
    
    
}
