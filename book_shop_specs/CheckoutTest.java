import static org.junit.Assert.*;
import org.junit.*;
import book_shop.*;


public class CheckoutTest {

  Checkout checkout1;
  Basket basket1;

  @Before
  public void before() {
    Customer customer1 = new Customer("Sian");
    basket1 = new Basket(customer1);
    checkout1 = new Checkout(basket1);
  }

  @Test
  public void checkGetBasket() {
    assertNotNull(checkout1.getBasket());
  }
  

}