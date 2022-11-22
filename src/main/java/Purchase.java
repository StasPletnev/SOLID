import java.util.Map;

public class Purchase {
    protected String title;
    protected int count;
    protected Purchase[] purchases = new Purchase[Main.products.size()];//Убрал магическое число

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public Purchase[] getPurchases() {
        return purchases;
    }
}
