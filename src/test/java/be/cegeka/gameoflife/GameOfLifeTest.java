package be.cegeka.gameoflife;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursDies() throws Exception {

        List<List<Boolean>> world = Arrays.asList(
            Arrays.asList(false, false, true),
            Arrays.asList(true , true , true),
            Arrays.asList(false, false, true)
        );

        assertThat(tick(world)).containsExactly(
            Arrays.asList(false, false, true),
            Arrays.asList(false, true , true),
            Arrays.asList(false, false, true)
        );
    }

    private List<List<Boolean>> tick(List<List<Boolean>> world) {
        return world;
    }
}
