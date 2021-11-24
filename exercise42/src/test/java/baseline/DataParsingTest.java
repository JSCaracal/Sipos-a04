package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DataParsingTest {
    DataParsing parse = new DataParsing();
    @Test
    void readData() {
        ArrayList<Employee> test = parse.readData("./data/exercise42_input.txt");
        assertEquals(7,test.size());
    }

    @Test
    void parseData() {
        Employee test = parse.parseData("Johnson,Jim,56500");
        assertEquals("Jim",test.getFirstName());
        assertEquals("Johnson",test.getLastName());
        assertEquals(56500,test.getSalary());
    }

}