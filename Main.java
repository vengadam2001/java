import javax.swing.*;
public class Main { 
    public static void main(String args[]) { 

        JFrame f = new JFrame(); 

        f.setSize(400, 400); 

        JRadioButton r1 = new JRadioButton("Free Membership"); 

        JRadioButton r2 = new JRadioButton("Premium Membership"); 

        JButton free= new JButton("Get Free"); 

        JButton premium= new JButton("Get Premium"); 

        JButton reset = new JButton("Reset option"); 

        r1.setBounds(10, 50, 140, 30); 

        r2.setBounds(150, 50, 180, 30); 

        free.setBounds(10,80,90,25); 

        premium.setBounds(110,80,120,25); 

        reset.setBounds(240,80,120,25); 

        ButtonGroup bg = new ButtonGroup(); 

        bg.add(r1); 

        bg.add(r2); 

        f.add(r1); 

        f.add(r2); 

        f.add(free); 

        f.add(reset); 

        f.add(premium); 

        f.setLayout(null); 

        f.setVisible(true); 

    } 

} 