package cherbox.Javax.Massiv.MyCalculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Виталий on 25.02.2016.
 */
public class Calculator1 {
    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivide;
    JButton buttonMultiplication;
    JPanel p1;
    JPanel p2;
    private JTable table1;
    private JTextPane textPane1;
    Calculator1(){
        windowContent= new JPanel();
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);
        displayField = new JTextField(30);
        windowContent.add("North",displayField);
        button0=new JButton("0");
        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("9");
        button9=new JButton("9");
        buttonPoint=new JButton(".");
        buttonEqual=new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivide = new JButton("/");
        buttonMultiplication = new JButton("*");
        p1 = new JPanel();
        GridLayout g1 = new GridLayout(4,3);
        p1.setLayout(g1);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        windowContent.add("Center",p1);
        p2= new JPanel();
        p2.setLayout(g1);
        p2.add(buttonPoint);
        p2.add(buttonEqual);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivide);
        p2.add(buttonMultiplication);
        windowContent.add("East",p2);
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Calculator1 calm = new Calculator1();
    }
}
