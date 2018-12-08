package org.somedomain.producta.packagea;

import java.util.concurrent.ThreadLocalRandom;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AnotherFlakyTest {
    @Test
    public void testFlaky1() {
        int randNum = ThreadLocalRandom.current().nextInt(1, 11);
        assertTrue(randNum > 1);
    }
}
