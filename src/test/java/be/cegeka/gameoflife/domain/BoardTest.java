package be.cegeka.gameoflife.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    private Board board;

    @Test
    public void boardWithOnlyOneCell_ShouldHaveNoNeighbours(){
        Cell cell = new Cell(new Position(0,0));
        board =  new Board(cell);

        assertThat(board.neighbours(cell)).isEqualTo(0);
    }

    @Test
    public void boardWithVerticalAdjacentCells_ShouldOnlyCountVerticalNeighbours(){
        Cell cellOne = new Cell(new Position(0,0));
        Cell cellTwo = new Cell(new Position(0,1));

        board = new Board(cellOne,cellTwo);
        assertThat(board.neighbours(cellOne)).isEqualTo(1);
    }
}
