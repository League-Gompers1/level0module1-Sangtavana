package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

    // 1. Make a main method that includes all the steps below….
	public static void main(String[] args){
		
    // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random randy= new Random(0);
int x= randy.nextInt(4);
    // 3. Print out this variable
System.out.print(x);
    // 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "Please enter a YES or No question");


}
    // -- tell the user "Yes"

    // 6. If the random number is 1

    // -- tell the user "No"

    // 7. If the random number is 2

    // -- tell the user "Maybe you should ask Google?"

    // 8. If the random number is 3

    // -- write your own answer

}
}