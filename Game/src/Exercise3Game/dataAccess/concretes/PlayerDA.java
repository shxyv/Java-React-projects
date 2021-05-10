package Exercise3Game.dataAccess.concretes;

import Exercise3Game.dataAccess.abstracts.PlayerInterface;
import Exercise3Game.entities.concretes.Player;

import java.util.List;

public class PlayerDA implements PlayerInterface {
    @Override
    public void add(Player player) {
        System.out.println("Oyuncu eklendi "+player.getFirstName()+" "+player.getLastName());
    }

    @Override
    public void update(Player player) {
        System.out.println("Oyuncu yenilendi "+player.getFirstName()+" "+player.getLastName());

    }

    @Override
    public void delete(Player player) {
        System.out.println("Oyuncu silindi "+player.getFirstName()+" "+player.getLastName());

    }

    @Override
    public List<Player> getAll() {
        return null;
    }
}
