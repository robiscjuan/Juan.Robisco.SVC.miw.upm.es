package es.upm.miw.iwvg.cv;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {

    C12 c12;

    @Before
    public void setUp() throws Exception {
        c12 = new C12();
    }

    @Test
    public final void testMA() {
        assertEquals("mA", c12.mA());
    }

}
