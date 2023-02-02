import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Search{
    JFrame f;
    JLabel l1;
    JTextField t1;
    JButton b1;

    public Search()
    {
       f = new JFrame("Form");
       f.setSize(400,400);
       f.setVisible(true);

       FlowLayout f1 = new FlowLayout();
       f.setLayout(f1);

       l1 = new JLabel("ID");
       t1 = new JTextField("Search");
       b1 = new JButton("Search");

       f.add(l1);
       f.add(t1);
       f.add(b1);
     
       
    }
    public static void main(String args[]) {
        new Search();
    }
}
