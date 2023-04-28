import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
public class CheckoutText {

  @Test
  public void testCalculateTotal_PA_ClothingAndNonClothing() {
    Checkout checkout = new Checkout();
    List<Item> items = Arrays.asList(
        new Item("Shirt", "Clothing", 20.0),
        new Item("Book", "Book", 10.0)
    );
    Double expectedTotal = 21.2;
    Double actualTotal = checkout.calculateTotal("PA", items);
    assertEquals(expectedTotal, actualTotal, 0.001);
  }

  @Test
  public void testCalculateTotal_PA_WicEligibleFood() {
    Checkout checkout = new Checkout();
    List<Item> items = Arrays.asList(
        new Item("Milk", "Wic Eligible food", 5.0),
        new Item("Cereal", "Cereal", 3.0)
    );
    Double expectedTotal = 5.0;
    Double actualTotal = checkout.calculateTotal("PA", items);
    assertEquals(expectedTotal, actualTotal, 0.001);
  }

  @Test
  public void testCalculateTotal_NJ_ClothingAndNonClothing() {
    Checkout checkout = new Checkout();
    List<Item> items = Arrays.asList(
        new Item("Shirt", "Clothing", 20.0),
        new Item("Book", "Book", 10.0)
    );
    Double expectedTotal = 21.32;
    Double actualTotal = checkout.calculateTotal("NJ", items);
    assertEquals(expectedTotal, actualTotal, 0.001);
  }

  @Test
  public void testCalculateTotal_NJ_WicEligibleFood() {
    Checkout checkout = new Checkout();
    List<Item> items = Arrays.asList(
        new Item("Milk", "Wic Eligible food", 5.0),
        new Item("Cereal", "Cereal", 3.0)
    );
    Double expectedTotal = 5.0;
    Double actualTotal = checkout.calculateTotal("NJ", items);
    assertEquals(expectedTotal, actualTotal, 0.001);
  }

  @Test
  public void testCalculateTotal_DE_ClothingAndNonClothing() {
    Checkout checkout = new Checkout();
    List<Item> items = Arrays.asList(
        new Item("Shirt", "Clothing", 20.0),
        new Item("Book", "Book", 10.0)
    );
    Double expectedTotal = 30.0;
    Double actualTotal = checkout.calculateTotal("DE", items);
    assertEquals(expectedTotal, actualTotal, 0.001);
  }
}
