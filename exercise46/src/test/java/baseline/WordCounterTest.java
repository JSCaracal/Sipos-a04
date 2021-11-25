package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void fileReader() {
        Map<String,Integer>expected = new HashMap<>();
        expected.put("badger",7);
        expected.put("mushroom",2);
        expected.put("snake",1);
        WordCounter w = new WordCounter();
        w.fileReader();
        assertEquals(expected.toString(),w.getWordStorage().toString());
    }
    @Test
    void sortData(){
        WordCounter w = new WordCounter();
        w.fileReader();
        w.sortData();
        ArrayList<String>expected = new ArrayList<>();
        expected.add("snake");
        assertEquals(expected.toString(),w.getWordList().toString());
    }
}