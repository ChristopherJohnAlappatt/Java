package Java_Practicals._8A_GUI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

    int count =0;
    JLabel label = new JLabel("Number of Clicks : 0");
    JFrame frame = new JFrame();
    JPanel panel;

   public GUI() {
        

        JButton button = new JButton("Click me");
        button.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        // panel.setLayout(new LayoutManager());
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        
        count++;
        label.setText("Number of Clicks : " + count);
    }
   

   
}
