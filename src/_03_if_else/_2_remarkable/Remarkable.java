package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

	String name = JOptionPane.showInputDialog ("What is your name? ");
	
	if  (name.equalsIgnoreCase("marcus")){
		JOptionPane.showMessageDialog(null, "I cant eat ice cream");
		}
	else if  (name.equalsIgnoreCase("melody")){
		JOptionPane.showMessageDialog(null, "you drink dark cofee");
		}
	else if  (name.equalsIgnoreCase("ken")){
		JOptionPane.showMessageDialog(null, "you drink cofee with milk");
		}
	else if  (name.equalsIgnoreCase("monica")){
		JOptionPane.showMessageDialog(null, "you play the piano");
		}
	// 1. Save something remarkable about each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

