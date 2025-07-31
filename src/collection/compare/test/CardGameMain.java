package collection.compare.test;

public class CardGameMain {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1=new Player(deck.getCards());
        Player player2=new Player(deck.getCards());

        int sum1 = player1.getSum();
        int sum2 = player2.getSum();
        System.out.println("플레이어1의 카드: " + player1.getCards() + ", 합계: " + sum1);
        System.out.println("플레이어2의 카드: " + player2.getCards() + ", 합계: " + sum2);
        if(sum1>sum2){
            System.out.println("플레이어1 승리");
        }else if(sum1<sum2){
            System.out.println("플레이어2 승리");
        }else{
            System.out.println("무승부");
        }
    }
}
