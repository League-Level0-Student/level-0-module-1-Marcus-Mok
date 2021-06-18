package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
int score = 0 ;
		String answer1 = JOptionPane.showInputDialog ("Who makes it, has no need of it. Who buys it, has no use for it. who uses it can neither see nor feel it. What is it?");
		if  (answer1.equalsIgnoreCase("a coffin")){
		JOptionPane.showMessageDialog(null, "Correct");
		score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		JOptionPane.showMessageDialog(null, "your score is " + score);
		
		String answer2 = JOptionPane.showInputDialog ("What can travel around the world while staying in a corner?");
		if  (answer2.equalsIgnoreCase("a stamp")){
		JOptionPane.showMessageDialog(null, "Correct");
		score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		JOptionPane.showMessageDialog(null, "your score is " + score);
		
		String answer3 = JOptionPane.showInputDialog ("What has to be broken before you use it?");
		if  (answer3.equalsIgnoreCase("an egg")){
		JOptionPane.showMessageDialog(null, "Correct");
		score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		JOptionPane.showMessageDialog(null, "your score is " + score);
		 
		
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

