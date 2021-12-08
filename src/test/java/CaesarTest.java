import org.junit.*;
import static org.junit.Assert.*;

public class CaesarTest {

    @Test
    public void runCipher_returnStringPlainText_String(){
        Caesar testCipher = new Caesar("josh",2);
        testCipher.getPlainWord();
        assertEquals("josh", testCipher.getPlainWord());
    }
