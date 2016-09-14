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
    return discountedTotal;
  }


}