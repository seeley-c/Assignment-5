

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/* **********************************************************
 * Programmer:	Callum Seeley
 * Class:	CS30S
 * 
 * Assignment:	Assignment 5
 *
 * Description:	conroller class for pokemon app
 *			controls the model(pokemon) and the view(pokeGUI)
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Controller
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********

	 private pokeGUI ui;			// local access to view
         private ArrayList<pokemon> pokemonList = new ArrayList(); //creates new pokemon
         private pokemon p; //links controller to pokemon (model)
 	
 	// ********** constructors ***********
     
	//*****************************************************
        // Purpose: create a new controll object
        // Interface: IN: none
        // Returns: none
        // *****************************************************	 
	 public Controller(){
		 System.out.println("controll created.");
	 } //end condtructor
 	
 	// ********** accessors **********
 	
         /*****************************************************
        Purpose: link GUI to controller
        Interface: IN: none
							
        Returns: na
        *****************************************************/
         protected void addUI(pokeGUI g){
		 this.ui = g;
	 } // end addUI
        
        /*****************************************************
        Purpose: creates pokemon arraylist
        Interface: IN: none
							
        Returns: na
        *****************************************************/
         protected void createPoke() {
             p = new pokemon();
         } //end createPoke()
         
        /*****************************************************
        Purpose: outputs the properties of generated pokemon
        Interface: IN: none
							
        Returns: String output: properties of pokemon
        *****************************************************/
         protected String toStringPoke() {
             String output = p.toString(); //set output to properties 
             
             return output; //return output
         } //end toStringPoke()
	 
        /*****************************************************
        Purpose: adds pokemon to jlist and array list in gui and controller
        Interface: IN: none
							
        Returns: na
        *****************************************************/
         protected void keepGenPoke() {
             pokemonList.add(p);             //adds the pokemon to array list in controller
             ui.pokeListModel.addElement(p); //adds the pokemon to the jlist in the gui
         } //end keepGenPoke()
         
        /*****************************************************
        Purpose: gets pokemon properties for output
        Interface: IN: integer i: which pokemon from the list is selected
							
        Returns: pokemon .toString() method which returns properties
        *****************************************************/
         protected String getPoke(int i) {
             String st; //string for output
             
             p = pokemonList.get(i); //sets pokemon to pokemon selected from jlist
             
             st = p.toString();      //sets output to properties of pokemon
             
             return st; //return output
         } //end getPoke
         
	 
 	// ********** mutators **********
	
        /*****************************************************
        Purpose: outputs the new properties of leveled up pokemon
        Interface: IN: none
							
        Returns: String op: properties of new levels
        *****************************************************/
         protected String trainPoke() {
             String op; //string for output
             
             p.train(); //trains selected pokemon
             
             op = "Level up";   //starts output block
             op += "\nNew Level: " + p.getLevel(); //outputs new block
             op += "\nNew HP: " + p.getHp();       //outputs new hp
             op += "\nNew Attack: " + p.getAtt();  //outputs new attack
             op += "\nNew Defense: " + p.getDef(); //outputs new defense
             op += "\nNew Speed: " + p.getSpeed(); //outputs new speed
             
             return op; //returns properties
         } //end trainPoke
	 
        /*****************************************************
        Purpose: sets name of pokemon
        Interface: IN: String nm: the name that they entered
							
        Returns: na
        *****************************************************/
         protected void renamePoke(String nm) {
             p.setName(nm);  //sets name of pokemon
         } //end renamePoke
         
        
 }  // end class