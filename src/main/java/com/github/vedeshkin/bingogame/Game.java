package com.github.vedeshkin.bingogame;

/**
 * Created by Vedeshkin on 10/10/2018.
 * All right reserved.
 */
public class Game {


    public static void main(String[] args) {
        BingoCardFactory bingoCardFactory = BingoCardFactoryDummyImpl.getInstance();
        BingoCardDeck bingoCardDeck = new BingoCardDeck(bingoCardFactory);
        GameCard gameCard =  new GameCard(bingoCardDeck,5,2);
        GameCardViwer gameCardViwer = new GameCardConsoleViwer(3,3);
        gameCardViwer.showGameCard(gameCard);
    }



    }

