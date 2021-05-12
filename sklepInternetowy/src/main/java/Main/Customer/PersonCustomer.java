package Main.Customer;

import Main.Shipment.DirectShipment;
import Main.Shop.Product;

import java.util.List;

public class PersonCustomer extends Customer{
    public PersonCustomer(String address) {
        DirectShipment directShipment = new DirectShipment();
        directShipment.setAddress(address);
        this.defaultShipment = directShipment;

    }

    @Override
    void IssueOrder(List<Product> products) throws Exception {
        defaultShipment.Prepare(products);
    }
}
