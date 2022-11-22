import java.util.Map;

public class Basket {
    public static long sum(Map<String, Integer> prices, Purchase[] purchases) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Purchase purchase : purchases) { // Перевел в foreach
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}
