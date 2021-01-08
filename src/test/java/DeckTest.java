import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setUp(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.getDeckCardCount());
    }

    @Test
    public void deckHas52Cards(){
        deck.populateDeck();
        assertEquals(52, deck.getDeckCardCount());
    }

    @Test
    public void deckContainsCard(){
        deck.populateDeck();
        Card card = new Card(SuitType.HEARTS, RankType.ACE);
        assertEquals(true, deck.findCard(card));
    }

    @Test
    public void shuffleCards(){
        deck.populateDeck();
        deck.shuffleCards();
        assertEquals(52, deck.getDeckCardCount());
    }

//    @Test
//    public void canDealCard(){
//        deck.populateDeck();
//        deck.shuffleCards();
//        deck.dealCard();
//        assertEquals(51, deck.getDeckCardCount());
//    }

    @Test
    public void canDeal2Cards(){
        deck.populateDeck();
        deck.shuffleCards();
        deck.dealCard();
        deck.shuffleCards();
        deck.dealCard();
        assertEquals(50, deck.getDeckCardCount());
    }
}
