package be.cegeka.gameoflife.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    @Test
    public void boardShouldBeEqual_WhenGivenSameCells(){
        Cell cellOne = new Cell(new Position(0,0));
        Cell cellTwo = new Cell(new Position(0,1));
        Cell cellThree = new Cell(new Position(1,0));
        Cell cellFour = new Cell(new Position(1,1));

        Board board = new Board(cellOne,cellTwo,cellThree,cellFour);
        Board expected = new Board(cellOne,cellTwo,cellThree,cellFour);

        assertThat(board).isEqualTo(expected);

    }

}
