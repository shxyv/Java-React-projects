package Exercise3Game;

import Exercise3Game.business.concretes.CompanyService;
import Exercise3Game.business.concretes.GameService;
import Exercise3Game.dataAccess.concretes.PlayerDA;
import Exercise3Game.entities.concretes.Companies;
import Exercise3Game.entities.concretes.Game;
import Exercise3Game.entities.concretes.Player;

public class Main {
    public static void main(String[] args) {
        Player player=new Player(1,"Ilgar","Shxyv",132312,"05.03.2003");
        PlayerDA playerDA=new PlayerDA();
        playerDA.add(player);
        playerDA.delete(player);

        Game game = new Game(1,"Call of Duty",50.0);


        Companies company=new Companies(1,1,1,1,"Call of Duty",50.0,5.0);
        CompanyService companyService=new CompanyService();
        GameService gameService=new GameService();
        System.out.println(companyService.priceAfterDiscount(company));
        gameService.gameSale(player,game);
    }
}
