package menu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import frostbooter.TacoNator;

public class menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 323, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//calc
		JButton buttoncalc = new JButton("Calculator");
		buttoncalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.calc.main(null);
			}
		});
		
		buttoncalc.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(buttoncalc);
		
		//stresser
		JButton buttontaco = new JButton("Taco?");
		buttontaco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TacoNator.main(null);
				
			}
		});
		buttontaco.setBounds(109, 11, 89, 23);
		frame.getContentPane().add(buttontaco);
		
		JButton buttonSkypebot = new JButton("SkypeBot");
		buttonSkypebot.setBounds(208, 11, 89, 23);
		frame.getContentPane().add(buttonSkypebot);
		
	}
}
