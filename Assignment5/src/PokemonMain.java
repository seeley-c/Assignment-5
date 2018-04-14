

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

    // ********** Print output Banner **********
    	
    // ************************ get input **********************
    
    // ************************ processing ***************************
	
        
        pokeGUI pokeUI = new pokeGUI(); //initializes gui
        pokeUI.setVisible(true);        //make the GUI visible on program start
		
        Controller controller = new Controller(); //intitialize controller
        controller.addUI(pokeUI);                 //adds GUI
        pokeUI.addController(controller);         //adds controller
        
 
    // ************************ print output ****************************
    
    
        // ******** closing message *********
        
        System.out.println("end of processing.");
    }  // end main
}  // end class
