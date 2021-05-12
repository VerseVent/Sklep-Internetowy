package Main;

import Main.Customer.PersonCustomer;
import Main.Repo.Logger;
import Main.Shipment.DirectShipment;
import Main.Shop.Message;
import Main.Shop.ProductStorageProxy;
import Main.Shop.Shop;
import Main.Shop.Tshirt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class Main{
    public static void main(String[] args) throws Exception {
        Logger logger = Message.getInstance();
        PersonCustomer personCustomer1 = new PersonCustomer("Address1");
        Shop shop1 = new Shop("Sklep odzieżowy", new ProductStorageProxy(logger));
        shop1.addProduct(new Tshirt(1L,"T-Shirt1",299.99f, 2));
        shop1.findProductByName("T-Shirt1");
        shop1.addProduct(new Tshirt(2L,"T-Shirt2",199.99f, 4));
        shop1.showProducts();

        String file = "src\\ProductsList.csv";
        BufferedReader reader = null;
        String line ="";

        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine())!=null){
                String [] row = line.split(",");
                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
