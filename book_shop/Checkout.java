package book_shop;

public class Checkout {

  Basket basket;

  public Checkout(Basket basket) {
    this.basket = basket;
  }

  public Basket getBasket() {
    return basket;
  }

  public boolean checkCustomerLoyaltyCard() {
    Customer customer = basket.getBasketsCustomer();
    return customer.checkLoyaltyCard();
  }

  public Double loyaltyCardDiscount() {
    Double total = basket.totalItems();
    Double discountedTotal = total / 100 * 98;  
    return discountedTotal = Math.round(discountedTotal * 100.0) / 100.0;
  }

  public Double tenPercentOffOverTwenty() {
    Double total = basket.totalItems();
    if (total > 20.00) {
      Double discountedTotal = total / 100 * 90;
      return discountedTotal = Math.round(discountedTotal * 100.0) / 100.0;
    } else {
      return total = Math.round(total * 100.0) / 100.0;
    }
  }


}