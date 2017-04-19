package be.cegeka.gameoflife;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursDies() throws Exception {
        boolean liveCell = true;
        boolean deadCell = true;
        boolean deadNeighbour = false;
        boolean liveNeighbour = true;

        List<List<Boolean>> world = Arrays.asList(
            Arrays.asList(deadNeighbour, deadNeighbour, true),
            Arrays.asList(liveCell,      liveNeighbour, true),
            Arrays.asList(deadNeighbour, deadNeighbour, true)
        );

        assertThat(tick(world)).containsExactly(
            Arrays.asList(deadNeighbour, deadNeighbour, true),
            Arrays.asList(deadCell,      liveNeighbour, true),
            Arrays.asList(deadNeighbour, deadNeighbour, true)
        );
    }

    private List<List<Boolean>> tick(List<List<Boolean>> world) {
        return world;
    }
}
