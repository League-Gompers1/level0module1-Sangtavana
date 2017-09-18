package conditionals;

import javax.swing.JOptionPane;

public class Repeat {
public static void main(String[] args) {
	String word= JOptionPane.showInputDialog(null,"Enter a word");
	String numbers= JOptionPane.showInputDialog(null,"Enter a number");
	int number= Integer.parseInt(numbers);
	for (int i = 0; i < number ; i++) {
		System.out.println(word);
	}
	
	
	
	
	
	
	
	
}
}
