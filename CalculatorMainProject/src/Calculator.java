import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Calculator implements ActionListener {
   JButton sevenButton, eightButton, nineButton;
   JButton fourButton, fiveButton, sixButton;
   JButton oneButton, twoButton, threeButton;
   JButton dotButton, zeroButton;
   JButton divButton, mulButton, minusButton, plusButton,
           equaltoButton, clearButton,divisionByX,squareButton,sqrtButton,eraserButton;
   JLabel displayLabel,descriptionLabel;
   boolean isOperatorClicked = false;
   float lastNumber = 0,firstNumber = 0, result = 0;

   String click = "";//click is used to find the operator
   Border colorBorder = BorderFactory.createLineBorder(Color.white, 1);
   ArrayList<String> number=new ArrayList<>();


   public Calculator() {
      JFrame frame = new JFrame("Calculator");
      frame.setLayout(null);
      frame.getContentPane().setBackground(Color.black);

      frame.setSize(335, 550);
      frame.setLocation(450, 150);




      displayLabel = new JLabel("");
      displayLabel.setBounds(25, 70, 265, 60);
      displayLabel.setBackground(Color.darkGray);
      displayLabel.setOpaque(true);
      displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      displayLabel.setForeground(Color.white);
      displayLabel.setFont(new Font("Arial", Font.BOLD, 30));

      frame.add(displayLabel);





      descriptionLabel=new JLabel("");
      descriptionLabel.setBounds(25, 30, 265, 40);
      descriptionLabel.setBackground(Color.darkGray);
      descriptionLabel.setOpaque(true);
      descriptionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
      descriptionLabel.setForeground(Color.LIGHT_GRAY);
      descriptionLabel.setFont(new Font("Arial",Font.ITALIC,20));
      frame.add(descriptionLabel);

      JLabel borderDisplay=new JLabel("");
      borderDisplay.setBounds(23, 28, 269, 105);
      borderDisplay.setBackground(Color.white);
      borderDisplay.setOpaque(true);
      frame.add(borderDisplay);

      divisionByX = new JButton("1/x");
      divisionByX.setBackground(Color.darkGray);
      divisionByX.setOpaque(true);
      divisionByX.setForeground(Color.LIGHT_GRAY);
      divisionByX.setFont(new Font("", Font.BOLD, 18));
      divisionByX.setBorder(colorBorder);
      divisionByX.setBounds(30, 160, 50, 50);
      frame.add(divisionByX);
      divisionByX.addActionListener(this);

      squareButton = new JButton("x²");
      squareButton.setBackground(Color.darkGray);
      squareButton.setOpaque(true);
      squareButton.setForeground(Color.LIGHT_GRAY);
      squareButton.setFont(new Font("", Font.BOLD, 25));
      squareButton.setBorder(colorBorder);
      squareButton.setBounds(100, 160, 50, 50);
      frame.add(squareButton);
      squareButton.addActionListener(this);

      sqrtButton = new JButton("√");
      sqrtButton.setBackground(Color.darkGray);
      sqrtButton.setOpaque(true);
      sqrtButton.setForeground(Color.LIGHT_GRAY);
      sqrtButton.setFont(new Font("", Font.BOLD, 25));
      sqrtButton.setBorder(colorBorder);
      sqrtButton.setBounds(170, 160, 50, 50);
      frame.add(sqrtButton);
      sqrtButton.addActionListener(this);

      eraserButton = new JButton("←");
      eraserButton.setBackground(Color.darkGray);
      eraserButton.setOpaque(true);
      eraserButton.setForeground(Color.white);
      eraserButton.setFont(new Font("", Font.BOLD, 25));
      eraserButton.setBorder(colorBorder);
      eraserButton.setBounds(240, 160, 50, 50);
      frame.add(eraserButton);
      eraserButton.addActionListener(this);





      sevenButton = new JButton("7");
      sevenButton.setBackground(Color.darkGray);
      sevenButton.setOpaque(true);
      sevenButton.setForeground(Color.LIGHT_GRAY);
      sevenButton.setFont(new Font("", Font.BOLD, 25));
      sevenButton.setBorder(colorBorder);
      sevenButton.setBounds(30, 220, 50, 50);
      frame.add(sevenButton);
      sevenButton.addActionListener(this);

      eightButton = new JButton("8");
      eightButton.setBackground(Color.darkGray);
      eightButton.setOpaque(true);
      eightButton.setForeground(Color.LIGHT_GRAY);
      eightButton.setFont(new Font("", Font.BOLD, 25));
      eightButton.setBorder(colorBorder);
      eightButton.setBounds(100, 220, 50, 50);
      frame.add(eightButton);
      eightButton.addActionListener(this);

      nineButton = new JButton("9");
      nineButton.setBackground(Color.darkGray);
      nineButton.setOpaque(true);
      nineButton.setForeground(Color.LIGHT_GRAY);
      nineButton.setFont(new Font("", Font.BOLD, 25));
      nineButton.setBorder(colorBorder);
      nineButton.setBounds(170, 220, 50, 50);
      frame.add(nineButton);
      nineButton.addActionListener(this);

      fourButton = new JButton("4");
      fourButton.setBackground(Color.darkGray);
      fourButton.setOpaque(true);
      fourButton.setForeground(Color.LIGHT_GRAY);
      fourButton.setFont(new Font("", Font.BOLD, 25));
      fourButton.setBorder(colorBorder);
      fourButton.setBounds(30, 280, 50, 50);
      frame.add(fourButton);
      fourButton.addActionListener(this);

      fiveButton = new JButton("5");
      fiveButton.setBackground(Color.darkGray);
      fiveButton.setOpaque(true);
      fiveButton.setForeground(Color.LIGHT_GRAY);
      fiveButton.setFont(new Font("", Font.BOLD, 25));
      fiveButton.setBorder(colorBorder);
      fiveButton.setBounds(100, 280, 50, 50);
      frame.add(fiveButton);
      fiveButton.addActionListener(this);

      sixButton = new JButton("6");
      sixButton.setBackground(Color.darkGray);
      sixButton.setOpaque(true);
      sixButton.setForeground(Color.LIGHT_GRAY);
      sixButton.setFont(new Font("", Font.BOLD, 25));
      sixButton.setBorder(colorBorder);
      sixButton.setBounds(170, 280, 50, 50);
      frame.add(sixButton);
      sixButton.addActionListener(this);

      oneButton = new JButton("1");
      oneButton.setBackground(Color.darkGray);
      oneButton.setOpaque(true);
      oneButton.setForeground(Color.LIGHT_GRAY);
      oneButton.setFont(new Font("", Font.BOLD, 25));
      oneButton.setBorder(colorBorder);
      oneButton.setBounds(30, 340, 50, 50);
      frame.add(oneButton);
      oneButton.addActionListener(this);

      twoButton = new JButton("2");
      twoButton.setBackground(Color.darkGray);
      twoButton.setOpaque(true);
      twoButton.setForeground(Color.LIGHT_GRAY);
      twoButton.setFont(new Font("", Font.BOLD, 25));
      twoButton.setBorder(colorBorder);
      twoButton.setBounds(100, 340, 50, 50);
      frame.add(twoButton);
      twoButton.addActionListener(this);

      threeButton = new JButton("3");
      threeButton.setBackground(Color.darkGray);
      threeButton.setOpaque(true);
      threeButton.setForeground(Color.LIGHT_GRAY);
      threeButton.setFont(new Font("", Font.BOLD, 25));
      threeButton.setBorder(colorBorder);
      threeButton.setBounds(170, 340, 50, 50);
      frame.add(threeButton);
      threeButton.addActionListener(this);


      dotButton = new JButton(".");
      dotButton.setBackground(Color.darkGray);
      dotButton.setOpaque(true);
      dotButton.setForeground(Color.LIGHT_GRAY);
      dotButton.setFont(new Font("", Font.BOLD, 25));
      dotButton.setBorder(colorBorder);
      dotButton.setBounds(30, 400, 50, 50);
      frame.add(dotButton);
      dotButton.addActionListener(this);

      zeroButton = new JButton("0");
      zeroButton.setBackground(Color.darkGray);
      zeroButton.setOpaque(true);
      zeroButton.setForeground(Color.LIGHT_GRAY);
      zeroButton.setFont(new Font("", Font.BOLD, 25));
      zeroButton.setBorder(colorBorder);
      zeroButton.setBounds(100, 400, 50, 50);
      frame.add(zeroButton);
      zeroButton.addActionListener(this);

      clearButton = new JButton("c");
      clearButton.setBackground(Color.darkGray);
      clearButton.setOpaque(true);
      clearButton.setForeground(Color.white);
      clearButton.setFont(new Font("", Font.BOLD, 25));
      clearButton.setBorder(colorBorder);
      clearButton.setBounds(170, 400, 50, 50);
      frame.add(clearButton);
      clearButton.addActionListener(this);


      divButton = new JButton("/");
      divButton.setBackground(Color.darkGray);
      divButton.setOpaque(true);
      divButton.setForeground(Color.white);
      divButton.setFont(new Font("", Font.BOLD, 25));
      divButton.setBorder(colorBorder);
      divButton.setBounds(240, 220, 50, 50);
      frame.add(divButton);
      divButton.addActionListener(this);

      mulButton = new JButton("x");
      mulButton.setBackground(Color.darkGray);
      mulButton.setOpaque(true);
      mulButton.setForeground(Color.white);
      mulButton.setFont(new Font("", Font.BOLD, 25));
      mulButton.setBorder(colorBorder);
      mulButton.setBounds(240, 280, 50, 50);
      frame.add(mulButton);
      mulButton.addActionListener(this);

      minusButton = new JButton("-");
      minusButton.setBackground(Color.darkGray);
      minusButton.setOpaque(true);
      minusButton.setForeground(Color.white);
      minusButton.setFont(new Font("", Font.BOLD, 25));
      minusButton.setBorder(colorBorder);
      minusButton.setBounds(240, 340, 50, 50);
      frame.add(minusButton);
      minusButton.addActionListener(this);

      plusButton = new JButton("+");
      plusButton.setBackground(Color.darkGray);
      plusButton.setOpaque(true);
      plusButton.setForeground(Color.white);
      plusButton.setFont(new Font("", Font.BOLD, 25));
      plusButton.setBorder(colorBorder);
      plusButton.setBounds(240, 400, 50, 50);
      frame.add(plusButton);
      plusButton.addActionListener(this);

      equaltoButton = new JButton("=");
      equaltoButton.setBounds(30, 460, 260, 40);
      equaltoButton.setBackground(Color.red);
      equaltoButton.setOpaque(true);
      equaltoButton.setForeground(Color.white);
      equaltoButton.setFont(new Font("", Font.BOLD, 25));
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

         if (isOperatorClicked) {


            displayLabel.setText("7");
            isOperatorClicked = false;

         } else {
            displayLabel.setText(displayLabel.getText() + "7");
         }
      } else if (e.getSource() == eightButton) {
         if (isOperatorClicked) {

            displayLabel.setText("8");
            isOperatorClicked = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "8");
         }
      } else if (e.getSource() == nineButton) {
         if (isOperatorClicked) {
            displayLabel.setText("9");
            isOperatorClicked = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "9");
         }
      } else if (e.getSource() == fourButton) {
         if (isOperatorClicked) {
            displayLabel.setText("4");
            isOperatorClicked = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "4");
         }
      } else if (e.getSource() == fiveButton) {
         if (isOperatorClicked) {
            displayLabel.setText("5");
            isOperatorClicked = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "5");
         }
      } else if (e.getSource() == sixButton) {
         if (isOperatorClicked) {
            displayLabel.setText("6");
            isOperatorClicked = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "6");

         }
      } else if (e.getSource() == oneButton) {
         if (isOperatorClicked) {
            displayLabel.setText("1");
            isOperatorClicked = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "1");

         }
      } else if (e.getSource() == twoButton) {
         if (isOperatorClicked) {
            displayLabel.setText("2");
            isOperatorClicked = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "2");

         }
      } else if (e.getSource() == threeButton) {
         if (isOperatorClicked) {
            displayLabel.setText("3");
            isOperatorClicked = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "3");

         }
      } else if (e.getSource() == dotButton) {
         if (isOperatorClicked) {
            displayLabel.setText(".");
            isOperatorClicked = false;
         } else {
            displayLabel.setText(displayLabel.getText() + ".");

         }
      } else if (e.getSource() == zeroButton) {
         if (isOperatorClicked) {
            displayLabel.setText("0");
            isOperatorClicked = false;
         } else {
            displayLabel.setText(displayLabel.getText() + "0");


         }

      } else if (e.getSource() == clearButton) {
         displayLabel.setText("");
         descriptionLabel.setText("");
         click = "";
         result=0;
         number.clear();

      } else if (e.getSource() == plusButton) {



         isOperatorClicked = true;

         operators();
         click = "+";
         descriptionLabel.setText(descriptionLabel.getText()+displayLabel.getText()+click+" ");



      } else if (e.getSource() == minusButton) {
         isOperatorClicked = true;

         operators();
         click="-";
         descriptionLabel.setText(descriptionLabel.getText()+displayLabel.getText()+click+" ");



      }else if(e.getSource()==mulButton){
         isOperatorClicked=true;

         operators();
         click="*";
         descriptionLabel.setText(descriptionLabel.getText()+displayLabel.getText()+click+" ");

      }else if(e.getSource()==divButton){
         isOperatorClicked=true;

         operators();
         click="/";
         descriptionLabel.setText(descriptionLabel.getText()+displayLabel.getText()+click+" ");

      } else if (e.getSource() == equaltoButton) {
         descriptionLabel.setText(descriptionLabel.getText()+displayLabel.getText()+" ");

         operators();
         displayLabel.setText(result+"");

      }else if(e.getSource()==divisionByX){
        descriptionLabel.setText(("1/")+(displayLabel.getText()));
        float num=Float.parseFloat(displayLabel.getText());
        float resultx=1/num;
        displayLabel.setText(resultx+"");
      }else if(e.getSource()==squareButton){
         descriptionLabel.setText("(sqr)"+displayLabel.getText());
         float num1=Float.parseFloat(displayLabel.getText());
         float resultx=num1*num1;


         displayLabel.setText(resultx+"");

      }else if(e.getSource()==sqrtButton){
         descriptionLabel.setText(("√ "+displayLabel.getText()));
        float numsqrt=Float.parseFloat(displayLabel.getText());
        double resultSqrt=Math.sqrt(numsqrt);
         displayLabel.setText(resultSqrt+"");
      }else if(e.getSource()==eraserButton){
         displayLabel.setText(displayLabel.getText().substring(0, displayLabel.getText().length() - 1));

      }
   }
   void operators() {


     number.add(displayLabel.getText());
      if(number.size()==2) {
        firstNumber = Float.parseFloat(number.get(0));

         lastNumber = Float.parseFloat(number.get(1));
         number.clear();
         switch (click) {
            case "+" -> result = firstNumber + lastNumber;
            case "-" -> result = firstNumber - lastNumber;
            case "*" -> result = firstNumber * lastNumber;
            case "/" -> result = firstNumber / lastNumber;
         }
         number.add(String.valueOf(result));

      }

      }


  }
























