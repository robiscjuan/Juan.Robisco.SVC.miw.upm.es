package es.upm.miw.iwvg.cv;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {

    C51 c51;

    @Before
    public void setUp() throws Exception {
        c51 = new C51();
    }

    @Test
    public final void testM1() {
        assertEquals("m1", c51.m1());
    }

    @Test
    public final void testM2() {
        assertEquals("m2", c51.m2());
    }

}
