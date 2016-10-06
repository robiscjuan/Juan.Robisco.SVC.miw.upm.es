package es.upm.miw.iwvg.cv;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C52Test {

    C52 c52;

    @Before
    public void setUp() throws Exception {
        c52 = new C52();
    }

    @Test
    public final void testMA() {
        assertEquals("mA", c52.mA());
    }

}
