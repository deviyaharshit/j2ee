import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form  {
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4,b5;

    public Form()
    {
       f = new JFrame("Form");
       f.setSize(400,400);
       f.setVisible(true);

       FlowLayout f1 = new FlowLayout();
       f.setLayout(f1);

       //name add city phone save next previous first last

       l1 = new JLabel("Name");
       l2 = new JLabel("Add");
       l3 = new JLabel("City");
       l4 = new JLabel("Phone");
       t1 = new JTextField("Name");
       t2 = new JTextField("Add");
       t3 = new JTextField("City");
       t4 = new JTextField("Phone");
       b1 = new JButton("Save");
       b2 = new JButton("Next");
       b3 = new JButton("Previous");
       b4 = new JButton("First");
       b5 = new JButton("Last");

       
       f.add(l1);
       f.add(l2);
       f.add(l3);
       f.add(l4);
       f.add(t1);
       f.add(t2);
       f.add(t3);
       f.add(t4);
       f.add(b1);
       f.add(b2);
       f.add(b3);
       f.add(b4);
       f.add(b5);

       f.setLayout(new GridLayout(7,2));
		f.setSize(400,400);
    }
    public static void main(String args[]) {
        new Form();
    }
    
}

