import static org.junit.Assert.*;
import org.junit.*;
import book_shop.*;

public class MagazineTest {

  Magazine mag1;

  @Before 
  public void before() {
    mag1 = new Magazine(2.99, "The Brain", GenreType.PHYCHOLOGY, 76);
  }

  @Test
  public void hasGetPrice() {
    assertEquals((Double)2.99, mag1.getPrice());
  }

  @Test
  public void hasGetTitle() {
    assertEquals("The Brain", mag1.getTitle());
  }

  @Test
  public void hasGetGenre() {
    assertEquals(GenreType.PHYCHOLOGY, mag1.getGenre());
  }

  @Test
  public void hasGetIssueNum() {
    assertEquals(76, mag1.getIssueNum());
  }



}
