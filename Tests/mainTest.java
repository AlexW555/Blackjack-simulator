import org.junit.Test;

import static org.junit.Assert.*;

public class mainTest {

    @Test
    public void main() {
        Deck d = new Deck();

        assertEquals(d, d.toString());
    }
}