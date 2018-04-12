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
         }
 	
 	// ********** instance variable **********

	 private String nick = "";
         private int att = 0;
         private int def = 0;
         private int hp = 0;
         private int speed = 0;
         private int level = 0;
         private species Species = null;
         
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
 	
            public String getNick() {
                return nick;
            } //end getNick

            public int getAtt() {
                return att;
            } //end getAtt

            public int getDef() {
                return def;
            } //end getDef

            public int getHp() {
                return hp;
            } //end getHp

            public int getSpeed() {
                return speed;
            } //end getSpeed

            public int getLevel() {
                return level;
            } //end getLevel

            public species getSpecies() {
                return Species;
            } //end getSpecies
	 
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

            public void train() {
                level = ++level;
                hp = hp + (int) (Math.random() * 2 + 1);
                att = att + (int) (Math.random() * 2 + 1);
                def = def + (int) (Math.random() * 2 + 1);
                speed = speed + (int) (Math.random() * 2 + 1);
            } //end train
            
            public void setName(String nm) {
                nick = nm;
            } //end setName
        
 }  // end class