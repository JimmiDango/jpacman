package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    private static final PacManSprites sprites = new PacManSprites();
    private PlayerFactory Factory = new PlayerFactory(sprites);
    private Player player = Factory.createPacMan();

    @Test
    void testAlive(){
        assertThat(player.isAlive()).isEqualTo(true);
    }
}
