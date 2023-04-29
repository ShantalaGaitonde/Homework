import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CheckoutTest {

  @Test
  public void testCalculateTotal_PA_ClothingAndNonClothing() {
    Checkout checkout = new Checkout();
    List<Item> items = Arrays.asList(
        new Item("Shirt", "Clothing", 20.0),
        new Item("Book", "others", 10.0)
    );
    Double expectedTotal = 30.6;
    Double actualTotal = checkout.calculateTotal("PA", items);
    assertEquals(expectedTotal, actualTotal, 0.001);
  }

  @Test
  public void testCalculateTotal_PA_WicEligibleFood() {
    Checkout checkout = new Checkout();
    List<Item> items = Arrays.asList(
        new Item("Milk", "Wic Eligible food", 5.0),
        new Item("Cereal", "others", 3.0)
    );
    Double expectedTotal = 8.18;
    Double actualTotal = checkout.calculateTotal("PA", items);
    assertEquals(expectedTotal, actualTotal, 0.001);
  }

  @Test
  public void testCalculateTotal_NJ_ClothingAndNonClothing() {
    Checkout checkout = new Checkout();
    List<Item> items = Arrays.asList(
        new Item("fur_sweater", "Clothing", 100.0),
        new Item("Book", "others", 10.0)
    );
    Double expectedTotal = 117.26;
    Double actualTotal = checkout.calculateTotal("NJ", items);
    assertEquals(expectedTotal, actualTotal, 0.001);
  }

  @Test
  public void testCalculateTotal_NJ_WicEligibleFood() {
    Checkout checkout = new Checkout();
    List<Item> items = Arrays.asList(
        new Item("Milk", "Wic Eligible food", 5.0),
        new Item("Television", "others", 300.0)
    );
    Double expectedTotal = 324.8;
    Double actualTotal = checkout.calculateTotal("NJ", items);
    assertEquals(expectedTotal, actualTotal, 0.001);
  }

  @Test
  public void testCalculateTotal_DE_ClothingAndNonClothing() {
    Checkout checkout = new Checkout();
    List<Item> items = Arrays.asList(
        new Item("Shirt", "Clothing", 20.0),
        new Item("Book", "others", 10.0)
    );
    Double expectedTotal = 30.0;
    Double actualTotal = checkout.calculateTotal("DE", items);
    assertEquals(expectedTotal, actualTotal, 0.001);
  }
}
