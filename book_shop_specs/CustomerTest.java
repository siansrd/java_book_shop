import static org.junit.Assert.*;
import org.junit.*;
import book_shop.*;

public class CustomerTest {

  Customer customer1;

  @Before
  public void CustomerTest() {
    customer1 = new Customer("James");
  }

  @Test
  public void hasGetName() {
    assertEquals("James", customer1.getName());
  }

  @Test
  public void checkHasCustomerLoyaltyCard() {
    assertEquals(false, customer1.checkLoyaltyCard());
  }

  @Test
  public void canBuyCustomerLoyaltyCard() {
    customer1.buyLoyaltyCard();
    assertEquals(true, customer1.checkLoyaltyCard());
  }

  @Test
  public void canLoyaltyCardExpire() {
    customer1.buyLoyaltyCard();
    customer1.loyaltyCardExpires();
    assertEquals(false, customer1.checkLoyaltyCard());
  }



}