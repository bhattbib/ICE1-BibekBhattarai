package ICE1_bibek_bhattarai;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
/**
 * CardTrick class creates a magic hand of 7 random cards.
 * Modifier: Bibek Bhattarai
 * Student ID: 123456789
 * modified date :2025/6/2
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        Random rand =new Random();
          
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(suits[rand.nextInt(suits.length)]);
            magicHand[i] = c;
        }
        
    }
}
      