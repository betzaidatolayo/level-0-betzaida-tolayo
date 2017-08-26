import javax.activation.MailcapCommandMap;
import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name?");
		if (name.toLowerCase().equals("angel")) {
			JOptionPane.showMessageDialog(null, "You are remarkable at coding");
		} else if (name.toLowerCase().equals("celena")) {
			JOptionPane.showMessageDialog(null, "You are remarkable at  being a  good friend");
		} else if (name.toLowerCase().equals("wendy")) {
			JOptionPane.showMessageDialog(null, "You are remarkable at reading ");
		 } else{
			JOptionPane.showMessageDialog(null, "You are remarkable at being funny ");
		} 
	}
}