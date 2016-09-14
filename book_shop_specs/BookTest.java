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

  @Test
  public void hasGetTitle() {
    assertEquals("Infinite Jest", book1.getTitle());
  }

  @Test
  public void hasGetGenre() {
    assertEquals(GenreType.FICTION, book1.getGenre());
  }

  @Test
  public void hasGetAuthor() {
    assertEquals("David F. Wallace", book1.getAuthor());
  }



}