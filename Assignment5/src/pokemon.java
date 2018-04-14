import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/* **********************************************************
 * Programmer:	
 * Class:	CS30S
 * 
 * Assignment:	Assignment 5
 *
 * Description:	model class for pokemon app app
 *				
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class pokemon
 {  // begin class
 	
 	// *********** class constants **********
 	
         private enum species {
             Pikachu, Squirtle, Charmander, Bulbasaur, Ninetails, Camerupt;
         } //end species enum
 	
 	// ********** instance variable **********

	 private String nick = "";      //new string for nickname
         private int att = 0;           //new int for attack
         private int def = 0;           //new int for defence
         private int hp = 0;            //new int for hp
         private int speed = 0;         //new int for speed
         private int level = 0;         //new int for level
         private species Species = null;//new species enum
         
 	// ********** constructors ***********
         
        //*****************************************************
        // Purpose: create a new pokemon object with default properties
        // Interface: IN: none
        // Returns: none
        // *****************************************************	
         public pokemon() {
             level = (int)(Math.random() * 10 + 1);
             
             hp = ((int)(Math.random() * (level * 2) + 1));
             att = ((int)(Math.random() * (level * 2) + 1));
             def = ((int)(Math.random() * (level * 2) + 1));
             speed = ((int)(Math.random() * (level * 2) + 1));
             
             int n = 0;
             
             n = (int) (Math.random() * 6 + 1);
             
             if (n == 1) {
                 Species = species.Pikachu;
             } //end if
             else if (n == 2) {
                 Species = species.Squirtle;
             } //end else if
             else if (n == 3) {
                 Species = species.Charmander;
             } //end else if
             else if (n == 4) {
                 Species = species.Bulbasaur;
             } //end else if
             else if (n == 5) {
                 Species = species.Ninetails;
             } //end else if
             else if (n == 6) {
                 Species = species.Camerupt;
             } //end else if
             
         } //end pokemon
	 
 	
 	// ********** accessors **********
        
            //*****************************************************
            // Purpose: get nickname of pokemon
            // Interface: IN: none
            // Returns: nickname of pokemon
            // *****************************************************
            public String getNick() {
                return nick;
            } //end getNick
            
            //*****************************************************
            // Purpose: get attack of pokemon
            // Interface: IN: none
            // Returns: attack (int)
            // *****************************************************
            public int getAtt() {
                return att;
            } //end getAtt
            
            //*****************************************************
            // Purpose: get defence of pokemon
            // Interface: IN: none
            // Returns: defence (int)
            // *****************************************************
            public int getDef() {
                return def;
            } //end getDef
            
            //*****************************************************
            // Purpose: get hp of pokemon
            // Interface: IN: none
            // Returns: hp (int)
            // *****************************************************
            public int getHp() {
                return hp;
            } //end getHp
            
            //*****************************************************
            // Purpose: get speed of pokemon
            // Interface: IN: none
            // Returns: speed (int)
            // *****************************************************
            public int getSpeed() {
                return speed;
            } //end getSpeed
            
            //*****************************************************
            // Purpose: get level of pokemon
            // Interface: IN: none
            // Returns: level (int)
            // *****************************************************
            public int getLevel() {
                return level;
            } //end getLevel
            
            //*****************************************************
            // Purpose: get species of pokemon
            // Interface: IN: none
            // Returns: species (enum)
            // *****************************************************
            public species getSpecies() {
                return Species;
            } //end getSpecies
            
            //*****************************************************
            // Purpose: gets properties of pokemon
            // Interface: IN: none
            // Returns: nickname (string)
            //          species (enum)
            //          level (int)
            //          hp (int)
            //          attack (int)
            //          defence (int)
            //          speed (int)
            // *****************************************************
            public String toString() {
                String output;
                
                output = "Pokemon Nickname: " + nick + "\n";
                output += "Species: " + Species + "\n";
                output += "Level: " + level + "\n";
                output += "HP: " + hp + "\n";
                output += "Attack: " + att + "\n";
                output += "Defence: " + def + "\n";
                output += "Speed: " + speed + "\n";
                
                return output;
            } //end toString
            
	 
 	// ********** mutators **********
            
            //*****************************************************
            // Purpose: train selected pokemon
            // Interface: IN: none
            // Returns: none
            // *****************************************************
            public void train() {
                level = ++level;
                hp = hp + (int) (Math.random() * 2 + 1);
                att = att + (int) (Math.random() * 2 + 1);
                def = def + (int) (Math.random() * 2 + 1);
                speed = speed + (int) (Math.random() * 2 + 1);
            } //end train
            
            //*****************************************************
            // Purpose: set nickname of pokemon
            // Interface: IN: String nm: 
            // Returns: none
            // *****************************************************
            public void setName(String nm) {
                nick = nm;
            } //end setName
        
 }  // end class