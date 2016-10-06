package es.upm.miw.iwvg.cv;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C11Test {

    C11 c11;

    @Before
    public void setUp() throws Exception {
        c11 = new C11();
    }

    @Test
    public final void testM1() {
        assertEquals("m1", c11.m1());
    }

    @Test
    public final void testM2() {
        assertEquals("m2", c11.m2());
    }

}
