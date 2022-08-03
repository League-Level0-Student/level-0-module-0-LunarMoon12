package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2. Ask the user a question
		String question = JOptionPane.showInputDialog("Can you draw a cube?");

		// 3. Use an if statement to check if their answer is correct
		if (question.equals("Yes")) {
			// 4. if the user's answer was correct, add one to their score
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			score--;
			JOptionPane.showMessageDialog(null, "Yes");

		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer
		String next_question = JOptionPane.showInputDialog("Can you write the word pentagon?");
		if (next_question.equals("Pentagon")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			score--;
			JOptionPane.showMessageDialog(null, "Pentagon");
		}
		String next2question = JOptionPane.showInputDialog("What does tri mean?");
		if (next2question.equals("3")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			score--;

			JOptionPane.showMessageDialog(null, "3");
		}
		String next3question = JOptionPane.showInputDialog("How many sides does a heptagon have?");
		if (next3question.equals("7")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			score--;
			JOptionPane.showMessageDialog(null, "7");
		}
		// After all the questions have been asked, tell the user their final score
		JOptionPane.showMessageDialog(null, "Your score is" + score);
	}
}
