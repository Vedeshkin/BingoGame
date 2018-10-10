package com.github.vedeshkin.bingogame;
import java.util.List;
import java.util.Random;

/**
 * Created by Vedeshkin on 10/10/2018.
 * All right reserved.
 */
public class BingoCardDeck {

    private Random random = new Random();
    private final List<BingoCard> cardDeck;

    public BingoCardDeck(BingoCardFactory  factory)
    {
        cardDeck = factory.createNewCardDeck();
    }

    private BingoCard getBingoCard(int index)
    {
        return  cardDeck.get(index);
    }
    public BingoCard getRandomBingoCard()
    {
        return  getBingoCard(random.nextInt(cardDeck.size() -1));
    }

}
