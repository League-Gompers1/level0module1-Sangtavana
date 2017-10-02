import javax.swing.JOptionPane;

public class AscendingOrder {
	public static void main(String[] args) {
		String num= JOptionPane.showInputDialog(null, "Enter a number.") ;
		String nums= JOptionPane.showInputDialog(null,"Enter another number.");
		String numss= JOptionPane.showInputDialog(null, "Enter a third number.");
		int number=Integer.parseInt(num);
	int numbers= Integer.parseInt(nums);
	int numberss= Integer.parseInt(numss);		
	if(number<numbers){
			JOptionPane.showMessageDialog(null, number + ", "+ numbers+ ","+ numberss );
		
		}else if(number< numbers&&numberss<numbers){
		JOptionPane.showMessageDialog(null, numbers + ", "+ number + ","+ numberss );
		
		}else{
			JOptionPane.showMessageDialog(null, numberss + "," + numbers + ","+ number);
		}
	
}
}
