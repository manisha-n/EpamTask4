package task;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code=”InterestCalc” width=450 height=300>
</applet>
*/
public class InterestCalc extends Applet implements ActionListener {
/**
*
*/
private static final long serialVersionUID = 1L;
JButton b1;
JButton b2;
JTextField t1,t2,t3,t4,t5;
JLabel l1,l2,l3;
JPanel p;
public void init()
{
// TODO start asynchronous download of heavy resources

l1=new JLabel("principle amount");
l2=new JLabel("time period");
l3=new JLabel("rate of interest");
b1=new JButton("simple interest");
b2=new JButton("compound interest");

t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();
t5=new JTextField();
this.setLayout(new GridLayout(5,2
));
this.add(l1);
this.add(t1);
this.add(l2);
this.add(t2);
this.add(l3);
this.add(t3);
this.add(b1);
this.add(t4);
this.add(b2);
this.add(t5);
b1.addActionListener(this);
b2.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
double principleamount,timeperiod,rateofinterest,simpleinterest,compoundinterest;
principleamount=Double.parseDouble(t1.getText());
timeperiod=Double.parseDouble(t2.getText());
rateofinterest=Double.parseDouble(t3.getText());

if (ae.getSource()==b1)
{
simpleinterest=(principleamount*timeperiod*rateofinterest)/100.0;
t4.setText(String.valueOf(simpleinterest));
}
else if(ae.getSource()==b2)
{
compoundinterest=(principleamount*(Math.pow((1+(rateofinterest/100.0)),timeperiod)));
t5.setText(String.valueOf(compoundinterest));
}
}

}