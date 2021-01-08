import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cardDeck;

    public Deck() {
        this.cardDeck = new ArrayList<Card>();
    }

    public ArrayList<Card> populateDeck() {
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                this.cardDeck.add(card);
            }
        }
        return this.cardDeck;
    }

    public int getDeckCardCount() {
        return this.cardDeck.size();
    }


    public Boolean findCard(Card card) {
        if (this.cardDeck.contains(card));
        return true;
    }

    public ArrayList<Card> shuffleCards() {
//        System.out.println(cardDeck);
//        System.out.println(cardDeck);
        Collections.shuffle(this.cardDeck);
//        System.out.println(cardDeck);
        return cardDeck;
    }


    public Card dealCard() {
        Card card = this.cardDeck.remove(0);
        System.out.println(card.getRank());
        System.out.println(card.getSuit());
        return card;
    }
}
