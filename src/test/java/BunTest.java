import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {

  @Test
  public void getNameTest() {
    Bun bun = new Bun("black bun", 100);
    String expected = "black bun";
    String actual = bun.getName();
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getPriceTest() {
    Bun bun = new Bun("black bun", 100);
    float expected = 100;
    float actual = bun.getPrice();
    Assert.assertEquals(expected, actual, 0.001);
  }
}
