package collection.compare.test;

public class Card implements Comparable<Card> {

    private final int number;
    private final Suit suit;

    public Card(int number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card o) {
        if(this.number != o.number) {
            return Integer.compare(this.number, o.number);
        }else{
            return this.suit.compareTo(o.suit);
        }
    }

    @Override
    public String toString() {
        return number+"("+suit+")";
    }
}
