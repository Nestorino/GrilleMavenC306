package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    static final char[][] GRILLE = {
        {'@', '@', '1', '@', '2', '@', '@', '@', '@'},
        {'@', '@', '@', '5', '@', '7', '@', '@', '@'},
        {'@', '@', '@', '@', '@', '3', '@', '8', '5'},
        {'@', '@', '1', '@', '2', '@', '@', '@', '@'},
        {'@', '@', '@', '5', '@', '7', '@', '@', '@'},
        {'@', '@', '@', '@', '@', '3', '@', '8', '5'},
        {'@', '@', '@', '@', '@', '@', '@', '@', '@'},
        {'@', '@', '@', '@', '@', '3', '@', '8', '5'},
        {'@', '@', '@', '@', '@', '@', '@', '@', '@'}
    };

    /**
     * Test de la m�thode getDimension de la class GrilleImpl.
     */
    @org.junit.Test
    public final void testGetDimension() {
        System.out.println("getDimension");
        GrilleImpl instance = new GrilleImpl(GRILLE);
        int expResult = 0;
        int result = instance.getDimension();
        assertEquals(expResult, result);
        fail("La grille doit avoir une dimension de 9 ou 16.");
    }

    /**
     * Test de la m�thode setValue de la class GrilleImpl.
     */
    @org.junit.Test
    public final void testSetValue() {
        System.out.println("setValue");
        int x = 0;
        int y = 0;
        char value = ' ';
        GrilleImpl instance = new GrilleImpl(GRILLE);
        instance.setValue(x, y, value);
        if (x >= 0 && x <= 8 && y >= 0 && y <= 8 && value == '@') {
            System.out.println("TEst r�ussi.");
        } else {
            fail("Test �chou�.");
        }

    }

    /**
     * Test de la m�thode getValue de la class GrilleImpl.
     */
    @org.junit.Test
    public final void testGetValue() {
        System.out.println("getValue");
        int x = 3;
        int y = 6;
        GrilleImpl instance = new GrilleImpl(GRILLE);
        char expResult = '@';
        char result = instance.getValue(x, y);
        assertEquals(expResult, result);
        fail("Test non r�ussi.");
    }

    /**
     * Test de la m�thode complete de la class GrilleImpl.
     */
    @org.junit.Test
    public final void testComplete() {
        System.out.println("Complete");
        GrilleImpl instance = new GrilleImpl(GRILLE);
        boolean expResult = false;
        boolean result = instance.complete();
        assertEquals(expResult, result);
        fail("Test r�ussi.");
    }

    /**
     * Test de la m�thode possible de la class GrilleImpl.
     */
    @org.junit.Test
    public final void testPossible() {
        System.out.println("Possible");
        int x = 0;
        int y = 0;
        char value = ' ';
        GrilleImpl instance = new GrilleImpl(GRILLE);
        boolean expResult = false;
        boolean result = instance.possible(x, y, value);
        assertEquals(expResult, result);
        fail("Test r�ussi.");
    }

}
