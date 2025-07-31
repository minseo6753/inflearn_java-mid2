package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    
    private List<Card> deck=new ArrayList<Card>();

    public Deck() {
        for (int i = 1; i <=13 ; i++) {
            for (Suit suit : Suit.values()) {
                deck.add(new Card(i,suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> getCards() {
        List<Card> cards=new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            cards.add(deck.remove(deck.size()-1-i));
        }
        return cards;
    }
}
