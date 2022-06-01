import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import praktikum.*;

public class BurgerTest {
  @Mock
  Bun bun;

  @Mock
  Ingredient ingredient;

  @Test
  public void setBunsTest() {
    Burger burger = new Burger();
    burger.setBuns(bun);
    Assert.assertEquals(bun, burger.bun);
  }

  @Test
  public void addIngredientTest() {
    Burger burger = new Burger();
    burger.addIngredient(ingredient);
    Assert.assertEquals(ingredient, burger.ingredients.get(0));
  }

  @Test
  public void removeIngredientTest() {
    Burger burger = new Burger();
    burger.addIngredient(ingredient);
    burger.removeIngredient(0);
    Assert.assertEquals(0, burger.ingredients.size());
  }

  @Test
  public void moveIngredientTest() {
    Burger burger = new Burger();
    Ingredient ingredient1 = new Database().availableIngredients().get(0);
    burger.addIngredient(ingredient1);
    burger.addIngredient(ingredient);
    burger.moveIngredient(0, 1);
    Assert.assertEquals(ingredient1, burger.ingredients.get(1));
  }
}
