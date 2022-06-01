import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.*;

import java.util.List;

@RunWith(Parameterized.class)
public class BurgerParametrizedTest {
  private final Bun bun;
  private final List<Ingredient> ingredients;
  private final float expectedPrice;
  private final String expectedReceipt;

  public BurgerParametrizedTest(Bun bun, List<Ingredient> ingredients, float expectedPrice, String expectedReceipt) {
    this.bun = bun;
    this.ingredients = ingredients;
    this.expectedPrice = expectedPrice;
    this.expectedReceipt = expectedReceipt;
  }

  @Parameterized.Parameters
  public static Object[][] getBurgerPrice() {
    return new Object[][] {
            {
                    new Database().availableBuns().get(0),
                    List.of(
                            new Database().availableIngredients().get(0),
                            new Database().availableIngredients().get(3),
                            new Database().availableIngredients().get(5)
                    ),
                    700,
                    "(==== black bun ====)\r\n" +
                    "= sauce hot sauce =\r\n" +
                    "= filling cutlet =\r\n" +
                    "= filling sausage =\r\n" +
                    "(==== black bun ====)\r\n" +
                    "\r\n" +
                    "Price: 700,000000\r\n"
            },
            {
                    new Database().availableBuns().get(2),
                    List.of(
                            new Database().availableIngredients().get(1),
                            new Database().availableIngredients().get(4)
                    ),
                    1000,
                    "(==== red bun ====)\r\n" +
                    "= sauce sour cream =\r\n" +
                    "= filling dinosaur =\r\n" +
                    "(==== red bun ====)\r\n" +
                    "\r\n" +
                    "Price: 1000,000000\r\n"
            },
            {
                    new Database().availableBuns().get(1),
                    List.of(),
                    400,
                    "(==== white bun ====)\r\n" +
                    "(==== white bun ====)\r\n" +
                    "\r\n" +
                    "Price: 400,000000\r\n"
            }
    };
  }

  @Test
  public void getPriceTest() {
    Burger burger = new Burger();
    burger.setBuns(bun);
    burger.ingredients = ingredients;
    float actual = burger.getPrice();
    Assert.assertEquals(expectedPrice, actual, 0.001);
  }

  @Test
  public void getReceiptTest() {
    Burger burger = new Burger();
    burger.setBuns(bun);
    burger.ingredients = ingredients;
    String actual = burger.getReceipt();
    Assert.assertEquals(expectedReceipt, actual);
  }
}
