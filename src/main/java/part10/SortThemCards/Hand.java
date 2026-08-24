/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
/**
 *
 * @author sakura
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand(){
        cards = new ArrayList<>();
    }

    public void add(Card card){
        cards.add(card);

    }

    public void print(){
        for(Card card:cards){
            System.out.println(card);
        }
    }

    public void sort(){

        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        Collections.sort(cards, comparator);

    }

    public void sortBySuit(){
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);

        Collections.sort(cards, comparator);

        print();

    }

    @Override
    public int compareTo(Hand hand){

        int sum =0;
        int otherSum = 0;

        for(Card card:cards){
            sum += card.getValue();
        }

        for(Card card: hand.cards){
            otherSum += card.getValue();
        }

        if(otherSum < sum){
            return 1;
        } else if(otherSum > sum){
            return -1;

        } else {
            return 0;
        }


    }

}
