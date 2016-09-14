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



}