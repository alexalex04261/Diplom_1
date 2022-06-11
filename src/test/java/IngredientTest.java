import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {
  @Test
  public void getPriceTest() {
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
    float expected = 100;
    float actual = ingredient.getPrice();
    Assert.assertEquals(expected, actual, 0.001);
  }

  @Test
  public void getNameTest() {
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sour cream", 200);
    String expected = "sour cream";
    String actual = ingredient.getName();
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getTypeTest() {
    Ingredient ingredient = new Ingredient(IngredientType.FILLING, "cutlet", 100);
    var expected = "FILLING";
    String actual = String.valueOf(ingredient.getType());
    Assert.assertEquals(expected, actual);
  }

}
