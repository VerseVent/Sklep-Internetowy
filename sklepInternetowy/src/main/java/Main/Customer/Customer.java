package Main.Customer;

//import Main.Repo.AbstractFactory;
//import Main.Repo.AbstractProductA;
//import Main.Repo.AbstractProductB;

import Main.Shipment.IShippable;
import Main.Shop.Product;

import java.util.List;

public abstract class Customer {
    private Long id_customer;
    protected String defaultAddress;
    protected IShippable defaultShipment;
    abstract void IssueOrder(List<Product> products) throws Exception;

//    private AbstractProductA productA;
//    private AbstractProductB productB;

//    private String username;
//    private String password;
//    private String firstName;
//    private String lastName;
//    private int age;
//    private String phone_number;
//    private String customer_address;
//    private String credit_card_number;

//    public Customer(AbstractFactory abstractFactory){
//        productA = abstractFactory.createProductA();
//        productB = abstractFactory.createProductB();
//    }
//    public void execute() {
//        productB.interact(productA);
//    }


//    public Customer(Long id_customer, String username, String password, String firstName, String lastName, int age, String phone_number, String customer_address, String credit_card_number) {
//        this.id_customer = id_customer;
//        this.username = username;
//        this.password = password;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.phone_number = phone_number;
//        this.customer_address = customer_address;
//        this.credit_card_number = credit_card_number;
//    }
//
//    public Customer(Long id_customer, String username, String password, String phone_number, String customer_address, String credit_card_number) {
//        this.id_customer = id_customer;
//        this.username = username;
//        this.password = password;
//        this.phone_number = phone_number;
//        this.customer_address = customer_address;
//        this.credit_card_number = credit_card_number;
//    }
//
//    public Customer(Long id_customer, String username, String password, String firstName, String lastName, String phone_number, String customer_address, String credit_card_number) {
//        this.id_customer = id_customer;
//        this.username = username;
//        this.password = password;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phone_number = phone_number;
//        this.customer_address = customer_address;
//        this.credit_card_number = credit_card_number;
//    }
//
//    public Long getId_customer() {
//        return id_customer;
//    }
//
//    public void setId_customer(Long id_customer) {
//        this.id_customer = id_customer;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public String getCustomer_address() {
//        return customer_address;
//    }
//
//    public void setCustomer_address(String customer_address) {
//        this.customer_address = customer_address;
//    }
//
//    public String getCredit_card_number() {
//        return credit_card_number;
//    }
//
//    public void setCredit_card_number(String credit_card_number) {
//        this.credit_card_number = credit_card_number;
//    }
}
