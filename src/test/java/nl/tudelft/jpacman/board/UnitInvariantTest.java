package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class UnitInvariantTest {
    private Unit unit = new BasicUnit();
    private Square square = new BasicSquare();
    @Test
    void testRemove(){
        square.put(unit);
        assertThat(unit.invariant()).isEqualTo(true);
    }
}
