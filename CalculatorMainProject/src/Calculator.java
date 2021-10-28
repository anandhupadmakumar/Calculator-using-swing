import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener {
   JButton sevenButton, eightButton, nineButton;
   JButton fourButton, fiveButton, sixButton;
   JButton oneButton, twoButton, threeButton;
   JButton dotButton, zeroButton;
   JButton divButton, mulButton, minusButton, plusButton, equaltoButton;
  JButton displayButton;
   String oldValue;
   int  b = 0;

   public Calculator() {
      JFrame frame = new JFrame("Calculator");
      frame.setLayout(null);
      frame.setSize(400, 500);
      frame.setLocation(450, 150);

      displayButton = new JButton("");
      displayButton.setBounds(3, 10, 380, 80);
      displayButton.setBackground(Color.lightGray);
      displayButton.setOpaque(true);

      displayButton.setHorizontalAlignment(SwingConstants.RIGHT);
      displayButton.setForeground(Color.white);
      displayButton.setFont(new Font("Arial",Font.BOLD,40));
      frame.add(displayButton);
      displayButton.addActionListener(this);


      sevenButton = new JButton("7");
      sevenButton.setBounds(30, 120, 50, 50);
      frame.add(sevenButton);
      sevenButton.addActionListener(this);
      eightButton = new JButton("8");
      eightButton.setBounds(110, 120, 50, 50);
      frame.add(eightButton);
      eightButton.addActionListener(this);
      nineButton = new JButton("9");
      nineButton.setBounds(200, 120, 50, 50);
      frame.add(nineButton);
      nineButton.addActionListener(this);
      fourButton = new JButton("4");
      fourButton.setBounds(30, 200, 50, 50);
      frame.add(fourButton);
      fourButton.addActionListener(this);
      fiveButton = new JButton("5");
      fiveButton.setBounds(110, 200, 50, 50);
      frame.add(fiveButton);
      fiveButton.addActionListener(this);
      sixButton = new JButton("6");
      sixButton.setBounds(200, 200, 50, 50);
      frame.add(sixButton);
      sixButton.addActionListener(this);


      oneButton = new JButton("1");
      oneButton.setBounds(30, 280, 50, 50);
      frame.add(oneButton);
      oneButton.addActionListener(this);
      twoButton = new JButton("2");
      twoButton.setBounds(110, 280, 50, 50);
      frame.add(twoButton);
      twoButton.addActionListener(this);
      threeButton = new JButton("3");
      threeButton.setBounds(200, 280, 50, 50);
      frame.add(threeButton);
      threeButton.addActionListener(this);


      dotButton = new JButton(".");
      dotButton.setBounds(30, 360, 50, 50);
      frame.add(dotButton);
      dotButton.addActionListener(this);
      equaltoButton = new JButton("=");
      equaltoButton.setBounds(110, 360, 50, 50);
      frame.add(equaltoButton);
      equaltoButton.addActionListener(this);
      zeroButton = new JButton("0");
      zeroButton.setBounds(200, 360, 50, 50);
      frame.add(zeroButton);
      zeroButton.addActionListener(this);


      divButton = new JButton("/");
      divButton.setBounds(280, 120, 50, 50);
      frame.add(divButton);
      divButton.addActionListener(this);

      mulButton = new JButton("X");
      mulButton.setBounds(280, 200, 50, 50);
      frame.add(mulButton);
      mulButton.addActionListener(this);

      minusButton = new JButton("-");
      minusButton.setBounds(280, 280, 50, 50);
      frame.add(minusButton);
      minusButton.addActionListener(this);
      plusButton = new JButton("+");
      plusButton.setBounds(280, 360, 50, 50);
      frame.add(plusButton);
      plusButton.addActionListener(this);


      frame.setVisible(true);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

   }

   public static void main(String[] a) {
      new Calculator();

   }

   @Override
   public void actionPerformed(ActionEvent e) {

      if (e.getSource() == sevenButton) {


         displayButton.setText(displayButton.getText() + "7");

      } else if (e.getSource() == eightButton) {
         displayButton.setText(displayButton.getText() + "8");
      } else if (e.getSource() == nineButton) {
         displayButton.setText(displayButton.getText() + "9");
      } else if (e.getSource() == fourButton) {
         displayButton.setText(displayButton.getText() + "4");
      } else if (e.getSource() == fiveButton) {
         displayButton.setText(displayButton.getText() + "5");
      } else if (e.getSource() == sixButton) {
         displayButton.setText(displayButton.getText() + "6");
      } else if (e.getSource() == oneButton) {
         displayButton.setText(displayButton.getText() + "1");
      } else if (e.getSource() == twoButton) {
         displayButton.setText(displayButton.getText() + "2");
      } else if (e.getSource() == threeButton) {
         displayButton.setText(displayButton.getText() + "3");
      } else if (e.getSource() == dotButton) {
         displayButton.setText(displayButton.getText() + ".");
      } else if (e.getSource() == zeroButton) {
         displayButton.setText(displayButton.getText() + "0");
      } else if(e.getSource()==displayButton){
         displayButton.setText("");

      } else if (e.getSource() == divButton) {
         oldValue = displayButton.getText();
         b=4;
         displayButton.setText("");
      } else if (e.getSource() == mulButton) {
         oldValue = displayButton.getText();
         b=3;
         displayButton.setText("");
      } else if (e.getSource() == minusButton) {
         oldValue = displayButton.getText();
         b = 2;
         displayButton.setText("");
      } else if (e.getSource() == plusButton) {
         oldValue = displayButton.getText();
         b = 1;
         displayButton.setText("");
      }else if (e.getSource() == equaltoButton) {

         if (b == 1) {
            String newValue = displayButton.getText();
            float newValueF = Float.parseFloat(newValue);
            float oldValueF = Float.parseFloat(oldValue);
            float result = oldValueF + newValueF;
            displayButton.setText(result + "");
         } else if (b == 2) {

            String newValue = displayButton.getText();
            float newValueF = Float.parseFloat(newValue);
            float oldValueF = Float.parseFloat(oldValue);
            float result = oldValueF - newValueF;
            displayButton.setText(result + "");
         }else if(b==3){
            String newValue = displayButton.getText();
            float newValueF = Float.parseFloat(newValue);
            float oldValueF = Float.parseFloat(oldValue);
            float result = oldValueF * newValueF;
            displayButton.setText(result + "");

         }else if(b==4){
            String newValue = displayButton.getText();
            float newValueF = Float.parseFloat(newValue);
            float oldValueF = Float.parseFloat(oldValue);
            float result = oldValueF / newValueF;
            displayButton.setText(result + "");
         }else
         {
            displayButton.setText("null");
            System.out.println("hello");
         }


      }

   }

}





















