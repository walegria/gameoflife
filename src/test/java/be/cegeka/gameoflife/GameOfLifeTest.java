package be.cegeka.gameoflife;

import org.junit.Test;

import java.util.Arrays;

import static be.cegeka.gameoflife.Cell.dead;
import static be.cegeka.gameoflife.Cell.live;
import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursDies() throws Exception {
        Generation world = Generation.of(
            Arrays.asList(dead(), dead(), live()),
            Arrays.asList(live(), live(), live()),
            Arrays.asList(dead(), dead(), live())
        );

        assertThat(tick(world).as2DList()).containsExactly(
            Arrays.asList(dead(), dead(), live()),
            Arrays.asList(dead(), live(), live()),
            Arrays.asList(dead(), dead(), live())
        );
    }

    private Generation tick(Generation world) {
        return world;
    }

}
