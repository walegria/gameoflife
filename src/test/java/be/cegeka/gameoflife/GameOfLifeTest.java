package be.cegeka.gameoflife;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursDies() throws Exception {
        boolean liveCell = true;
        boolean deadNeighbour = false;
        boolean liveNeighbour = true;

        List<Boolean> world = Arrays.asList(deadNeighbour, liveCell, liveNeighbour);

        assertThat(tick(world)).containsExactly(false, false, true);
    }

    private List<Boolean> tick(List<Boolean> world) {
        return world;
    }
}
