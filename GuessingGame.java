import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
public class GuessingGame implements ActionListener{
  JLabel leftLabel = new JLabel();
  JLabel rightLabel = new JLabel();
  JTextField t1;
  JLabel j4;
  int leftCount;
  int rightCount;
  Random rand = new Random();
  int randomNum = rand.nextInt(100)+1;
GuessingGame(){

t1=new JTextField(10);
t1.setSize(10, 10);
t1.setLocation(350,80);
j4=new JLabel("Enter your guess");
j4.setFont(new Font("tunga",Font.PLAIN,10));
j4.setSize(270,20);
j4.setLocation(290,130);
//userGuess.setBounds(50,100,150,20);
JFrame frame = new JFrame("Guessing Game");
frame.setLayout(new FlowLayout());
frame.setSize(240,120);
JButton guessButton = new JButton("Button");
JButton playAgainButton = new JButton("Play again");
leftCount = 0;
rightCount = 0;
guessButton.addActionListener(this);
playAgainButton.addActionListener(this);
frame.add(guessButton);
frame.add(playAgainButton);
//leftLabel.setText("Count:" +leftCount);
//rightLabel.setText("Count:" + rightCount);
frame.add(leftLabel);
frame.add(rightLabel);
//JButton reset = new JButton("Reset");
//reset.addActionListener(this);
//frame.add(reset);
frame.add(t1);
frame.add(j4);
frame.setVisible(true);

}
public void actionPerformed(ActionEvent ae){
  //String s1 = userGuess.getText();
  //int a = Integer.parseInt(s1);

  int a = Integer.parseInt(t1.getText());
            //rando=(int) (Math.random()*100);
            if(a<randomNum)
            {
                j4.setText(a+" is too low, try again!!");
            }    
            else if(a>randomNum)
            {
                j4.setText(a+" is too high, try again!!");
            }
            else if(a==randomNum)
            {
                j4.setText("CORRECT, YOU WIN!!!!");    
}
            else{
                j4.setText("error");
}
          if(ae.getActionCommand().equals("Play again")){
            Random rand = new Random();
            int randomNum = rand.nextInt(100)+1;
            t1.setText("");
            j4.setText("Guess a new number");
}
}
}