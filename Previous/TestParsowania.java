package sda.code.trojkaty;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestParsowania {
    ParserTrojek x;

    @Before
    public void ustaw() {
        x = new ParserTrojek();
    }

    @Test
    public void trzyLiczby() {
        int[] wynik = x.parsuj("1 2 3");
        assertArrayEquals(new int[]{1, 2, 3}, wynik);
    }

    @Test
    public void trzyLiczbyZPrzecinkami() {
        assertArrayEquals(new int[]{1, 2, 3}, x.parsuj("1, 2, 3"));
    }

    @Test
    public void trzyLiczbyZDziwnymiPrzecinkami() {
        assertArrayEquals(new int[]{1, 2, 3}, x.parsuj(", 1 , 2    3"));
    }

    @Test
    public void trzyLiczbyUjemne() {
        assertArrayEquals(new int[]{-1, -2, -3}, x.parsuj("-1 -2 -3"));
    }

    @Test
    public void trzyLiczbyAleDalekoOdSiebie() {
        assertArrayEquals(new int[]{1, 2, 3}, x.parsuj("          1     2         3 "));
    }

    @Test(expected = IllegalArgumentException.class)
    public void dwieLiczby() {
        x.parsuj("1 2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void jednaLiczba() {
        x.parsuj("1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void brakLiczb() {
        x.parsuj("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nieMaNiczego() {
        x.parsuj(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void czteryLiczby() {
        x.parsuj("1 2 3 4");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nieLiczby() {
        x.parsuj("f f f");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nieTylkoLiczby() {
        x.parsuj("1 2 trzy");
    }

    @Test
    public void bardzoDużeLiczby() {
        assertArrayEquals(new int[]{
                Integer.MAX_VALUE,
                Integer.MAX_VALUE,
                Integer.MAX_VALUE
        }, x.parsuj("2147483647, 2147483647, 2147483647"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void zaDużeLiczby() {
        x.parsuj("2147483647 2147483648 2147483647");
    }
}