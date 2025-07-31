package collection.compare.test;

public enum Suit {
    SPADE("\u2660"), HEART("\u2665"),DIAMOND("\u2666"),CLUB("\u2663");

    private String code;

    Suit(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
