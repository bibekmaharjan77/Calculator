package simplecalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton add,sub,mul,div;
    Container c;
    Myframe(){
        setTitle("Simple Calculator");
        setBounds(100,100,500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c=getContentPane();
        c.setLayout(null);
        
        l1=new JLabel("First Number: ");
        l1.setBounds(10,10,150,40);
        c.add(l1);
        
        l2=new JLabel("Second Number: ");
        l2.setBounds(10,50,150,40);
        c.add(l2);
        
        t1=new JTextField();
        t1.setBounds(120,10,150,30);
        c.add(t1);
        
        t2=new JTextField();
        t2.setBounds(120,50,150,30);
        c.add(t2);
        
        add=new JButton("+");
        add.setBounds(10,90,50,40);
        c.add(add);
        
        sub=new JButton("-");
        sub.setBounds(70,90,50,40);
        c.add(sub);
        
        mul=new JButton("x");
        mul.setBounds(130,90,50,40);
        c.add(mul);
        
        div=new JButton("/");
        div.setBounds(190,90,50,40);
        c.add(div);
        
        l3=new JLabel("Result :");
        l3.setBounds(10,130,200,40);
        c.add(l3);
        
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
        if(e.getSource()==add){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a+b;
            l3.setText("Result : "+c);
        }
        if(e.getSource()==sub){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a-b;
            l3.setText("Result : "+c);
        }
        if(e.getSource()==mul){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a*b;
            l3.setText("Result : "+c);
        }
        if(e.getSource()==div){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a/b;
            l3.setText("Result : "+c);
        }
        } catch(NumberFormatException e1){
            l3.setText("Please enter integers only");
        }
        catch(ArithmeticException e2){
            l3.setText("Can't divide by zero");
        }
    }
}

public class SimpleCalculator {

    public static void main(String[] args) {
        Myframe frame=new Myframe();
    }
    
}
