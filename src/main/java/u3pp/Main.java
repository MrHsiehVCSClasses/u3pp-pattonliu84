package u3pp;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);  
        Blackjack myBlackjack = new Blackjack();
        myBlackjack.play(myScanner);

        
    }
}
