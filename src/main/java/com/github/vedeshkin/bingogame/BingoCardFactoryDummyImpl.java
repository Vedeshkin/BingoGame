package com.github.vedeshkin.bingogame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vedeshkin on 10/10/2018.
 * All right reserved.
 */
public class BingoCardFactoryDummyImpl implements BingoCardFactory {
    private String quotes []  = {"1","2","3","4","5","6","7","8","9","10"};
    private static BingoCardFactoryDummyImpl instance = null;
    private BingoCardFactoryDummyImpl(){}

    public static BingoCardFactoryDummyImpl getInstance(){
        if (instance != null) return  instance;
        instance = new BingoCardFactoryDummyImpl();
        return instance;
    }


    @Override
    public List<BingoCard> createNewCardDeck() {
        List<BingoCard> bingoCards = new ArrayList<>();
        for (String s: quotes)
        {
         bingoCards.add(new BingoCard(s));
        }

        return bingoCards;
    }
}
