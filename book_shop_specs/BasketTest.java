import static org.junit.Assert.*;
import org.junit.*;
import book_shop.*;


public class BasketTest {

  Customer customer1;
  Basket basket1;

  @Before
  public void before() {
    Customer customer1 = new Customer("Sian");
    basket1 = new Basket(customer1);
  }

  @Test
  public void hasGetBasketCustomer() {
    Customer customer = basket1.getBasketsCustomer();
    assertEquals("Sian", customer.getName());
  }

  @Test
  public void hasGetBasketContents() {
    assertNotNull(basket1.getBasketContents());
  }


}