package _03_print_and_popups._2_madlibs;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {

	public static void main(String[] args) {
		String prompt = "If you find yourself having to cross a piranha-infested river, here's how to do it...";
		JOptionPane.showMessageDialog(null, prompt);
		String adjective = JOptionPane.showInputDialog("Enter an adjective.");
		String liquid = JOptionPane.showInputDialog("Enter a type of liquid.");
		String body_part = JOptionPane.showInputDialog("Enter a name.");
		String verb = JOptionPane.showInputDialog("Enter a verb.");
		String place = JOptionPane.showInputDialog("Enter a place.");

		// Make a pop-up that contains the final story. The \n escape characters add
		// line breaks to the story.
		// If you need to, move them around to make your story look better in the pop-up

		// If you want to write your own Madlibs story, just change the story variable
		// and ask the player different questions.
		String story = "Piranhas are more " + adjective + " during the day, so cross the river at\n"
				+ "night. Piranhas are attracted to fresh " + liquid + " and will most\n"
				+ "likely take a bite out of your " + body_part + " if you " + verb + ". Whatever\n"
				+ "you do, if you have an open wound, try to find another way to get\n" + "back to the " + place
				+ " Good luck!";
		JOptionPane.showMessageDialog(null, story);
	}

	private static void string() {
		// TODO Auto-generated method stub

	}
}