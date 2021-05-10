package Exercise3Game.business.concretes;

import Exercise3Game.entities.concretes.Companies;
import Exercise3Game.entities.concretes.Game;
import Exercise3Game.entities.concretes.Player;

public class CompanyService {
    public double priceAfterDiscount(Companies companies){
        return companies.getGamePrice()-(companies.getGamePrice()*companies.getDiscountPercent())/100;
    }

}
