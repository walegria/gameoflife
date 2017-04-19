package be.cegeka.gameoflife;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursDies() throws Exception {
        Cell dead = new Cell(false);
        Cell live = new Cell(true);

        List<List<Cell>> world = Arrays.asList(
            Arrays.asList(dead, dead, live),
            Arrays.asList(live, live, live),
            Arrays.asList(dead, dead, live)
        );

        assertThat(tick(world)).containsExactly(
            Arrays.asList(dead, dead, live),
            Arrays.asList(dead, live, live),
            Arrays.asList(dead, dead, live)
        );
    }

    private List<List<Cell>> tick(List<List<Cell>> world) {
        return world;
    }

    private class Cell {
        private boolean alive;

        public Cell(boolean alive) {
            this.alive = alive;
        }
    }
}
