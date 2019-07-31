package intro_to_array_lists;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton left = new JButton();
	JButton right = new JButton();
	
	public static void main(String args[]) {
		new GuestBook().setup();
	}
	
	void setup() {
		frame.add(panel);
		
		left.setText("Add Name");
		right.setText("View Names");
		
		left.addActionListener(this);
		right.addActionListener(this);
		
		panel.add(left);
		panel.add(right);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == left) {
			JOptionPane.showInputDialog(null, "Enter a name: ");
		}
	}
}
