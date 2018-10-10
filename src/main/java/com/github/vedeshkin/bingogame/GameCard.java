package com.github.vedeshkin.bingogame;
/**
 * Created by Vedeshkin on 10/10/2018.
 * All right reserved.
 */
public class GameCard {

    private GameCardCell gameCardCells[][];

    public GameCard(BingoCardDeck bingoCardDeck, int rowsCount, int columnsCount) {
        fillGameCard(bingoCardDeck,rowsCount,columnsCount);
    }

    private void fillGameCard(BingoCardDeck bingoCardDeck, int rowsCount, int columnsCount) {
        GameCardCell gameCardCells [][] = new GameCardCell[rowsCount][columnsCount];
        for (int i = 0; i < gameCardCells.length;i++){
           // gameCardCells[i] = new GameCardCell[columnsCount];
            for(int j = 0;j < gameCardCells[i].length ;j++)
            {
                gameCardCells[i][j]= new GameCardCell(bingoCardDeck.getRandomBingoCard());
            }
        }
        this.gameCardCells = gameCardCells;
    }


    public void changeCellStatus(BingoCard cardToChange,boolean status) {
        getCell(cardToChange).setStatus(status);
    }

    public void changeCellStatus(int row, int cell, boolean status){
        gameCardCells[row][cell].setStatus(status);
    }

    private GameCardCell getCell(BingoCard bingoCard){
        for (int i=0;i < gameCardCells.length -1;i++){
            for (int j = 0;j < gameCardCells[i].length -1;j++){
                if( gameCardCells[i][j].getCard() == bingoCard) return gameCardCells [i][j];
            }
        }
        return null;
    }

    public GameCardCell[][] getGameCardCells() {
        return gameCardCells;
    }
}
