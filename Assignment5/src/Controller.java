

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
 *				controls the model(pokemon) and the view(pokeGUI)
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Controller
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********

	 private pokeGUI ui;			// local access to view
         private ArrayList<pokemon> pokemonList = new ArrayList();
         private pokemon p;
 	
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
 	
         protected void addUI(pokeGUI g){
		 this.ui = g;
	 } // end addUI
             
         protected void createPoke() {
             p = new pokemon();
         }
         
         protected String toStringPoke() {
             String output = p.toString();
             
             return output;
         }
	 
         protected void keepGenPoke() {
             pokemonList.add(p);
             ui.pokeListModel.addElement(p);
         }
         
         protected String getPoke(int i) {
             String st;
             
             p = pokemonList.get(i);
             
             st = p.toString();
             
             return st;
         } //end getPoke
         
	 
 	// ********** mutators **********
	 
         protected String trainPoke() {
             String op;
             
             p.train();
             
             op = "Level up";
             op += "\nNew Level: " + p.getLevel();
             op += "\nNew HP: " + p.getHp();
             op += "\nNew Attack: " + p.getAtt();
             op += "\nNew Defense: " + p.getDef();
             op += "\nNew Speed: " + p.getSpeed();
             
             return op;
         } //end trainPoke
	 
         protected void renamePoke(String nm) {
             p.setName(nm);
         } //end renamePoke
         
         protected void releasePoke(int n) {
             p = pokemonList.remove(n);
         } //end releasePoke
        
 }  // end class