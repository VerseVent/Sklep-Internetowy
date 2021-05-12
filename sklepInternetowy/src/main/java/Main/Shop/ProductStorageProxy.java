package Main.Shop;

import Main.Repo.Logger;

public class ProductStorageProxy extends ProductStorage{
    Logger logger;

    public ProductStorageProxy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void addProduct(Product product) {
        super.addProduct(product);
        logger.showMessage("You added "+product.getProduct_name());
    }

    @Override
    public void findProductByName(String product_name) {
        super.findProductByName(product_name);
    }

    @Override
    public void showProducts() {
        super.showProducts();
    }

    @Override
    public void clearProducts() {
        super.clearProducts();
        logger.showMessage("You have cleaned product storage");
    }
}
