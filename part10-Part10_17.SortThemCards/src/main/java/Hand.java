/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;


public class Hand implements Comparable<Hand> {
  //  private Card card;
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards=new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);       
    }
    
    public void print() {
        cards.stream().forEach(card -> System.out.println(card));
    }   
    
    public void sort() {
        Collections.sort(cards, (c1, c2) -> c1.compareTo(c2));
    }
    
    public int getValues() {
        return this.cards.stream().mapToInt(c -> c.getValue()).sum();
    }
    
    public void sortBySuit() {
       // Collections.sort(cards, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
        BySuitInValueOrder sortBySuitInValueOrder = new BySuitInValueOrder();
        Collections.sort(cards, sortBySuitInValueOrder);
    }
    
    @Override
    public int compareTo(Hand hand) {
//        int sum1 = cards.stream().mapToInt(c -> c.getValue()).sum();
//        int sum2 = hand.stream().mapToInt(c -> c.getValue()).sum();
        if (this.getValues()>hand.getValues()) {
            return 1;
        }   else if (this.getValues()<hand.getValues()) {
            return -1;
        }
        return 0;
//        if (sum1>sum2) {
//            return 1;
//        }   else if (sum1<sum2) {
//            return -1;
//        }   
//        return 0;
    }
}
