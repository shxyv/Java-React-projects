package Exercise3Game.entities.concretes;

import Exercise3Game.entities.abstracts.EntitiesInterface;

public class Game implements EntitiesInterface {
    private int id;
    private int categoryId;
    private String gameName;
    private double gamePrice;

    public Game(int categoryId, String gameName, double gamePrice) {
        this.categoryId = categoryId;
        this.gameName = gameName;
        this.gamePrice = gamePrice;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }
}
