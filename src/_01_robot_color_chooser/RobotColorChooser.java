//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) throws AWTException {
		//1. Create a new Robot
		Robot r =new Robot();
		//3. Ask the user what color they would like the robot to draw

		
		String hello = JOptionPane.showInputDialog(null,"choose a color: red, orange, yellow..");
		//5. Use an if/else statement to set the pen color that the user requested
for(int i=0;i<100;i++) {
		r.penDown();
r.setPenWidth(10);r.setSpeed(200);
		if(hello.equalsIgnoreCase("red") ) {
	r.setPenColor(255,45,0);
	r.move(200);
}else if(hello.equalsIgnoreCase("orange")) {
	r.setPenColor(255,151,0);
	r.move(200);
}else if(hello.equalsIgnoreCase("yellow")) {
	r.setPenColor(255,246,0);
	r.move(200);
}else if(hello.equalsIgnoreCase("green")) {
	r.setPenColor(77,255,0);
	r.move(200);
}else if(hello.equalsIgnoreCase("blue")) {
	r.setPenColor(0,0,255);
	r.move(200);
}else if(hello.equalsIgnoreCase("purple")) {
	r.setPenColor(108,0,255);
	r.move(200);
}else {
	JOptionPane.showMessageDialog(null,"that color is not acceptable");
}
}
	// 6. If the user doesn’t enter anything, choose a random color

	// 7. Put a loop around your code so that you keep asking the user for more
	// colors & drawing them

	// 4. Set the pen width to 10

	// 2. Make the robot draw a shape (this will take more than one line of code)

	}}
