
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // test your code here
//
//        Card first = new Card(2, Suit.DIAMOND);
//        Card second = new Card(2, Suit.SPADE);
//        Card third = new Card(2, Suit.HEART);
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//        
//        ArrayList<Card> cards = new ArrayList<>();
//        cards.add(third);
//        cards.add(second);
//        cards.add(first);
//        cards.stream().sorted((c1,c2) -> {
//            return c1.compareTo(c2);
//        }).forEach(c -> System.out.println(c));
        Hand hand = new Hand();

        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));
        hand.print();
        System.out.println("");
        
        hand.sort();
        hand.print();
        
        
        Hand hand1 = new Hand();

        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));

        
        
        Hand hand2 = new Hand();

        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));
        
        
        int comparison = hand1.compareTo(hand2);

        if (comparison < 0) {
            System.out.println("better hand is");
            hand2.print();
        } else if (comparison > 0){
            System.out.println("better hand is");
            hand1.print();
        } else {
            System.out.println("hands are equal");
        }
        
        ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card(3, Suit.SPADE));
        cards.add(new Card(2, Suit.DIAMOND));
        cards.add(new Card(14, Suit.SPADE));
        cards.add(new Card(12, Suit.HEART));
        cards.add(new Card(2, Suit.SPADE));

        BySuitInValueOrder sortBySuitInValueOrder = new BySuitInValueOrder();
        Collections.sort(cards, sortBySuitInValueOrder);

        cards.stream().forEach(c -> System.out.println(c));
        
        Hand asder = new Hand();

        asder.add(new Card(12, Suit.HEART));
        asder.add(new Card(4, Suit.SPADE));
        asder.add(new Card(2, Suit.DIAMOND));
        asder.add(new Card(14, Suit.SPADE));
        asder.add(new Card(7, Suit.HEART));
        asder.add(new Card(2, Suit.SPADE));

        asder.sortBySuit();

        asder.print();
    }
}
