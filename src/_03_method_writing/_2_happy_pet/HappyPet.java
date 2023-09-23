package _03_method_writing._2_happy_pet;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 50;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want?\n(cat/dog/fish)");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!

		// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
		//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
		//    Make sure to customize the title and question too.
		while(happinessLevel<100 && happinessLevel>1) {
			int task = JOptionPane.showOptionDialog(null, "What activity do you wan't to do with your pet?", "Activities", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "walk", "swim", "chocolate" }, null);
			// 6. Use user input to call the appropriate method created in step 5 below.
			if(pet.equals("dog")) {
				dog(task);	
			}
			if(pet.equals("cat")) {
				cat(task);	
			}
			if(pet.equals("fish")) {
				fish(task);	
			}
			if(happinessLevel<1) {
				JOptionPane.showMessageDialog(null, "Your pet got depressed and died");
			}
			if(happinessLevel>100) {
			JOptionPane.showMessageDialog(null, "Your pet is happy");	
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	}
	static void dog(int option) { 	
		if(option==0) {
			JOptionPane.showMessageDialog(null, "woof Woof woof woof!\n+15 happiness");
			happinessLevel += 15;
		}
		if(option==1) {
			JOptionPane.showMessageDialog(null, "bark bark!\n+5 happiness");
			happinessLevel += 5;
		}
		if(option==2) {
			JOptionPane.showMessageDialog(null, "bleh!\n-70 happiness");
			happinessLevel -= 70;
		}
	}
	static void cat(int option) { 	
		if(option==0) {
			JOptionPane.showMessageDialog(null, "Meow Meow!\n+10 happiness");
			happinessLevel += 10;
		}
		if(option==1) {
			JOptionPane.showMessageDialog(null, "Hiss!\n-45 happiness");
			happinessLevel -= 45;
		}
		if(option==2) {
			JOptionPane.showMessageDialog(null, "meow Meow meow!\n+20 happiness");
			happinessLevel += 20;
		}
	}
	static void fish(int option) { 	
		if(option==0) {
			JOptionPane.showMessageDialog(null, "Blurp Blurp!\n-100 happiness");
			happinessLevel -= 100;
		}
		if(option==1) {
			JOptionPane.showMessageDialog(null, "surple surple!\n+25 happiness");
			happinessLevel += 25;
		}
		if(option==2) {
			JOptionPane.showMessageDialog(null, "bleh!\n-10 happiness");
			happinessLevel -= 10;
		}
	}
	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
