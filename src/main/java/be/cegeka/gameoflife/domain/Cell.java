package be.cegeka.gameoflife.domain;

public class Cell {

    private Position position;

    public Cell(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        return position != null ? position.equals(cell.position) : cell.position == null;
    }

    @Override
    public int hashCode() {
        return position != null ? position.hashCode() : 0;
    }
}
