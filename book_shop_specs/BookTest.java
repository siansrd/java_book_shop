import static org.junit.Assert.*;
import org.junit.*;
import book_shop.*;

public class BookTest {

  Book book1;

  @Before
  public void before() {
    book1 = new Book(12.99, "Infinite Jest", "David F. Wallace", GenreType.FICTION);
  }

  @Test
  public void hasGetPrice() {
    assertEquals((Double)12.99, book1.getPrice());
  }


}