package be.cegeka.gameoflife;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CellTest {

    @Test
    public void cellIsEqualToAnotherCellWhenAliveIsTheSame() throws Exception {
        assertThat(Cell.live()).isEqualTo(Cell.live());
        assertThat(Cell.dead()).isEqualTo(Cell.dead());
        assertThat(Cell.live()).isNotEqualTo(Cell.dead());
        assertThat(Cell.dead()).isNotEqualTo(Cell.live());
    }

    @Test
    public void cellsToString_WhenAliveIsTrue_ThenLive() throws Exception {
        assertThat(Cell.live().toString()).isEqualTo("live");
    }

    @Test
    public void cellsToString_WhenAliveIsFalse_ThenDead() throws Exception {
        assertThat(Cell.dead().toString()).isEqualTo("dead");
    }

}
