import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 4th";
		String dadsBirthday = "June 4th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and store their response in a variable
		String birthdayname = JOptionPane.showInputDialog("What birthday do you want  my moms,my dads,or mine?");

		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, birthdayname);
		// 4. if user asked for "mom"
		if (birthdayname.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		else if (birthdayname.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// print dad's birthday
		// 6. if user asked for your name
		else if (birthdayname.equals("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "sorry, i don't remember that person's birthday!");
		}
	}

}
