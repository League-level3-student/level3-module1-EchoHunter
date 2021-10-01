package _05_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
    /* 
     * Crate a HashMap of Integers for the keys and Strings for the values.
     * Create a GUI with three buttons. 
     * Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     * 
     * Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     * 
     * Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     * 
     * When this is complete, add a fourth button to your window.
     * Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list. 
     */
HashMap <Integer, String> log = new HashMap <Integer, String> ();
JFrame frame;
JPanel panel;
JButton addEntry; 
JButton search;
JButton viewList;
JButton remove;
public void guiSetup() {
	frame = new JFrame();
	panel = new JPanel();
	addEntry = new JButton();
	search = new JButton();
	viewList = new JButton();
	remove = new JButton();
	addEntry.addActionListener(this);
	search.addActionListener(this);
	viewList.addActionListener(this);
	remove.addActionListener(this);
	panel.add(addEntry);
	panel.add(search);
	panel.add(viewList);
	panel.add(remove);
	addEntry.setText("Add Entry");
	search.setText("Search");
	viewList.setText("View Log");
	remove.setText("Remove Entry");
	frame.add(panel);
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == addEntry) {
	String entry =	JOptionPane.showInputDialog("Provide a new Entry to the Log");
	log.put(log.size(),entry);
	}
	if(e.getSource() == search) {
	String num = JOptionPane.showInputDialog("Enter an ID number");
	int id = Integer.parseInt(num);
	JOptionPane.showMessageDialog(null, "The Entry for ID "+id+ " is as follows: "+ log.get(id));
	}
	if(e.getSource() == viewList) {
	String logList = "";
	for (int i = 0; i < log.size(); i++) {
		logList += "ID: "+i +"	Name: " + log.get(i)+ "\n";
	}
	JOptionPane.showMessageDialog(null, logList);
	}
	if(e.getSource() == remove) {
	String toRemove= JOptionPane.showInputDialog("Input an ID you wish to remove");
	int removeID = Integer.parseInt(toRemove);
	log.remove(removeID);
	}
}
}
