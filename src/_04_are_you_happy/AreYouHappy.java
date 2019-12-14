package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String happy = JOptionPane.showInputDialog("are you happy!? (yes or no)");

		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
		}

		if (happy.equalsIgnoreCase("no")) {
			String happiness = JOptionPane.showInputDialog(null, "do you want to be happy?");

			if (happiness.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");

			}

			if (happiness.equalsIgnoreCase("yes")) {

			}
		}

	}
}
