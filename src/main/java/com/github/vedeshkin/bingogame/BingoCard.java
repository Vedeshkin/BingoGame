package com.github.vedeshkin.bingogame;
import java.util.Objects;

/**
 * Created by Vedeshkin on 10/10/2018.
 * All right reserved.
 */
public class BingoCard {
    private final String label;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BingoCard bingoCard = (BingoCard) o;
        return Objects.equals(label, bingoCard.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }

    public String getLabel() {
        return label;
    }

    public BingoCard(String label) {
        this.label = label;
    }
}
