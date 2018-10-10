package com.github.vedeshkin.bingogame;

/**
 * Created by Vedeshkin on 10/10/2018.
 * All right reserved.
 */
public class GameCardCell {
    private final BingoCard card;
    private boolean status = false;

    public GameCardCell(BingoCard card) {
        this.card = card;
    }

    public BingoCard getCard() {
        return card;
    }

    public boolean isActive() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
