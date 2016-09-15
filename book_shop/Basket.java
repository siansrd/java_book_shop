package book_shop;
import java.util.*;

public class Basket {

  ArrayList<Product> contents;
  Customer customer;

  public Basket(Customer customer) {
    contents = new ArrayList<Product>();
    this.customer = customer;
  }

  public Customer getBasketsCustomer() {
    return customer;
  }

  public ArrayList<Product> getContents() {
    return contents;
  }

  public int countItems() {
    return contents.size();
  }

  public void addItem(Product item) {
    contents.add(item);
  }

  public void removeItem(Product item) {
    contents.remove(item);
  }

  public void emptyContents() {
    contents.clear();
  }

  public Double totalItems() {
    Double total = 0.00;
    for (Product item : contents) {
      total += item.getPrice();
    }
    return total;
  }

  // public void removeItem(String title) {
  //   for (Product item : contents) {
  //     if (item.getTitle() == title) { 
  //     contents.remove(item);
  //     }
  //   }
  // }

}