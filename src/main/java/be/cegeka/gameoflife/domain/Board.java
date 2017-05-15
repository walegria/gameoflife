package be.cegeka.gameoflife.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Board {
    private Set<Cell> alives;

    public Board(Cell ... cells) {
        alives = new HashSet<Cell>(Arrays.asList(cells));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        return alives != null ? alives.equals(board.alives) : board.alives == null;
    }

    @Override
    public int hashCode() {
        return alives != null ? alives.hashCode() : 0;
    }

    public int neighbours(Cell cell) {
        int neigboursCount = 0;
        for (int verticalNeighbours = -1; verticalNeighbours <= 1; verticalNeighbours += 2) {
            if (alives.contains(new Cell(new Position(cell.getPosition().getX(), cell.getPosition().getY() + verticalNeighbours)))) {
                neigboursCount++;
            }
        }

        return neigboursCount;
    }
}
