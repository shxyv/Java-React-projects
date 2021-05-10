package Exercise3Game.dataAccess.abstracts;

import Exercise3Game.entities.concretes.Game;

import java.util.List;

public interface GameInterface {
    void add(Game game);
    void update(Game game);
    void delete(Game game);
    List<Game> getAll();
}
