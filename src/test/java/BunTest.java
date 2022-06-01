import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Database;

public class BunTest {
  @Test
  public void getNameTest() {
    Bun bun = new Database().availableBuns().get(0);
    String expected = "black bun";
    String actual = bun.getName();
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getPriceTest() {
    Bun bun = new Database().availableBuns().get(1);
    float expected = 200;
    float actual = bun.getPrice();
    Assert.assertEquals(expected, actual, 0.001);
  }
}
