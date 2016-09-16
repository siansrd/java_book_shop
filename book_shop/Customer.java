package book_shop;

public class Customer {

  private String name;
  private boolean loyaltyCard;

  public Customer(String name) {
    this.name = name;
    loyaltyCard = false;
  }

  public String getName() {
    return name;
  }

  public boolean checkLoyaltyCard() {
    return loyaltyCard;
  }

  public void buyLoyaltyCard() {
    loyaltyCard = true;
  }

  public void loyaltyCardExpires() {
    loyaltyCard = false;
  }



}