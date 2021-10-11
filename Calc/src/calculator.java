import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class calculator implements ActionListener{
	
	JButton add, sub, equal, mul, bsb, div, C, ce, one, two, zero, three, four, five, six, seven, eight, nine;
	JLabel l1, l2, l3;
	String lm = "p";
	static int operator = 0;
	static int a = 0;
	static int b = 0;
	static int result = 0;
	String type = "";
	boolean boolpower = false;
	public calculator() {

		JFrame f = new JFrame("Standard Calculator");

		l2 = new JLabel();
		l2.setText("Standard Calculator");
		l2.setBounds(10, 30, 285, 55);
		l2.setFont(l2.getFont().deriveFont(25.0f));
		l2.setVerticalAlignment(SwingConstants.CENTER);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		
		f.add(l2);
		
		l1 = new JLabel();
		l1.setBounds(10, 111, 285, 55);
		Border border = BorderFactory.createLineBorder(Color.black, 3);
		l1.setBorder(border);
		f.add(l1);
		
		l3 = new JLabel();
		l3.setBounds(194, 80, 100, 22);
		f.add(l3);

		add = new JButton("+");
		add.setBounds(230, 373, 70, 60);
		f.add(add);
		add.addActionListener(this);
		add.setForeground(Color.BLACK);
		add.setBackground(Color.LIGHT_GRAY);

		sub = new JButton("-");
		sub.setBounds(230, 309, 70, 60);
		f.add(sub);
		sub.addActionListener(this);
		sub.setForeground(Color.BLACK);
		sub.setBackground(Color.LIGHT_GRAY);
		
		mul = new JButton("×");
		mul.setBounds(230, 245, 70, 60);
		f.add(mul);
		mul.addActionListener(this);
		mul.setForeground(Color.BLACK);
		mul.setBackground(Color.LIGHT_GRAY);
		
		bsb = new JButton("<-");
		bsb.setBounds(155, 181, 70, 60);
		f.add(bsb);
		bsb.addActionListener(this);
		bsb.setForeground(Color.BLACK);
		bsb.setBackground(Color.WHITE);
		
		C = new JButton("C");
		C.setBounds(80, 181, 70, 60);
		f.add(C);
		C.addActionListener(this);
		C.setForeground(Color.BLACK);
		C.setBackground(Color.WHITE);
		
		ce = new JButton("CE");
		ce.setBounds(5, 181, 70, 60);
		f.add(ce);
		ce.addActionListener(this);
		ce.setForeground(Color.BLACK);
		ce.setBackground(Color.WHITE);
		
		div = new JButton("÷");
		div.setBounds(230, 181, 70, 60);
		f.add(div);
		div.addActionListener(this);
		div.setForeground(Color.BLACK);
		div.setBackground(Color.LIGHT_GRAY);

		equal = new JButton("=");
		equal.setBounds(230, 437, 70, 60);
		f.add(equal);
		equal.addActionListener(this);
		equal.setForeground(Color.BLACK);
		equal.setBackground(Color.GRAY);
		
		zero = new JButton("0");
		zero.setBounds(80, 437, 70, 60);
		f.add(zero);
		zero.addActionListener(this);
		
		one = new JButton("1");
		one.setBounds(5, 373, 70, 60);
		f.add(one);
		one.addActionListener(this);

		two = new JButton("2");
		two.setBounds(80, 373, 70, 60);
		f.add(two);
		two.addActionListener(this);
		
		three = new JButton("3");
		three.setBounds(155, 373, 70, 60);
		f.add(three);
		three.addActionListener(this);
		
		four = new JButton("4");
		four.setBounds(5, 309, 70, 60);
		f.add(four);
		four.addActionListener(this);
		
		five = new JButton("5");
		five.setBounds(80, 309, 70, 60);
		f.add(five);
		five.addActionListener(this);
		
		six = new JButton("6");
		six.setBounds(155, 309, 70, 60);
		f.add(six);
		six.addActionListener(this);
		
		seven = new JButton("7");
		seven.setBounds(5, 245, 70, 60);
		f.add(seven);
		seven.addActionListener(this);
		
		eight = new JButton("8");
		eight.setBounds(80, 245, 70, 60);
		f.add(eight);
		eight.addActionListener(this);
		
		nine = new JButton("9");
		nine.setBounds(155, 245, 70, 60);
		f.add(nine);
		nine.addActionListener(this);

		f.setSize(319, 539);
		f.setLayout(null);
		f.setVisible(true);;
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE); 
    }

	public static void main(String[] args) {
		new calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==one)
		{
			l1.setText(l1.getText()+"1");
		}
		
		if(e.getSource()==two)
		{
			l1.setText(l1.getText()+"2");
		}
		
		if(e.getSource()==three)
		{
			l1.setText(l1.getText()+"3");
		}
		
		if(e.getSource()==four)
		{
			l1.setText(l1.getText()+"4");
		}
		
		if(e.getSource()==five)
		{
			l1.setText(l1.getText()+"5");
		}
		
		if(e.getSource()==six)
		{
			l1.setText(l1.getText()+"6");
		}
		
		if(e.getSource()==seven)
		{
			l1.setText(l1.getText()+"7");
		}
		
		if(e.getSource()==eight)
		{
			l1.setText(l1.getText()+"8");
		}
		
		if(e.getSource()==nine)
		{
			l1.setText(l1.getText()+"9");
		}
		
		if(e.getSource()==zero)
		{
			l1.setText(l1.getText()+"0");
		}
		
		if(e.getSource()==add)
		{
			l3.setText(l1.getText());
			l3.setText(l3.getText()+" + ");
			lm = (l3.getText());
			a = Integer.parseInt(l1.getText());
			operator = 1;
			l1.setText("");
		}
		
		if(e.getSource()==sub)
		{
			l3.setText(l1.getText());
			l3.setText(l3.getText()+" - ");
			lm = (l3.getText());
			a = Integer.parseInt(l1.getText());
			operator = 2;
			l1.setText("");
		}
		
		if(e.getSource()==mul)
		{
			l3.setText(l1.getText());
			l3.setText(l3.getText()+" × ");
		    lm = (l3.getText());
			a = Integer.parseInt(l1.getText());
			operator = 3;
			l1.setText("");
		}
		
		if(e.getSource()==div)
		{
			l3.setText(l1.getText());
			l3.setText(l3.getText()+" ÷ ");
			lm = (l3.getText());
			a = Integer.parseInt(l1.getText());
			operator = 4;
			l1.setText("");
		}
		
		if(e.getSource()==equal)
		{
			b = Integer.parseInt(l1.getText());
			l3.setText(l3.getText()+b+" =");
			l1.setText("");
			switch(operator)
			{
				case 1: result = a + b;
					break;
		
				case 2: result = a - b;
					break;
		
				case 3: result = a * b;
					break;
		
				case 4: result = a / b;
					break;
		
				default: result = 0;
			}	
			l1.setText(""+result);
				}
		
		if(e.getSource()==C)
		{
			l1.setText("");
			l3.setText("");
			result = 0;
		}
		
		if(e.getSource()==ce)
		{
			l1.setText("");
		}
		
		if(e.getSource()==bsb)
		{
			String s = l1.getText();
			l1.setText(" ");
			for(int i=0;i<s.length()-1;i++)
			l1.setText(l1.getText()+s.charAt(i));
		}

	}
}