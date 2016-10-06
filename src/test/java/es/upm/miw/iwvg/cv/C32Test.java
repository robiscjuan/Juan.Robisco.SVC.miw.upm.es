package es.upm.miw.iwvg.cv;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C32Test {

    C32 c32;

    @Before
    public void setUp() throws Exception {
        c32 = new C32();
    }

    @Test
    public final void testMA() {
        assertEquals("mA", c32.mA());
    }

}
