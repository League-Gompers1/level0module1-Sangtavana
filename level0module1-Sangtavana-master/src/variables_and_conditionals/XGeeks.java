package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
String llyPower= "Flying";
String AngelPower="Tranforming Bird";
String chompoo="Pink fairy";
String blue="Ocean woman";
String Aubrey="Moody Rain";

String ans= JOptionPane.showInputDialog(null, "Enter a name of the following: \n llyPower \n AngelPower \n chompoo \n blue \n Aubrey");
if(ans.equals("llyPower")){
	JOptionPane.showMessageDialog(null, llyPower);
	//print llyPower
}

if(ans.equals("AngelPower")){
	JOptionPane.showMessageDialog(null, AngelPower);
	//print AngelPower
}

if(ans.equals("chompoo")){
	JOptionPane.showMessageDialog(null,chompoo);
	//print chompoo
}
if(ans.equals("blue")){
	JOptionPane.showMessageDialog(null,blue);
	//print blue
}

if(ans.equals("Aubrey")){
	JOptionPane.showMessageDialog(null,Aubrey);
	//print Aubrey
}





        // 2. Ask the user to enter a name. Store their answer in a variable.

        // 3. Show the superpower in a pop-up, depending on the name entered. 

    }
}