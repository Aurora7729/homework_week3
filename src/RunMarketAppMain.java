import supermarket.Category;
import supermarket.GamePointCard;
import supermarket.GraphicsCard;
import supermarket.Phone;

import java.util.Date;

public class RunMarketAppMain {
    public static void main(String[] args) {

        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);
        GamePointCard gamePointCard = new GamePointCard(
                "手机001", "Phone001", 100, 1999, 999, Category.GAMES,
                produceDate, expireDate
        );

        GraphicsCard graphicsCard = new GraphicsCard(
                "RTX3080Ti", "GraphicsCard001", 5, 4999, 3999,
                Category.GRAPHICS_CARD, "Ampere","8nm","GDDR6",
                12,10240,200,produceDate, expireDate
        );
        Phone phone = new Phone(
                "Iphone13", "Phone001", 100, 5999, 4999,
                Category.PHONE, 5.5, 3.9, 4, 256, "APPLE", "IOS",
                produceDate, expireDate
        );
        System.out.println("---------------" + phone.name + "---------------");
        phone.describe();
        phone.describePhone();
        System.out.println("---------------" + graphicsCard.name + "---------------");
        graphicsCard.describe();
        graphicsCard.describeGraphics();
        System.out.println("---------------" + gamePointCard.name + "---------------");
        gamePointCard.describe();


    }

}
