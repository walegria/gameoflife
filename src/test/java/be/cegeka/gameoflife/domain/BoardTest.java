package be.cegeka.gameoflife.domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    private Board board;
    private Cell cellZero;

    @Before
    public void setup() {
        cellZero = new Cell(new Position(0, 0));
    }

    @Test
    public void boardWithOnlyOneCell_ShouldHaveNoNeighbours(){
        board =  new Board(cellZero);

        assertThat(board.cellNeighbours(cellZero)).isEqualTo(0);
    }

    @Test
    public void boardCellWithVerticalAdjacentCells_ShouldOnlyCountVerticalNeighbours(){
        Cell cellAdjacentVertical = new Cell(new Position(0,1));

        board = new Board(cellZero,cellAdjacentVertical);
        assertThat(board.cellNeighbours(cellZero)).isEqualTo(1);
    }

    @Test
    public void boardCellWithHorizontalAdjacentCells_ShouldOnlyCountHorizontalNeighbours(){
        Cell cellAdjacentHorizontal = new Cell(new Position(1,0));
        Cell cellAdjacentHorizontalTwo = new Cell(new Position(-1,0));

        board = new Board (cellZero,cellAdjacentHorizontal,cellAdjacentHorizontalTwo);
        assertThat(board.cellNeighbours(cellZero)).isEqualTo(2);
    }

    @Test
    public void boardCellWithAdjacentCells_ShouldReturnAllNeighbours(){
        Cell cellAdjacentHorizontal = new Cell(new Position(1,0));
        Cell cellAdjacentHorizontalTwo = new Cell(new Position(-1,0));
        Cell cellAdjacentVertical = new Cell(new Position(0,1));
        Cell cellDiagonalTopLeft = new Cell (new Position(-1,1));
        Cell cellDiagonalBottomLeft = new Cell (new Position(-1,-1));

        board = new Board (cellZero,cellAdjacentHorizontal,cellAdjacentHorizontalTwo,cellAdjacentVertical,cellDiagonalTopLeft,cellDiagonalBottomLeft);
        assertThat(board.cellNeighbours(cellZero)).isEqualTo(5);
    }



}
