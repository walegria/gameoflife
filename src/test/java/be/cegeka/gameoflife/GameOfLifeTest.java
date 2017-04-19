package be.cegeka.gameoflife;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursDies() throws Exception {
        boolean dead = false;
        boolean live = true;

        List<List<Boolean>> world = Arrays.asList(
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

    private List<List<Boolean>> tick(List<List<Boolean>> world) {
        return world;
    }
}
