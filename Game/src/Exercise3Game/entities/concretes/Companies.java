package Exercise3Game.entities.concretes;

import Exercise3Game.entities.abstracts.EntitiesInterface;

public class Companies implements EntitiesInterface {
    private int id;
    private int playerId;
    private int gameId;
    private int categoryId;
    private String gameName;
    private double gamePrice;
    private double discountPercent;

    public Companies(int id, int playerId, int gameId, int categoryId,String gameName, double gamePrice, double discountPercent) {
        this.id = id;
        this.playerId = playerId;
        this.gameId = gameId;
        this.categoryId = categoryId;
        this.gameName=gameName;
        this.gamePrice = gamePrice;
        this.discountPercent = discountPercent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
