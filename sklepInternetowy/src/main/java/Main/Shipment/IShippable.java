package Main.Shipment;

import Main.Shop.Product;

import java.util.List;

public interface IShippable {
    void getState (ShipmentState State);
    void Order(List<Product> products) throws Exception;
    void Prepare(List<Product> products) throws Exception;

    void send(String address) throws Exception;
}
