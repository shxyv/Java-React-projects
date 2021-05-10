package Exercise3Game.dataAccess.abstracts;

import Exercise3Game.entities.concretes.Companies;

import java.util.List;

public interface CompaniesInterface {
    void add(Companies companies);
    void update(Companies companies);
    void delete(Companies companies);
    List<Companies> getAll();
}
