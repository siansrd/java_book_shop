package book_shop;
import java.util.*;

public class Basket {

  ArrayList contents;
  Customer customer;

  public Basket(Customer customer) {
    contents = new ArrayList<Product>();
    this.customer = customer;
  }

  public Customer getBasketsCustomer() {
    return customer;
  }

  public ArrayList getBasketContents() {
    return contents;
  }


}