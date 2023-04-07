import java.util.Arrays;

public class Basket {
    private Product[] purchasedProducts;

    public Basket(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "purchasedProducts=" + Arrays.toString(purchasedProducts) +
                '}';
    }
}