package calc;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class calc extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6594736387344499350L;

	@SuppressWarnings("unused")
	public static void main(String[] args){
		String n1 = JOptionPane.showInputDialog("type a number");
		int num1 = Integer.parseInt(n1);
		UIManager.put("OptionPane.cancelButtonText", "devide");
		UIManager.put("OptionPane.yesButtonText", "multiply");
		UIManager.put("OptionPane.noButtonText", "subtract");
		double result = JOptionPane.showConfirmDialog(null, 
				   "What the fuck do you wanna do with dem diggets?",null, JOptionPane.YES_NO_CANCEL_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					UIManager.put("OptionPane.cancelButtonText", "cancel");
					String n2mult = JOptionPane.showInputDialog("Type in a number you want to multiply " + n1 +" with");
					double num2 = Integer.parseInt(n2mult);
					double awns = num1 * num2;
					String n2 = JOptionPane.showInputDialog("Type in a number you want to multiply " + n1 +" with");
				} 	
				if(result == JOptionPane.NO_OPTION) {
					UIManager.put("OptionPane.cancelButtonText", "cancel");
					String n2dev = JOptionPane.showInputDialog("Type in a number you want to devide " + n1 +" with");
					double num2 = Integer.parseInt(n2dev);
					double awns = num1 / num2;
					JOptionPane.showMessageDialog(null, awns);
				} 	
				if(result == JOptionPane.CANCEL_OPTION) {
					UIManager.put("OptionPane.cancelButtonText", "cancel");
					String n2sub = JOptionPane.showInputDialog("Type in a number you want to subtract " + n1 +" with");
					double num2 = Integer.parseInt(n2sub);
					double awns = num1 - num2;
					JOptionPane.showMessageDialog(null, awns);
				}
	}
}
