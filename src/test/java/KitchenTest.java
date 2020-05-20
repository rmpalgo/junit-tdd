import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KitchenTest {

    Kitchen emptyKitchen = new Kitchen();
    Kitchen kitchenWithOne = new Kitchen();

    @Before
    public void setup() {
        kitchenWithOne.add("blue corn");
    }

    @Test
    public void testIfEmptyWorks() {
        Kitchen myKitchen = new Kitchen();
        assertTrue(myKitchen.isEmpty());
    }

    @Test
    public void testIfAddWorks() {
        Kitchen myKitchen = new Kitchen();
        myKitchen.add("blue corn");
        assertFalse(myKitchen.isEmpty());
    }

    @Test
    public void testIfPopWorks() {
        kitchenWithOne.pop();
        assertTrue(kitchenWithOne.isEmpty());
    }

    @Test
    public void testIfContainsWorks() {
        assertTrue(kitchenWithOne.contains("blue corn"));
        assertFalse(kitchenWithOne.contains("yellow corn"));
    }

    @Test
    public void testIfSizeWorks(){
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
    }

}
