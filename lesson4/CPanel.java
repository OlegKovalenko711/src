package lesson4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CPanel extends JPanel
{

	public CPanel()
	{
		setLayout(null);
		JTextField data = new JTextField();
		data.setBounds(10, 10, 320, 20);
		add(data);
		JButton zero = new JButton("0");
		add(zero);
		zero.setBounds(10, 60, 60, 30);
		JButton one = new JButton("1");
		add(one);
		one.setBounds(80, 60, 60, 30);
		JButton two = new JButton("2");
		add(two);
		two.setBounds(150, 60, 60, 30);
		JButton three = new JButton("3");
		add(three);
		three.setBounds(220, 60, 60, 30);
		JButton four = new JButton("4");
		add(four);
		four.setBounds(10, 100, 60, 30);
		JButton five = new JButton("5");
		add(five);
		five.setBounds(80, 100, 60, 30);
		JButton six = new JButton("6");
		add(six);
		six.setBounds(150, 100, 60, 30);
		JButton seven = new JButton("7");
		add(seven);
		seven.setBounds(220, 100, 60, 30);
		JButton eight = new JButton("8");
		add(eight);
		eight.setBounds(10, 140, 60, 30);
		JButton nine = new JButton("9");
		add(nine);
		nine.setBounds(80, 140, 60, 30);

		JButton point = new JButton(".");
		add(point);
		point.setBounds(150, 140, 60, 30);

		JButton plus = new JButton("+");
		add(plus);
		plus.setBounds(320, 60, 60, 20);

		JButton minus = new JButton("-");
		add(minus);
		minus.setBounds(320, 90, 60, 20);

		JButton mul = new JButton("*");
		add(mul);
		mul.setBounds(320, 120, 60, 20);

		JButton div = new JButton("/");
		add(div);
		div.setBounds(320, 150, 60, 20);

		JButton ravno = new JButton("=");
		add(ravno);
		ravno.setBounds(320, 180, 60, 20);

		JButton clear = new JButton("C");
		add(clear);
		clear.setBounds(320, 210, 60, 20);

		point.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + ".");

			}
		});

		clear.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText("");

			}
		});

		zero.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "0");

			}
		});

		one.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "1");

			}
		});

		two.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "2");

			}
		});

		three.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "3");

			}
		});

		four.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "4");

			}
		});

		five.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "5");

			}
		});

		six.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "6");
			}
		});

		seven.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "7");

			}
		});

		eight.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "9");

			}
		});

		nine.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "2");

			}
		});

		plus.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "+");

			}
		});

		minus.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "-");

			}
		});
		mul.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "*");
			}
		});

		div.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				data.setText(data.getText() + "/");
			}
		});

		ravno.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (data.getText().indexOf("+") > 0)
				{
					double a = Double.parseDouble(data.getText().substring(0, data.getText().indexOf("+")));
					double b = Double.parseDouble(data.getText().substring(data.getText().indexOf("+") + 1));
					data.setText("" + (a + b));
				}

				if (data.getText().indexOf("-") > 0)
				{
					double a = Double.parseDouble(data.getText().substring(0, data.getText().indexOf("-")));
					double b = Double.parseDouble(data.getText().substring(data.getText().indexOf("-") + 1));
					data.setText("" + (a - b));
				}

				if (data.getText().indexOf("*") > 0)
				{
					double a = Double.parseDouble(data.getText().substring(0, data.getText().indexOf("*")));
					double b = Double.parseDouble(data.getText().substring(data.getText().indexOf("*") + 1));
					data.setText("" + (a * b));
				}

				if (data.getText().indexOf("/") > 0)
				{
					double a = Double.parseDouble(data.getText().substring(0, data.getText().indexOf("/")));
					double b = Double.parseDouble(data.getText().substring(data.getText().indexOf("/") + 1));
					if (b == 0)
					{
						JOptionPane.showMessageDialog(null, "Попытка деления на ноль");
						data.setText("");
					}
					else
					{
						data.setText("" + (a / b));

					}
				}
				if (data.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Поле пустое");
				}

				if (data.getText().indexOf("+") == 0 || data.getText().indexOf("-") == 0
						|| data.getText().indexOf("*") == 0 || data.getText().indexOf("/") == 0
						|| data.getText().indexOf(".") == 0)
				{
					JOptionPane.showMessageDialog(null, "Не корректный ввод");
					data.setText("");
				}
			}
		});

	}

}
