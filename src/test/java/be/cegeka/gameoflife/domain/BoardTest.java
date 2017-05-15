package be.cegeka.gameoflife.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    private Board board;

    private Board makeSquareBoard(){
        Cell cellOne = new Cell(new Position(0,0));
        Cell cellTwo = new Cell(new Position(0,1));
        Cell cellThree = new Cell(new Position(1,0));
        Cell cellFour = new Cell(new Position(1,1));

        return new Board(cellOne,cellTwo,cellThree,cellFour);
    }

    @Test
    public void boardShouldBeEqual_WhenGivenSameCells(){
        board = makeSquareBoard();
        Board expected = makeSquareBoard();

        assertThat(board).isEqualTo(expected);
    }

    //Also the test that cells should not count themself as a neighbour
    @Test
    public void cellShouldHaveNoNeighbours_WhenAloneOnBoard(){
        Cell cell = new Cell(new Position(0,0));
        board =  new Board(cell);

        assertThat(board.neighbours(cell)).isEqualTo(0);
    }

    @Test
    public void cellShouldCountVerticalNeighbours(){
        Cell cellOne = new Cell(new Position(0,0));
        Cell cellTwo = new Cell(new Position(0,1));

        board = new Board(cellOne,cellTwo);
        assertThat(board.neighbours(cellOne)).isEqualTo(1);
    }
}
