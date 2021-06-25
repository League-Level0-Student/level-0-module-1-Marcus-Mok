package _05_for_loops._2_badgers;

import javax.swing.JOptionPane;

public class Badgers {
public static void main(String[] args) {
	int loops = 1;
	int animal1 = 0;
	int food = 0;
	
while (loops <= 2) {
	
	while(animal1 <= 12) {
		JOptionPane.showMessageDialog(null, "Badger");
		animal1 += 1;
	}
	while(food <= 1) {
		JOptionPane.showMessageDialog(null, "mushroom");
	food += 1;
	}
	JOptionPane.showMessageDialog(null, "A Snake!!!");
	animal1 = 0;
	food = 0;
	loops += 1;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
