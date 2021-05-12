package Main.Shipment;

import Main.Shop.Product;

import java.util.List;

public class DirectShipment implements IShippable{
    private List<Product> products;
    ShipmentState State;
    private String address;


    public DirectShipment(String address) {
        this.address = address;
    }

    public DirectShipment() {
    }

    @Override
    public void getState(ShipmentState State) {

    }

    @Override
    public void Order(List<Product> products) throws Exception {
        State = ShipmentState.Ordered;
        this.products=products;
    }

    public void setAddress(String address){
        this.address=address;
    }

    @Override
    public void Prepare(List<Product> products) throws Exception {
        if(State!=ShipmentState.Ordered){
            throw new Exception("Your product is not ordered yet");
        }
        State = ShipmentState.Prepared;
        this.products=products;

    }

    @Override
    public void send(String address) throws Exception {
        setAddress(address);
        if(State!=ShipmentState.Prepared){
            throw new Exception("Your product is not prepared yet");
        }
        State=ShipmentState.Sent;

    }

    @Override
    public String toString() {
        return "DirectShipment{" +
                "" + products +
                ", State=" + State +
                ", address='" + address + '\'' +
                '}';
    }
}
