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

  public ArrayList getContents() {
    return contents;
  }

  public int countItems() {
    return contents.size();
  }

  public void addItem(Product item) {
    contents.add(item);
  }

}