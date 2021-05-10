package Exercise3Game.dataAccess.concretes;

import Exercise3Game.dataAccess.abstracts.CategoryInterface;
import Exercise3Game.entities.concretes.Category;

import java.util.List;

public class CategoryDA implements CategoryInterface {


    @Override
    public void add(Category category) {
        System.out.println("Kategori eklendi "+category.getCategoryName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Kategori yenilendi "+category.getCategoryName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Kategori silindi "+category.getCategoryName());
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}
