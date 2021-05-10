package Exercise3Game.dataAccess.abstracts;

import Exercise3Game.entities.concretes.Category;

import java.util.List;

public interface CategoryInterface {
    void add(Category category);
    void update(Category category);
    void delete(Category category);
    List<Category> getAll();
}
