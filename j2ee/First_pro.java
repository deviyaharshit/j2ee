import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First_pro implements ActionListener {
	JFrame f;	
	JButton btnok,btncancel;
	
	First_pro(){
		f = new JFrame("Student Detail");
		JLabel lbl1 = new JLabel("Roll No");
		f.add(lbl1);
		JTextField txt1 = new JTextField(10);
		f.add(txt1);
		JLabel lbl2 = new JLabel("Name");
		f.add(lbl2);
		JTextField txt2 = new JTextField(10);
		f.add(txt2);
		btnok = new JButton("Ok");
		btnok.addActionListener(this);
		f.add(btnok);
		btncancel = new JButton("Cancel");
		btncancel.addActionListener(this);
		f.add(btncancel);
		f.setLayout(new GridLayout(3,2));
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public static void main(String args[]) {
			new First_pro();
		}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btnok){
			JOptionPane.showMessageDialog(f,"OK Button is clicked");
		}
		if(e.getSource()==btncancel){
			System.exit(0);
			}
		}
		
}
