package _10_99_bottles;

import javax.swing.JOptionPane;

public class bottles {
	public static void main(String[] args) {
		{

			for (int j = 99; j > 0; j--) {
				JOptionPane.showMessageDialog(null, j + " bottles of beer on the wall " + j
						+ " bottles of beer take one down pass " + "it around " + j + " bottles of beer on the wall");
			}
			JOptionPane.showMessageDialog(null, "no bottles of beer on the wall "
					+ "no bottles of beer, go to the store buy some more, " + "99 bottles" + "of beer on the wall");
		}
	}
}