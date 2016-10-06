package es.upm.miw.iwvg.cv;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {

    C31 c31;

    @Before
    public void setUp() throws Exception {
        c31 = new C31();
    }

    @Test
    public final void testM1() {
        assertEquals("m1", c31.m1());
    }

    @Test
    public final void testM2() {
        assertEquals("m2", c31.m2());
    }

}
