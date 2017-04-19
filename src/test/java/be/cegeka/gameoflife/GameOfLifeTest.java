package be.cegeka.gameoflife;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursDies() throws Exception {
        Cell dead = Cell.dead();
        Cell live = Cell.live();

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

    @Test
    public void liveCellWithTwoOrThreeLiveNeighboursLivesOnToTheNextGeneration() throws Exception {
        Cell dead = Cell.dead();
        Cell live = Cell.live();

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

}
