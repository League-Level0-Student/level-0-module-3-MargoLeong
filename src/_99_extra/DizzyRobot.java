//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _99_extra;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String dizzzy = JOptionPane.showInputDialog(null,"on a scale 1-10 how dizzy do you want this robot to get?!");
 // 1. Use the dance method to make the robot spin.
	if(dizzzy.equalsIgnoreCase("")) {
		robot
	}
	}
			
			

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

