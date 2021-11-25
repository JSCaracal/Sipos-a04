package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    Inventory t = new Inventory();
    @Test
    void readJson() {
        t.readJson();
        assertEquals(3,t.getInvenList().size());
    }

    @Test
    void isInInventory() {
        t.readJson();
        assertEquals(null,t.isInInventory("Floppa"));
        if(t.isInInventory("Widget")!= null){
            assertTrue(true);
        }
        else {
            assertFalse(false);
        }
    }
}