/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

/**
 *
 * @author hecto
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Visual visual = new Visual();
//        visual.setVisible(true);
//        visual.setLocationRelativeTo(null);
        
        Menu menu = new Menu();
        
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        AdminPalabrasSecretas palabrasSecretas = new AdminPalabrasSecretas();
        
    }
    
}
