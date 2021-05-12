package Main.Shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProductStorage extends Product{

    private List<Product> products = new ArrayList<Product>();


    public void addProduct(Product product){
        products.add(product);
    }
    public void showProducts(){
        System.out.println("Shop staff");
        for (Product product: products) {
            System.out.println(product.toString());
        }
    }
    public void findProductByName(String product_name){
        for (Product product: products) {
            if(product.getProduct_name().equals(product_name)){
                System.out.println("You found this product by name: "+product.toString());
            }

        }
    }
    public void clearProducts(){
        products.clear();
    }

    public List<Product> getProducts() {
        return products;
    }
}