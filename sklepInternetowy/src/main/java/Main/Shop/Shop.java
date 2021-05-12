package Main.Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Shop{
    private String shop_name;
    private ProductStorage productStorage;

    public Shop(String shop_name, ProductStorage productStorage) {
        this.shop_name = shop_name;
        this.productStorage = productStorage;
    }
    public void addProduct(Product product){
        productStorage.addProduct(product);
    }
    public void findProductByName(String product_name){
        productStorage.findProductByName(product_name);
    }
    public void showProducts(){
        productStorage.showProducts();
    }
    public Shop(String shop_name) {
        this.shop_name = shop_name;
    }

    public Shop() {
    }

    public ProductStorage getProductStorage() {
        return productStorage;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

}
