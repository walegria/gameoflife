package be.cegeka.gameoflife.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Board {
    private Set<Cell> alives;

    public Board(Cell ... cells) {
        alives = new HashSet<Cell>(Arrays.asList(cells));
    }

    public int cellCountNeighbours(Cell cell) {
        int neigboursCount = getVerticalNeigboursCount(cell);
        neigboursCount += getHorizontalNeighboursCount(cell);
        neigboursCount += getDiagonalNeighboursCount(cell);

        return neigboursCount;
    }

    private int getDiagonalNeighboursCount(Cell cell) {
        int neigboursCount = 0;
        for (int neighbourHorizontal = -1; neighbourHorizontal <= 1; neighbourHorizontal += 2) {
            for (int neighbourVertical = -1; neighbourVertical <=1; neighbourVertical += 2){
                if (alives.contains(new Cell(getPositionOfDiagonalNeighbour(cell, neighbourHorizontal, neighbourVertical)))) {
                    neigboursCount++;
                }
            }
        }
        return neigboursCount;
    }

    private int getHorizontalNeighboursCount(Cell cell) {
        int neigboursCount = 0;
        for (int neighbour = -1; neighbour <= 1; neighbour += 2) {
            if (alives.contains(new Cell(getPositionOfHorizontalNeighbour(cell, neighbour)))) {
                neigboursCount++;
            }
        }
        return neigboursCount;
    }

    private int getVerticalNeigboursCount(Cell cell) {
        int neigboursCount = 0;
        for (int neighbour = -1; neighbour <= 1; neighbour += 2) {
            if (alives.contains(new Cell(getPositionOfVerticalNeighbour(cell, neighbour)))) {
                neigboursCount++;
            }
        }
        return neigboursCount;
    }

    private Position getPositionOfVerticalNeighbour(Cell cell, int verticalValue){
        return new Position(cell.getHorizontalPositionValue(), cell.getVerticalPositionValue() + verticalValue);
    }

    private Position getPositionOfHorizontalNeighbour(Cell cell, int horizontalValue) {
        return new Position(cell.getHorizontalPositionValue()+ horizontalValue, cell.getVerticalPositionValue());
    }

    private Position getPositionOfDiagonalNeighbour(Cell cell, int horizontalValue, int verticalValue) {
        return new Position(cell.getHorizontalPositionValue()+ horizontalValue, cell.getVerticalPositionValue()+verticalValue);

    }
}
