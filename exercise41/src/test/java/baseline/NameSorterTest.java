package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {
    File fileTest = new File("./data/exercise41_input.txt");
    NameSorter sorter = new NameSorter();
    ArrayList<String> expected = sorter.readNames("./data/exercise41_input.txt");
    @BeforeEach
    void setUp() {
    }

    @Test
    void readNames() {
        ArrayList<String> test;
        test = sorter.readNames("./data/exercise41_input.txt");
        assertEquals(expected.toString(),test.toString());

    }

    @Test
    void sortNames() {
        ArrayList<String> expectedSorted = new ArrayList<>();
        expectedSorted = sorter.readNames("./data/exercise41_input.txt");
        sorter.sortNames();
        assertEquals(expectedSorted,sorter.getNames());
    }

    @Test
    void writeNames() {
        sorter.sortNames();
        sorter.writeNames("./src/test/resources/testOutput.txt");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        File expected = new File("./src/test/resources/expected_output.txt");
        File test = new File("./src/test/resources/testOutput.txt");
        try {
            Scanner inputReader = new Scanner(expected);
            while(inputReader.hasNextLine()){
                String line = inputReader.nextLine();
                sb1.append(line);
            }
            inputReader.close();
        }catch (FileNotFoundException e){
            System.out.println("No File found");
            e.printStackTrace();
        }
        try{
            Scanner inputReader1 = new Scanner(test);
            while (inputReader1.hasNextLine()){
                String line = inputReader1.nextLine();
                sb2.append(line);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        assertEquals(sb1.toString(),sb2.toString());

    }
}