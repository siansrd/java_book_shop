package book_shop;
import java.util.*;

public class Basket {

  Customer customer;
  ArrayList contents;

  public Basket(Customer customer) {
    contents = new ArrayList<Product>();
    this.customer = customer;
  }

  public Customer getBasketsCustomer() {
    return customer;
  }


}