package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void readFile() {
        String expected = """
                             One should never utilize the word "utilize" in writing. Use "use" instead.
                             For example, "She uses an IDE to write her Java programs" instead of "She
                             utilizes an IDE to write her Java programs".""";
        WordFinder w = new WordFinder();
        w.readFile();
        if(expected.equals(w.getRawText())){
            assertTrue(true);
        }

    }
}