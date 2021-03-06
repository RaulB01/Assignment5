package assignment5test;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class WeightedAvrg implements ActionListener {
		private JLabel name;
        private JLabel assignment;
        private JLabel midterm;
        private JLabel project;
        private JLabel finalp;
        private JLabel finalgrade;
        private JLabel studentname1;
        private JLabel subject;
        private JLabel weightlabel;
        private JLabel scorelabel;
        private JLabel finalscore;
        private JLabel finalweight;
        
        JFrame frame;
        JButton button;
        JLabel label;
        JPanel studentname;
        JPanel panel1 = new JPanel();
        JPanel score1 = new JPanel();
        JPanel weightpanel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel calculate = new JPanel();
        
        JTextField [] textfield = new JTextField[10];
        JTextField [] textfield1 = new JTextField[10];

public WeightedAvrg(){
        frame = new JFrame("Score Calculator");
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        name = new JLabel();
        name.setText("Student name");
        name.setForeground(Color.WHITE);
        
        assignment = new JLabel();
        assignment.setText("Assignments");
        assignment.setForeground(Color.WHITE);
        
        midterm = new JLabel();
        midterm.setText("Midterm");
        midterm.setForeground(Color.WHITE);
        
        project = new JLabel();
        project.setText("Project");
        project.setForeground(Color.WHITE);
        
        finalp = new JLabel();
        finalp.setText("Final");
        finalp.setForeground(Color.WHITE);
        
        finalgrade = new JLabel();
        finalgrade.setText("");
        finalgrade.setForeground(Color.WHITE);
        
        studentname1 = new JLabel();
        studentname1.setText("Name: ");
        studentname1.setForeground(Color.WHITE);

        finalscore = new JLabel();
        finalscore.setText("Average Score: ");
        finalscore.setForeground(Color.WHITE);
        
        finalweight = new JLabel();
        finalweight.setText("Letter Grade: ");
        finalweight.setForeground(Color.WHITE);

        subject = new JLabel();
        subject.setText("Subject");
        subject.setForeground(Color.WHITE);
        
        weightlabel = new JLabel();
        weightlabel.setText("                                       Weight");
        weightlabel.setForeground(Color.WHITE);
        
        scorelabel = new JLabel();
        scorelabel.setText("                       Score");
        scorelabel.setForeground(Color.WHITE);

        panel1 = new JPanel();
        panel1.setBackground(Color.GRAY); 
        panel1.setLayout(new GridLayout(7,1));
        
        panel2 = new JPanel();
        panel2.setBackground(Color.GRAY);
        panel2.setLayout(new GridLayout(1,3));
        
        score1 = new JPanel();
        score1.setBackground(Color.GRAY);
        score1.setLayout(new GridLayout(6,1));
        
        weightpanel = new JPanel();
        weightpanel.setBackground(Color.GRAY);
        weightpanel.setLayout(new GridLayout(6,1));
        
        calculate = new JPanel();
        calculate.setBackground(Color.BLACK);
        calculate.setLayout(new GridLayout(1,4));

        button = new JButton("Calculate");
        button.addActionListener(this);

        textfield[0] = new JTextField(1);
        textfield[1] = new JTextField(1);
        textfield[2] = new JTextField(1);
        textfield[3] = new JTextField(1);
        textfield[4] = new JTextField(1);
        textfield[5] = new JTextField(1);
        textfield[6] = new JTextField(1);

        textfield1[0] = new JTextField(3);
        textfield1[1] = new JTextField(3);
        textfield1[2] = new JTextField(3);
        textfield1[3] = new JTextField(3);
        textfield1[4] = new JTextField(3);
        textfield1[5] = new JTextField(3);
        textfield1[6] = new JTextField(3);

        frame.add(panel1, BorderLayout.WEST);
        frame.add(score1, BorderLayout.CENTER);
        frame.add(weightpanel, BorderLayout.EAST);
        frame.add(panel2, BorderLayout.PAGE_START);
        frame.add(calculate, BorderLayout.AFTER_LAST_LINE);

        panel1.add(name);
        panel1.add(assignment);
        panel1.add(midterm);
        panel1.add(project);
        panel1.add(finalp);

        panel2.add(subject);
        panel2.add(scorelabel);
        panel2.add(weightlabel);

        score1.add(textfield[0]);
        score1.add(textfield[1]);
        score1.add(textfield[2]);
        score1.add(textfield[3]);
        score1.add(textfield[4]);

        weightpanel.add(finalgrade);
        weightpanel.add(textfield1[1]);
        weightpanel.add(textfield1[2]);
        weightpanel.add(textfield1[3]);
        weightpanel.add(textfield1[4]);

        calculate.add(button);
        calculate.add(studentname1);
        calculate.add(finalscore);
        calculate.add(finalweight);

}
      
        public void actionPerformed(ActionEvent arg0) {

                String score1 = textfield[0].getText();
                double score2 = Double.parseDouble(textfield[1].getText());
                double score3 = Double.parseDouble(textfield[2].getText());
                double score4 = Double.parseDouble(textfield[3].getText());
                double score5 = Double.parseDouble(textfield[4].getText());

                double weight2 = Double.parseDouble(textfield1[1].getText());
                double weight3 = Double.parseDouble(textfield1[2].getText());
                double weight4 = Double.parseDouble(textfield1[3].getText());
                double weight5 = Double.parseDouble(textfield1[4].getText());

                double total2= score2*(weight2);
                double total3= score3*(weight3);
                double total4= score4*(weight4);
                double total5= score5*(weight5);

                studentname1.setText(score1);
                double averagescore= total2+total3+total4+total5;
                finalscore.setText(String.valueOf("Average Score: " + averagescore));

                if(averagescore>=90) {
                        finalweight.setText(String.valueOf("Letter Grade: " + "A"));
                } else if (averagescore>=80){
                        finalweight.setText(String.valueOf("Letter Grade: " + "B"));
                } else if (averagescore>=70){
                        finalweight.setText(String.valueOf("Letter Grade: " + "C"));
                }else if (averagescore>=60){
                        finalweight.setText(String.valueOf("Letter Grade: " + "D"));
                } else if (averagescore>=0){
                        finalweight.setText(String.valueOf("Letter Grade: " + "F"));
                }

        }

}