package sda.code.trojkaty;

import org.junit.Before;
import org.junit.Test;
import sda.code.trojkaty.Trojkatnosc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestTrojkatnosci {

    Trojkatnosc x;

    @Before
    public void ustaw() {
        x = new Trojkatnosc();
    }


    @Test
    public void toJestTrojkat() {
        Trojkatnosc x = new Trojkatnosc();
        assertTrue(x.sprawdz(3, 4, 5));
    }

    @Test
    public void toNieJestTrojkat() {
        assertFalse(x.sprawdz(3, 0, 5));
    }

    @Test
    public void trojkatRownoboczny() {
        assertTrue(x.sprawdz(5, 5, 5));
    }

    @Test
    public void sameZeraToNieTrojkat() {
        assertFalse(x.sprawdz(0, 0, 0));
    }

    @Test
    public void trojkatRownoramienny1() {
        assertTrue(x.sprawdz(7, 7, 2));
    }

    @Test
    public void trojkatRownoramienny2() {
        assertTrue(x.sprawdz(2, 7, 7));
    }

    @Test
    public void trojkatRownoramienny3() {
        assertTrue(x.sprawdz(7, 2, 7));
    }

    @Test
    public void zaKrotkiBok1() {
        assertFalse(x.sprawdz(2, 2, 5));
    }

    @Test
    public void zaKrotkiBok2() {
        assertFalse(x.sprawdz(2, 5, 2));
    }

    @Test
    public void zaKrotkiBok3() {
        assertFalse(x.sprawdz(5, 2, 2));
    }

    @Test
    public void toJestTrojkat2() {
        assertTrue(x.sprawdz(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

}
