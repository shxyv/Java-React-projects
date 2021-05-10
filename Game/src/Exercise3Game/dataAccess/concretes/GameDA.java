package Exercise3Game.dataAccess.concretes;

import Exercise3Game.dataAccess.abstracts.GameInterface;
import Exercise3Game.entities.concretes.Game;

import java.util.List;

public class GameDA implements GameInterface {
    @Override
    public void add(Game game) {
        System.out.println("Oyun eklendi "+game.getGameName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Oyun yenilendi "+game.getGameName());

    }

    @Override
    public void delete(Game game) {
        System.out.println("Oyun silindi "+game.getGameName());

    }

    @Override
    public List<Game> getAll() {
        return null;
    }
}
