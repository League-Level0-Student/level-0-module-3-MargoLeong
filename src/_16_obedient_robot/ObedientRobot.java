package _16_obedient_robot;

import java.awt.AWTException;
import java.awt.Color;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		Robot r2d2 = new Robot();

		String color = JOptionPane.showInputDialog(null,
				"what color do you want r2d2 to (use red, orange, yellow, green, blue, purple)");
		if (color.equalsIgnoreCase("Red")) {
			r2d2.setPenColor(Color.red);
		} else if (color.equalsIgnoreCase("orange")) {
			r2d2.setPenColor(Color.orange);
		} else if (color.equalsIgnoreCase("yellow")) {
			r2d2.setPenColor(Color.yellow);
		} else if (color.equalsIgnoreCase("green")) {
			r2d2.setPenColor(Color.green);
		} else if (color.equalsIgnoreCase("blue")) {
			r2d2.setPenColor(Color.BLUE);
		} else if (color.equalsIgnoreCase("purple")) {
			r2d2.setPenColor(231, 119, 255);
		}
		String drawShape = JOptionPane.showInputDialog(null,
				"what shape do you want the robot to draw? (square, triangle, or a circle)");
		if (drawShape.equalsIgnoreCase("triangle")) {
			r2d2.penDown();
			r2d2.setSpeed(200);
			r2d2.move(100);
			r2d2.turn(120);
			r2d2.move(100);
			r2d2.turn(120);
			r2d2.move(100);
			r2d2.penUp();
			r2d2.move(100);
		} else if (drawShape.equalsIgnoreCase("Circle")) {
			r2d2.penDown();
			r2d2.setSpeed(200);
			for (int i = 0; i < 50; i++) {
				r2d2.move(5);
				r2d2.turn(10);
			}
			r2d2.penUp();
			r2d2.move(100);
		} else if (drawShape.equalsIgnoreCase("square")) {
			for (int i = 0; i < 3; i++) {
				r2d2.setSpeed(200);
				r2d2.penDown();
				r2d2.move(100);
				r2d2.turn(90);
			}
			r2d2.move(100);
			r2d2.penUp();
			r2d2.move(100);
		}
	}
}
