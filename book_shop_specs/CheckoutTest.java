import static org.junit.Assert.*;
import org.junit.*;
import book_shop.*;


public class CheckoutTest {
  Customer customer1;
  Checkout checkout1;
  Basket basket1;
  Book book1;
  Stationary postit;

  @Before
  public void before() {
    customer1 = new Customer("Sian");
    basket1 = new Basket(customer1);
    checkout1 = new Checkout(basket1);
    book1 = new Book(12.99, "Infinite Jest", "David F. Wallace", GenreType.FICTION);
    postit = new Stationary(2.99, "Post-It Notes");
  }

  @Test
  public void checkGetBasket() {
    assertNotNull(checkout1.getBasket());
  }

  @Test
  public void canCheckCustomerLoyalityCard() {
    customer1.buyLoyaltyCard();
    assertEquals(true, checkout1.checkCustomerLoyaltyCard());
  }


  @Test
  public void checkLoyalityCardDiscount() {
    basket1.addItem(book1);
    basket1.addItem(postit);
    assertEquals((Double)15.6604, checkout1.loyaltyCardDiscount());
  }
  

}