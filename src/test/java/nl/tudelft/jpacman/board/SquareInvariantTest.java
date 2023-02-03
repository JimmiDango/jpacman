package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
public class SquareInvariantTest {
    private Square square = new BasicSquare();
    private Unit occupant = new BasicUnit();
    private final List<Unit> occupants = new ArrayList<>();

    @Test
    void testRemove(){
        occupants.add(occupant);
        assertThat(square.invariant()).isEqualTo(true);
    }
}
