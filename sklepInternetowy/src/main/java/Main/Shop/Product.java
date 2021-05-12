package Main.Shop;

import java.util.List;
import java.util.Set;

public class Product extends Shop{
    private Long product_id;
    private String product_name;
    private float product_price;
    private int product_quantity;

    public Product(){

    }
    public Product(String product_name){
        this.product_name=product_name;
    }


    public Product(Long product_id, String product_name, float product_price, int product_quantity) {
        this.product_id = product_id;
        this.product_name=product_name;
        this.product_price = product_price;
        this.product_quantity = product_quantity;
    }


    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", product_quantity=" + product_quantity +
                '}';
    }
}
