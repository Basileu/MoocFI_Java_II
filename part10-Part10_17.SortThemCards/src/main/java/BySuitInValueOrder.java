
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        Comparator cmp = Comparator.comparing(Card::getSuit).thenComparing(Card::getValue);
//        return o1.getValue() - o2.getValue();
        if (o1.getSuit().ordinal() == o2.getSuit().ordinal()) {
            return o1.getValue() - o2.getValue();
        } else {
            return o1.getSuit().ordinal() - o2.getSuit().ordinal();
        }
//        (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal()
//        return Comparator.comparing(o1.getValue() - o2.getValue());
    }

}
