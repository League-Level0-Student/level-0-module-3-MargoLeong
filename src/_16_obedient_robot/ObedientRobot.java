package _16_obedient_robot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;

import javax.swing.JOptionPane;

public class ObedientRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		Robot r2d2 = new Robot();

		String color = JOptionPane.showInputDialog(null,
				"what color do you want r2d2 to use(red, orange, yellow, green, blue, purple");
		if (color.equalsIgnoreCase("Red")) {
			r2d2.setPenColor(Color.red);
		}
	}

}



