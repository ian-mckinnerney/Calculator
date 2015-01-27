/**
 * 
 */
package calculator;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @author ilmckinnerney
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ian McKinnerney");
		frame.setVisible(true);
		frame.setSize(600, 600);
		GridLayout gl=new GridLayout(4,4);
		frame.setLayout(gl);
		frame.setLocationRelativeTo(null);
		JTextField displayScreen =new JTextField("");
		frame.add(displayScreen);
		
		//the button gaps
		gl.setHgap(10);
		gl.setVgap(10);
		
		JButton btnZero =new JButton("0");
		JButton btnOne =new JButton("1");
		JButton btnTwo =new JButton("2");
		JButton btnThree =new JButton("3");
		JButton btnFour =new JButton("4");
		JButton btnfive =new JButton("5");
		JButton btnSix =new JButton("6");
		JButton btnSeven =new JButton("7");
		JButton btnTen =new JButton("8");
		JButton btnNine =new JButton("9");
		
		frame.add(btnZero);
		frame.add(btnOne);
		frame.add(btnTwo);
		frame.add(btnThree);
		frame.add(btnFour);
		frame.add(btnfive);
		frame.add(btnSix);
		frame.add(btnSeven);
		frame.add(btnTen);
		frame.add(btnNine);

	}

}
