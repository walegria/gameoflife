package be.cegeka.gameoflife.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CellTest {

    private Cell cellZero = new Cell(new Position(0,0));

    @Test
    public void aCellIsEqual_WhenTheirPositionIsTheSame (){
        Cell cellAtBeginPosition = new Cell (new Position(0,0));
        assertThat(cellZero).isEqualTo(cellAtBeginPosition);
    }

    @Test
    public void cellGetPosition_ShouldReturnPosition(){
        Position position = new Position(0,0);
        assertThat(cellZero.getPosition()).isEqualTo(position);
    }

    @Test
    public void cellGetHorizontalPosition_ShouldReturnPositionXValue(){
        Cell cell = new Cell(new Position(1,0));
        assertThat(cell.getHorizontalPositionValue()).isEqualTo(1);
    }
    @Test
    public void cellGetVerticalPosition_ShouldReturnPositionYValue(){
        Cell cell = new Cell(new Position(1,0));
        assertThat(cellZero.getVerticalPositionValue()).isEqualTo(0);
    }
}
