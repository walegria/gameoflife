package be.cegeka.gameoflife.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Board {
    private Set<Cell> alives;

    public Board(Cell ... cells) {
        alives = new HashSet<Cell>(Arrays.asList(cells));
    }

    public int neighbours(Cell cell) {
        int neigboursCount = 0;
        neigboursCount = getVerticalNeigboursCount(cell, neigboursCount);

        return neigboursCount;
    }

    private int getVerticalNeigboursCount(Cell cell, int neigboursCount) {
        for (int verticalNeighbours = -1; verticalNeighbours <= 1; verticalNeighbours += 2) {
            if (alives.contains(new Cell(getPositionOfVerticalNeighbour(cell, verticalNeighbours)))) {
                neigboursCount++;
            }
        }
        return neigboursCount;
    }

    private Position getPositionOfVerticalNeighbour(Cell cell, int verticalValue){
        return new Position(cell.getHorizontalPositionValue(), cell.getVerticalPositionValue() + verticalValue);
    }
}
