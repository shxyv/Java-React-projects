package Exercise3Game.dataAccess.concretes;

import Exercise3Game.dataAccess.abstracts.CompaniesInterface;
import Exercise3Game.entities.concretes.Companies;

import java.util.List;

public class CompaniesDA implements CompaniesInterface {
    @Override
    public void add(Companies companies) {
        System.out.println("Kompaniya eklendi! Oyun adi: "+companies.getGameName()+"Player id: "+companies.getPlayerId());
    }

    @Override
    public void update(Companies companies) {
        System.out.println("Kompaniya yenilendi! Oyun adi: "+companies.getGameName()+"Player id: "+companies.getPlayerId());

    }

    @Override
    public void delete(Companies companies) {
        System.out.println("Kompaniya silindi! Oyun adi: "+companies.getGameName()+"Player id: "+companies.getPlayerId());

    }

    @Override
    public List<Companies> getAll() {
        return null;
    }
}
