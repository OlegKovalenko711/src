package lesson5;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcPanel extends JPanel
{
	JTextField txt = new JTextField();
	String aNum = null;
	String op = null;

	public CalcPanel()
	{
		setLayout(null);

		setBackground(Color.DARK_GRAY);
		txt.setBounds(10, 20, 360, 20);
		add(txt);

		JPanel pNum = new JPanel();
		pNum.setLayout(new GridLayout(4, 3, 5, 5));
		pNum.setBounds(10, 40, 200, 200);
		pNum.setBackground(Color.LIGHT_GRAY);
		pNum.setBorder(BorderFactory.createLineBorder(Color.black));
		add(pNum);

		JPanel pOp = new JPanel();
		pOp.setLayout(new GridLayout(4, 2, 4, 4));
		pOp.setBounds(220, 40, 150, 200);
		pOp.setBackground(Color.LIGHT_GRAY);
		pOp.setBorder(BorderFactory.createLineBorder(Color.black));
		NumAction nAct = new NumAction();
		add(pOp);

		String[] btnArrNum = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "C", "about" };

		for (int i = 0; i < btnArrNum.length; i++)
		{
			JButton numBtn = new JButton(btnArrNum[i]);
			numBtn.setBorder(BorderFactory.createLineBorder(Color.cyan));
			numBtn.addActionListener(nAct);
			pNum.add(numBtn);
		}

		Operation cOp = new Operation();
		String[] btnArrOp = { "+", "-", "*", "/", "sqrt", "pow", "sin", "cos", "mod", "bin", "%", "=" };

		for (int i = 0; i < btnArrOp.length; i++)
		{
			JButton opBtn = new JButton(btnArrOp[i]);
			opBtn.setBorder(BorderFactory.createLineBorder(Color.blue));
			opBtn.addActionListener(cOp);
			pOp.add(opBtn);
		}
	}

	class NumAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			String num = e.getActionCommand();
			if (num.equals("C"))
			{
				txt.setText("");
			}
			else if (num.equals("about"))
			{
				JOptionPane.showMessageDialog(null, "Calculator V_2.0" + "\n" + "Develop by Kovalenko Oleg");
			}
			else
			{
				txt.setText(txt.getText() + num);
			}
		}
	}

	class Operation implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			String num = e.getActionCommand();
			double res;

			if (num.equals("="))
			{
				double a = Double.parseDouble(aNum);
				double b = Double.parseDouble(txt.getText());
				res = Calc.calculate(a, b, op.charAt(0));
				txt.setText("" + res);
			}
			else if (num.equals("sqrt"))
			{
				res = Double.parseDouble(txt.getText());
				txt.setText("" + Calc.sqrt(res));
			}
			else if (num.equals("pow"))
			{
				res = Double.parseDouble(txt.getText());
				txt.setText("" + Calc.pow(res));
			}
			else if (num.equals("sin"))
			{
				res = Double.parseDouble(txt.getText());
				txt.setText("" + Calc.sin(res));
			}
			else if (num.equals("cos"))
			{
				res = Double.parseDouble(txt.getText());
				txt.setText("" + Calc.cos(res));
			}
			else if (num.equals("bin"))
			{
				res = Double.parseDouble(txt.getText());
				txt.setText("" + Calc.bin(res));
			}

			else
			{
				if (num.equals("mod"))
				{
					op = "%";
				}
				else if (num.equals("%"))
				{
					op = "#";
				}

				else
				{
					op = num;
				}
				aNum = txt.getText();
				txt.setText("");
			}
		}

	}

}
