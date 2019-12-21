
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "february 10th";
		String dadsBirthday = "november 25th";
		String myBirthday = "october 10th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String name = JOptionPane.showInputDialog(null,
				"whose birthday do you want to know, mom, dad, or mine?" + "(say mine, mom ,dad. nothing else)");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, name + "? okey there birthday is.....");
		// 4. if user asked for "mom" print mom's birthday
		if (name.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		if (name.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
			 if (name.equalsIgnoreCase("yours")) {
					JOptionPane.showMessageDialog(null, myBirthday);
				}
				// 5. if user asked for "dad" print dad's birthday

				// 6. if user asked for your name print myBirthday

				// 7. otherwise print "Sorry, i don't remember that person's birthday!"

			}
	}

