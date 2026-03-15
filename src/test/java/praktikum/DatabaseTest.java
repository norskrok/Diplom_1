package praktikum;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class DatabaseTest {

    @Test
    public void databaseBunsAndIngredientsNotNullTest() {
        Database database = new Database();
        List<Bun> buns = database.availableBuns();
        List<Ingredient> ingredients = database.availableIngredients();

        assertNotNull("Список булок не должен быть null", buns);
        assertNotNull("Список ингредиентов не должен быть null", ingredients);
        assertFalse("Список булок не должен быть пустым", buns.isEmpty());
        assertFalse("Список ингредиентов не должен быть пустым", ingredients.isEmpty());
    }
}