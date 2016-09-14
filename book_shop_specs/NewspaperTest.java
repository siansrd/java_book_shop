import static org.junit.Assert.*;
import org.junit.*;
import book_shop.*;

public class NewspaperTest {

  Newspaper newspaper1;

  @Before
  public void before(){
    newspaper1 = new Newspaper( 1.50, "The Times", GenreType.NEWS, "12th January 2016" );
  }

  @Test
  public void getGenre() {
    assertEquals(GenreType.NEWS, newspaper1.getGenre());
  }

  @Test
  public void getDate() {
    assertEquals("12th January 2016", newspaper1.getDate());
  }

}