package book_shop;
import java.util.*;
import java.util.Collections;

public class Checkout {

  Basket basket;

  public Checkout(Basket basket) {
    this.basket = basket;
  }

  public Basket getBasket() {
    return basket;
  }

  public Double roundOff(Double total) {
    return Math.round(total * 100.0) / 100.0;
  }

  public boolean checkCustomerLoyaltyCard() {
    Customer customer = basket.getBasketsCustomer();
    return customer.checkLoyaltyCard();
  }

  public Double loyaltyCardDiscount() {
    Double total = basket.totalItems();
    Double discountedTotal = total / 100 * 98;  
    return roundOff(discountedTotal);
  }

  public Double tenPercentOffOverTwenty() {
    Double total = basket.totalItems();
    if (total > 20.00) {
      Double discountedTotal = total / 100 * 90;
      return roundOff(discountedTotal);
    } else {
      return roundOff(total);
    }
  }



  // Needs fixing: only works if there are an even number of books
  public Double bOGOFF(Double total) {
    ArrayList<Product> items = basket.getContents();
    ArrayList<Double> bookPrices = new ArrayList<Double>();

    // New ArrayList containing all book prices
    for (Product item : items) {
      if (item instanceof Book) {
        bookPrices.add(item.getPrice());    
      } 
    }

    Collections.sort(bookPrices);
    int index = bookPrices.size() / 2;

    // Remove the cheapest half of the ArrayList
    int counter = 0;
    for(Double price : bookPrices) {
      while (counter < index) {
        bookPrices.remove(counter);
        counter += 1;
      }
    }

    // Total the most expensive half of the ArrayList
    Double discountedTotal = 0.00;
    for (Double price : bookPrices) {
      discountedTotal += price;
    }
    return discountedTotal;
  }
 

}