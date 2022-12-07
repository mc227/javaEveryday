package javaEveryday.com.DW.week7;
/** This program will display the dialog message and throw an exception when the button is clicked
 ** @author jaynguyen
 * Class CMIS 242/7382
 * Prof. Luo
 * Dec 6, 2022
 **/
// package HelloWorldGUI1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyClickBait implements ActionListener{

	private JLabel label;
	private JFrame frame;
	int numClick = 0;
	private JButton button;

	public static void main(String[] args) {
		new MyClickBait();
	}

	@SuppressWarnings("deprecation")
	public MyClickBait() {

		frame = new JFrame("My Clickbait");
		frame.setLocationRelativeTo(null);

		button = new JButton("Click me");
		button.addActionListener(this);

		label = new JLabel("Number of clicks: 0", JLabel.CENTER);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.add(button);
		panel.add(label);

		frame.add(panel, BorderLayout.PAGE_START);
		frame.show();
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button)
			JOptionPane.showMessageDialog(button, "Hit OK to throw an exception",
					"Not A Valid Click", JOptionPane.ERROR_MESSAGE);
		throw new IllegalArgumentException("Exception Thrown");



	}
}



//package javaEveryday.com.DW.week7;
///** This program will display the dialog message and throw an exception when the button is clicked
// ** @author jaynguyen
// * Class CMIS 242/7382
// * Prof. Luo
// * Dec 6, 2022
// **/
//// package HelloWorldGUI1;
//
//import javaEveryday.com.DW.week7.discussion.IllegalPasswordArgumentException;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//
//public class MyClickBait implements ActionListener{
//
//	private JLabel label;
//	private JFrame frame;
//	int numClick = 0;
//	private JButton button;
//
//	public static void main(String[] args) {
//		new MyClickBait();
//	}
//
//	@SuppressWarnings("deprecation")
//	public MyClickBait() {
//
//		frame = new JFrame("My Clickbait");
//		frame.setLocationRelativeTo(null);
//
//		button = new JButton("Click me");
//		button.addActionListener(this);
//
//		label = new JLabel("Number of clicks: 0", JLabel.CENTER);
//
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.WHITE);
//		panel.add(button);
//		panel.add(label);
//
//		frame.add(panel, BorderLayout.PAGE_START);
//		frame.show();
//		frame.setSize(300, 150);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//
//	/**
//	 * Edited actionPerformed method by instantiating an Exception object and calling it's toString method
//	 * inside the JOptionPane
//	 * @param e
//	 */
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JOptionPane.showMessageDialog(null,"Hit OK to throw an exception");
//		Exception exception = new IllegalArgumentException("Exception Thrown");
//		if (e.getSource() == button)
//			JOptionPane.showMessageDialog(button, exception.toString(),
//					"Not A Valid Click", JOptionPane.ERROR_MESSAGE);
//	}
//}