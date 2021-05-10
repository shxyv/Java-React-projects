package Exercise3Game.dataAccess.abstracts;

import Exercise3Game.entities.concretes.Player;

import java.util.List;

public interface PlayerInterface {
    void add(Player player);
    void update(Player player);
    void delete(Player player);
    List<Player> getAll();
}
