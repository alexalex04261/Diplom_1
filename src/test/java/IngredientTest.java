import org.junit.Assert;
import org.junit.Test;
import praktikum.Database;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {
  @Test
  public void getPriceTest() {
    Ingredient ingredient = new Database().availableIngredients().get(0);
    float expected = 100;
    float actual = ingredient.getPrice();
    Assert.assertEquals(expected, actual, 0.001);
  }

  @Test
  public void getNameTest() {
    Ingredient ingredient = new Database().availableIngredients().get(1);
    String expected = "sour cream";
    String actual = ingredient.getName();
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getTypeTest() {
    Ingredient ingredient = new Database().availableIngredients().get(3);
    var expected = "FILLING";
    String actual = String.valueOf(ingredient.getType());
    Assert.assertEquals(expected, actual);
  }

}
