package collection.compare.test;

import java.util.List;

public class Player {

    private List<Card> cards;

    public Player(List<Card> cards) {
        cards.sort(null);
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getSum(){
        int sum = 0;
        for (Card card : cards) {
            sum+=card.getNumber();
        }
        return sum;
    }
}
