import static org.junit.Assert.*;
import org.junit.*;
import book_shop.*;

public class StationaryTest {

  Stationary postit;

  @Before
  public void before() {
    postit = new Stationary(2.99, "Post-It Notes");
  }

  @Test
  public void hasGetPrice() {
    assertEquals((Double)2.99, postit.getPrice());
  }

  @Test
  public void hasGetTitle() {
    assertEquals("Post-It Notes", postit.getTitle());
  }



}

