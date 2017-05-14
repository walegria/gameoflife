package be.cegeka.gameoflife.domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CellTest {

    private Cell cell;

    @Before
    public void setUp(){
        cell = new Cell(new Position(0,0));
    }

    @Test
    public void aCellIsEqual_WhenTheirPositionIsTheSame (){
        Cell cellAtBeginPosition = new Cell (new Position(0,0));
        assertThat(cell).isEqualTo(cellAtBeginPosition);
    }
}
