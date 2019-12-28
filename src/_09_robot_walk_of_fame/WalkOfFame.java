
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot hello = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		hello.setX(100);
		
		// You also need to show the robot to see the result of this line.
		hello.setPenWidth(1);
		// 2. Make the robot draw a star shape. Hint: 144.
		hello.setSpeed(100);
		hello.penDown();
		hello.turn(90);
		for(int j=0;j<10;j++) {
	
		for(int i=0;i<5;i++) {
			hello.move(30);
			hello.turn(144);
			}
		hello.move(30);
		hello.penUp();

		hello.move(30);
		hello.penDown();
		}
		
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
