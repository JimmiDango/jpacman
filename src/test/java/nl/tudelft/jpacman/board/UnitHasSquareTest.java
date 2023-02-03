package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class UnitHasSquareTest {
    private Unit unit = new BasicUnit();
    @Test
    void testRemove(){
        assertThat(unit.hasSquare()).isEqualTo(false);
    }
}
