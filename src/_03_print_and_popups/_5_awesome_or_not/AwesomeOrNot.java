package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
public static void main(String[] args) {
	

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	int random = ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	System.out.println(random);
		// 3. Print your variable to the console
	JOptionPane.showInputDialog("What is something awesome?");
		// 4. Get the user to enter something that they think is awesome
	if (random == 0){
		// 5. If your variable is  0
	JOptionPane.showMessageDialog(null, "That's awesome!");
			// -- tell the user whatever they entered is awesome!
	}
		// 6. If your variable is  1
	else if (random == 1) {
			// -- tell the user whatever they entered is ok.
	JOptionPane.showMessageDialog(null,"That's ok.");
	}	
		// 7. If your variable is  2
	else if (random == 2) {
			// -- tell the user whatever they entered is boring.
	JOptionPane.showMessageDialog(null, "That's boring.");}
		// 8. If your variable is  3
	else if (random == 3) {
			// -- invent your own message to give to the user (be nice).
  JOptionPane.showMessageDialog(null, "That's neat!");}
}
}
