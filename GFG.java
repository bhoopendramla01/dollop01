import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
  
public class GFG {
    public static void StudentInfo()
    {
        JFrame f
            = new JFrame(
                "Student Details Form Project By: Bhoopendra Singh Dollop");
  
        JLabel l1, l2, l3, l4, l5;
        JTextField t1, t2, t3;
        JComboBox j1, j2;
        JButton b1, b2;
        l1 = new JLabel("Student Name:");
        l1.setBounds(50, 50, 100, 30);
        l2 = new JLabel("Email ID:");
        l2.setBounds(50, 120, 120, 30);
        l3 = new JLabel("Branch:");
        l3.setBounds(50, 190, 50, 30);
        l4 = new JLabel("Section:");
        l4.setBounds(420, 50, 70, 30);
        l5 = new JLabel("Mobile No:");
        l5.setBounds(420, 120, 70, 30);
  
        t1 = new JTextField();
        t1.setBounds(150, 50, 130, 30);
        t2 = new JTextField();
        t2.setBounds(160, 120, 130, 30);
        t3 = new JTextField();
        t3.setBounds(490, 120, 130, 30);
  
        String s1[]
            = { "  ", "CSE", "ECE", "EEE",
                "CIVIL", "MEC", "Others" };
        String s2[]
            = { "  ", "Section-A", "Section-B",
                "Section-C", "Section-D",
                "Section-E" };
  
        j1 = new JComboBox(s1);
        j1.setBounds(120, 190, 100, 30);
        j2 = new JComboBox(s2);
        j2.setBounds(470, 50, 140, 30);
  
        b1 = new JButton("Save");
        b1.setBounds(150, 300, 70, 30);
        b2 = new JButton("close");
        b2.setBounds(420, 300, 70, 30);
  
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
  
                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = j1.getSelectedItem() + "";
                String s4 = j2.getSelectedItem() + "";
                String s5 = t3.getText();
                if (e.getSource() == b1) {
                    try {
  
                        FileWriter w
                            = new FileWriter(
                                "GFG.txt", true);
  
                        w.write(s1 + "\n");
                        w.write(s2 + "\n");
                        w.write(s3 + "\n");
                        w.write(s4 + "\n");
                        w.write(s5 + "\n");
                        w.close();
                    }
                    catch (Exception ae) {
                        System.out.println(ae);
                    }
                }
  
                JOptionPane
                    .showMessageDialog(
                        f,
                        "Successfully Saved"
                            + " The Details");
            }
        });
  
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(j1);
        f.add(l4);
        f.add(j2);
        f.add(l5);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.setLayout(null);
        f.setSize(700, 600);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        StudentInfo();
    }
}