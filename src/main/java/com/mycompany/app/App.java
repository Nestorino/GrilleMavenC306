package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {

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
    
    public static void main(String[] args) {
        GrilleImpl grilleImpl = new GrilleImpl(GRILLE);
        
        grilleImpl.getDimension();
        
        grilleImpl.setValue(0, 0, 'a');
        
        grilleImpl.getValue(0, 0);
        
        grilleImpl.complete();
        
        grilleImpl.possible(0, 0, 'a');
    }
}
