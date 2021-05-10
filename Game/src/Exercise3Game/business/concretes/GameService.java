package Exercise3Game.business.concretes;

import Exercise3Game.entities.concretes.Game;
import Exercise3Game.entities.concretes.Player;

public class GameService {
    public void gameSale(Player player, Game game){
        System.out.println(player.getFirstName()+" adli oyuncu "+game.getGameName()+" adli oyunu satin aldi");
    }
}
