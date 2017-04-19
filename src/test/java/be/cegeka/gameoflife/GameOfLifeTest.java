package be.cegeka.gameoflife;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

    @Test
    public void cellIsEqualToAnotherCellWhenAliveIsTheSame() throws Exception {
        assertThat(new Cell(true)).isEqualTo(new Cell(true));
        assertThat(new Cell(false)).isEqualTo(new Cell(false));
        assertThat(new Cell(true)).isNotEqualTo(new Cell(false));
        assertThat(new Cell(false)).isNotEqualTo(new Cell(true));
    }

    @Test
    public void cellsToString_WhenAliveIsTrue_ThenLive() throws Exception {
        assertThat(new Cell(true).toString()).isEqualTo("live");
    }

    @Test
    public void cellsToString_WhenAliveIsFalse_ThenDead() throws Exception {
        assertThat(new Cell(false).toString()).isEqualTo("dead");
    }

    private class Cell {
        private boolean alive;

        public Cell(boolean alive) {
            this.alive = alive;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cell cell = (Cell) o;
            return alive == cell.alive;
        }

        @Override
        public int hashCode() {
            return Objects.hash(alive);
        }

        @Override
        public String toString() {
            return alive ? "live" : "dead";
        }
    }
}
