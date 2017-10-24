/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computyourstock;

/**
 *
 * @author comput
 */
public class ComputYourStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launchDB();        
                
        MainMenu mn = new MainMenu();
        mn.setVisible(true);
    }
    
    private static void launchDB() {
        
    }
    
}
