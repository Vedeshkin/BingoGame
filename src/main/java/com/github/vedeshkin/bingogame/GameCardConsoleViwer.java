package com.github.vedeshkin.bingogame;

/**
 * Created by Vedeshkin on 10/10/2018.
 * All right reserved.
 */
public class GameCardConsoleViwer implements GameCardViwer {

    private int cellHeight;
    private int cellWidth;

    public GameCardConsoleViwer(int cellHeight, int cellWidth) {
        this.cellHeight = cellHeight;
        this.cellWidth = cellWidth;
    }

    @Override
    public void showGameCard(GameCard gameCard) {
        GameCardCell cells[][] = gameCard.getGameCardCells();
        int rows = cells.length;
        int columns = cells[0].length;
        for(int i = 0;i< cells.length; i++)
        {
            System.out.println();
            for(int j = 0;j<cells[i].length;j++){
                System.out.println(cells[i][j].getCard().getLabel());
            }
        }
    }
    private void printSingleCell(GameCardCell gameCardCell) {
    }
}
