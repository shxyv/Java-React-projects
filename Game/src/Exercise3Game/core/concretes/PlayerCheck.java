package Exercise3Game.core.concretes;

import Exercise3Game.core.abstracts.PlayerCheckInterface;
import Exercise3Game.entities.concretes.Player;

public class PlayerCheck implements PlayerCheckInterface {
    @Override
    public boolean checkIfReal(Player player) {
        return true;
    }
}
