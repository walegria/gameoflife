package be.cegeka.gameoflife;

import org.junit.Test;

import static be.cegeka.gameoflife.Cell.dead;
import static be.cegeka.gameoflife.Cell.live;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    public void liveCellWithFewerThanTwoLiveNeighboursDies() throws Exception {
        Generation world = Generation.of(
            asList(dead(), dead(), live()),
            asList(live(), live(), live()),
            asList(dead(), dead(), live())
        );

        assertThat(tick(world).as2DList()).containsExactly(
            asList(dead(), dead(), live()),
            asList(dead(), live(), live()),
            asList(dead(), dead(), live())
        );
    }

    private Generation tick(Generation world) {
        return world;
    }

}
