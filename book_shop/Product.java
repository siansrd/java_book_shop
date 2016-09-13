package book_shop;

public abstract class Product {

  private Double price;
  private String title;

  public Product(Double price, String title) {
    this.price = price;
    this.title = title;
  }

  public Double getPrice() {
    return price;
  }

  public String getTitle() {
    return title;
  }


}