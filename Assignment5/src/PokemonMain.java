

/********************************************************************
 * Programmer:	
 * Class:  CS20S
 *
 * Assignment: MVC design patter example
 *
 * Description: main program for assignment 5
 *				main job is to start up the gui
 *
 * Input:
 *
 * Output: 
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;

public class PokemonMain {  // begin class
    
    public static void main(String[] args) {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********
    
    	
    	
    // create an instance of the ConsoleReader so that we can read data from the keyboard
    
    	
    	
    // ********** Print output Banner **********
    
    	
    	
    // ************************ get input **********************

    	

    // ************************ processing ***************************
	
        
        pokeGUI pokeUI = new pokeGUI();
        pokeUI.setVisible(true);
		
        Controller controller = new Controller();
        controller.addUI(pokeUI);
        pokeUI.addController(controller);
        
 
    // ************************ print output ****************************
    
    
        // ******** closing message *********
        
        System.out.println("end of processing.");
    }  // end main
}  // end class
