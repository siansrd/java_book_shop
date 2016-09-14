import static org.junit.Assert.*;
import org.junit.*;
import book_shop.*;


public class BasketTest {

  Customer customer1;
  Basket basket1;
  Book book1;

  @Before
  public void before() {
    Customer customer1 = new Customer("Sian");
    basket1 = new Basket(customer1);
    book1 = new Book(12.99, "Infinite Jest", "David F. Wallace", GenreType.FICTION);
  }

  @Test
  public void hasGetBasketCustomer() {
    Customer customer = basket1.getBasketsCustomer();
    assertEquals("Sian", customer.getName());
  }

  @Test
  public void checkGetItems() {
    assertNotNull(basket1.getContents());
  }

  @Test
  public void checkCountItems() {
    assertEquals(0, basket1.countItems());
  }

  @Test
  public void canAddProduct() {
    basket1.addItem(book1);
    assertEquals(1, basket1.countItems());
  }

  @Test
  public void canRemoveItem() {
    basket1.addItem(book1);
    basket1.removeItem(book1);
    assertEquals(0, basket1.countItems());
  }

  @Test
  public void canEmptyContents() {
    basket1.addItem(book1);
    basket1.emptyContents();
    assertEquals(0, basket1.countItems());
  }


}