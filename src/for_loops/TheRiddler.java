//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String ask =JOptionPane.showInputDialog(null,"Two girls were born to the same mother, \n"+
		"on the same day, at the same time,\n "+
		"in the same month and year and yet they're not twins. How can this be?");
String ans= ("a set of triplets");


		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(ask.equals(" a set of triplets ")){
	JOptionPane.showMessageDialog(null,"Correct!");
	score++;
}else{JOptionPane.showMessageDialog(null, "Wrong! The correct answer is "+ ans);
	
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,score);
	}
}

