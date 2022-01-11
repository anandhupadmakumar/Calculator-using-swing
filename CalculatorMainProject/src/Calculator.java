import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener {
   JButton sevenButton, eightButton, nineButton;
   JButton fourButton, fiveButton, sixButton;
   JButton oneButton, twoButton, threeButton;
   JButton dotButton, zeroButton;
   JButton divButton, mulButton, minusButton, plusButton, equaltoButton,clearButton;
   JLabel displayLabel;
   JLabel outerDisplayLabel;
   String oldValue;
   int  click = 0;
   Border colorBorder = BorderFactory.createLineBorder(Color.white,1);

   public Calculator() {
      JFrame frame = new JFrame("Calculator");
      frame.setLayout(null);
      frame.getContentPane().setBackground(Color.black);

      frame.setSize(335, 550);
      frame.setLocation(450, 150);
      displayLabel = new JLabel("");
      displayLabel.setBounds(30, 40, 255, 40);
      displayLabel.setBackground(Color.darkGray);
      displayLabel.setOpaque(true);
      displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      displayLabel.setForeground(Color.white);
      displayLabel.setFont(new Font("Arial",Font.BOLD,30));
      frame.add(displayLabel);

      outerDisplayLabel = new JLabel("");
      outerDisplayLabel.setBounds(25, 35, 265, 50);
      outerDisplayLabel.setBackground(Color.white);
      outerDisplayLabel.setOpaque(true);
      frame.add(outerDisplayLabel);

      sevenButton = new JButton("7");
      sevenButton.setBackground(Color.darkGray);
      sevenButton.setOpaque(true);
      sevenButton.setForeground(Color.LIGHT_GRAY);
      sevenButton.setFont(new Font("",Font.BOLD,25));
      sevenButton.setBorder(colorBorder);
      sevenButton.setBounds(30, 120, 50, 50);
      frame.add(sevenButton);
      sevenButton.addActionListener(this);

      eightButton = new JButton("8");
      eightButton.setBackground(Color.darkGray);
      eightButton.setOpaque(true);
      eightButton.setForeground(Color.LIGHT_GRAY);
      eightButton.setFont(new Font("",Font.BOLD,25));
      eightButton.setBorder(colorBorder);
      eightButton.setBounds(100, 120, 50, 50);
      frame.add(eightButton);
      eightButton.addActionListener(this);

      nineButton = new JButton("9");
      nineButton.setBackground(Color.darkGray);
      nineButton.setOpaque(true);
      nineButton.setForeground(Color.LIGHT_GRAY);
      nineButton.setFont(new Font("",Font.BOLD,25));
      nineButton.setBorder(colorBorder);
      nineButton.setBounds(170, 120, 50, 50);
      frame.add(nineButton);
      nineButton.addActionListener(this);

      fourButton = new JButton("4");
      fourButton.setBackground(Color.darkGray);
      fourButton.setOpaque(true);
      fourButton.setForeground(Color.LIGHT_GRAY);
      fourButton.setFont(new Font("",Font.BOLD,25));
      fourButton.setBorder(colorBorder);
      fourButton.setBounds(30, 200, 50, 50);
      frame.add(fourButton);
      fourButton.addActionListener(this);

      fiveButton = new JButton("5");
      fiveButton.setBackground(Color.darkGray);
      fiveButton.setOpaque(true);
      fiveButton.setForeground(Color.LIGHT_GRAY);
      fiveButton.setFont(new Font("",Font.BOLD,25));
      fiveButton.setBorder(colorBorder);
      fiveButton.setBounds(100, 200, 50, 50);
      frame.add(fiveButton);
      fiveButton.addActionListener(this);

      sixButton = new JButton("6");
      sixButton.setBackground(Color.darkGray);
      sixButton.setOpaque(true);
      sixButton.setForeground(Color.LIGHT_GRAY);
      sixButton.setFont(new Font("",Font.BOLD,25));
      sixButton.setBorder(colorBorder);
      sixButton.setBounds(170, 200, 50, 50);
      frame.add(sixButton);
      sixButton.addActionListener(this);

      oneButton = new JButton("1");
      oneButton.setBackground(Color.darkGray);
      oneButton.setOpaque(true);
      oneButton.setForeground(Color.LIGHT_GRAY);
      oneButton.setFont(new Font("",Font.BOLD,25));
      oneButton.setBorder(colorBorder);
      oneButton.setBounds(30, 280, 50, 50);
      frame.add(oneButton);
      oneButton.addActionListener(this);

      twoButton = new JButton("2");
      twoButton.setBackground(Color.darkGray);
      twoButton.setOpaque(true);
      twoButton.setForeground(Color.LIGHT_GRAY);
      twoButton.setFont(new Font("",Font.BOLD,25));
      twoButton.setBorder(colorBorder);
      twoButton.setBounds(100, 280, 50, 50);
      frame.add(twoButton);
      twoButton.addActionListener(this);

      threeButton = new JButton("3");
      threeButton.setBackground(Color.darkGray);
      threeButton.setOpaque(true);
      threeButton.setForeground(Color.LIGHT_GRAY);
      threeButton.setFont(new Font("",Font.BOLD,25));
      threeButton.setBorder(colorBorder);
      threeButton.setBounds(170, 280, 50, 50);
      frame.add(threeButton);
      threeButton.addActionListener(this);


      dotButton = new JButton(".");
      dotButton.setBackground(Color.darkGray);
      dotButton.setOpaque(true);
      dotButton.setForeground(Color.LIGHT_GRAY);
      dotButton.setFont(new Font("",Font.BOLD,25));
      dotButton.setBorder(colorBorder);
      dotButton.setBounds(30, 360, 50, 50);
      frame.add(dotButton);
      dotButton.addActionListener(this);

      zeroButton = new JButton("0");
      zeroButton.setBackground(Color.darkGray);
      zeroButton.setOpaque(true);
      zeroButton.setForeground(Color.LIGHT_GRAY);
      zeroButton.setFont(new Font("",Font.BOLD,25));
      zeroButton.setBorder(colorBorder);
      zeroButton.setBounds(100, 360, 50, 50);
      frame.add(zeroButton);
      zeroButton.addActionListener(this);

      clearButton = new JButton("c");
      clearButton.setBackground(Color.darkGray);
      clearButton.setOpaque(true);
      clearButton.setForeground(Color.white);
      clearButton.setFont(new Font("",Font.BOLD,25));
      clearButton.setBorder(colorBorder);
      clearButton.setBounds(170, 360, 50, 50);
      frame.add(clearButton);
      clearButton.addActionListener(this);


      divButton = new JButton("/");
      divButton.setBackground(Color.darkGray);
      divButton.setOpaque(true);
      divButton.setForeground(Color.white);
      divButton.setFont(new Font("",Font.BOLD,25));
      divButton.setBorder(colorBorder);
      divButton.setBounds(240, 120, 50, 50);
      frame.add(divButton);
      divButton.addActionListener(this);

      mulButton = new JButton("x");
      mulButton.setBackground(Color.darkGray);
      mulButton.setOpaque(true);
      mulButton.setForeground(Color.white);
      mulButton.setFont(new Font("",Font.BOLD,25));
      mulButton.setBorder(colorBorder);
      mulButton.setBounds(240, 200, 50, 50);
      frame.add(mulButton);
      mulButton.addActionListener(this);

      minusButton = new JButton("-");
      minusButton.setBackground(Color.darkGray);
      minusButton.setOpaque(true);
      minusButton.setForeground(Color.white);
      minusButton.setFont(new Font("",Font.BOLD,25));
      minusButton.setBorder(colorBorder);
      minusButton.setBounds(240, 280, 50, 50);
      frame.add(minusButton);
      minusButton.addActionListener(this);

      plusButton = new JButton("+");
      plusButton.setBackground(Color.darkGray);
      plusButton.setOpaque(true);
      plusButton.setForeground(Color.white);
      plusButton.setFont(new Font("",Font.BOLD,25));
      plusButton.setBorder(colorBorder);
      plusButton.setBounds(240, 360, 50, 50);
      frame.add(plusButton);
      plusButton.addActionListener(this);

      equaltoButton = new JButton("=");
      equaltoButton.setBounds(30, 440, 260, 40);
      equaltoButton.setBackground(Color.red);
      equaltoButton.setOpaque(true);
      equaltoButton.setForeground(Color.white);
      equaltoButton.setFont(new Font("",Font.BOLD,25));
      equaltoButton.setBorder(colorBorder);
      frame.add(equaltoButton);
      equaltoButton.addActionListener(this);



      frame.setVisible(true);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

   }

   public static void main(String[] a) {
      new Calculator();


   }

   @Override
   public void actionPerformed(ActionEvent e) {



      if (e.getSource() == sevenButton) {


         displayLabel.setText(displayLabel.getText() + "7");

      } else if (e.getSource() == eightButton) {
         displayLabel.setText(displayLabel.getText() + "8");
      } else if (e.getSource() == nineButton) {
         displayLabel.setText(displayLabel.getText() + "9");
      } else if (e.getSource() == fourButton) {
         displayLabel.setText(displayLabel.getText() + "4");
      } else if (e.getSource() == fiveButton) {
         displayLabel.setText(displayLabel.getText() + "5");
      } else if (e.getSource() == sixButton) {
         displayLabel.setText(displayLabel.getText() + "6");
      } else if (e.getSource() == oneButton) {
         displayLabel.setText(displayLabel.getText() + "1");
      } else if (e.getSource() == twoButton) {
         displayLabel.setText(displayLabel.getText() + "2");
      } else if (e.getSource() == threeButton) {
         displayLabel.setText(displayLabel.getText() + "3");
      } else if (e.getSource() == dotButton) {
         displayLabel.setText(displayLabel.getText() + ".");
      } else if (e.getSource() == zeroButton) {
         displayLabel.setText(displayLabel.getText() + "0");
      } else if(e.getSource()==clearButton){
         displayLabel.setText("");

      } else if (e.getSource() == divButton) {
         oldValue = displayLabel.getText();
         click=4;
         displayLabel.setText("");
      } else if (e.getSource() == mulButton) {
         oldValue = displayLabel.getText();
         click=3;
         displayLabel.setText("");
      } else if (e.getSource() == minusButton) {
         oldValue = displayLabel.getText();
         click = 2;
         displayLabel.setText("");
      } else if (e.getSource() == plusButton) {
         oldValue = displayLabel.getText();
         click = 1;
         displayLabel.setText("");
      }else if (e.getSource() == equaltoButton) {

         if (click == 1) {
            String newValue = displayLabel.getText();
            float newValueF = Float.parseFloat(newValue);
            float oldValueF = Float.parseFloat(oldValue);
            float result = oldValueF + newValueF;
            displayLabel.setText(result + "");
         } else if (click == 2) {

            String newValue = displayLabel.getText();
            float newValueF = Float.parseFloat(newValue);
            float oldValueF = Float.parseFloat(oldValue);
            float result = oldValueF - newValueF;
            displayLabel.setText(result + "");
         }else if(click==3){
            String newValue = displayLabel.getText();
            float newValueF = Float.parseFloat(newValue);
            float oldValueF = Float.parseFloat(oldValue);
            float result = oldValueF * newValueF;
            displayLabel.setText(result + "");

         }else if(click==4){
            String newValue = displayLabel.getText();
            float newValueF = Float.parseFloat(newValue);
            float oldValueF = Float.parseFloat(oldValue);
            float result = oldValueF / newValueF;
            displayLabel.setText(result + "");


         }
         else
         {
            displayLabel.setText("null");


         }


      }

   }

}





















