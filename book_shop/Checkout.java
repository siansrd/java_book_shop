package book_shop;

public class Checkout {

  Basket basket;

  public Checkout(Basket basket) {
    this.basket = basket;
  }

  public Basket getBasket() {
    return basket;
  }


}