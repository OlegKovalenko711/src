package Convertor_Lesson1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CPanel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CPanel()
	{
		setLayout(null);
		JLabel lbl1 = new JLabel("�����: ");
		lbl1.setBounds(10, 10, 60, 20);
		add(lbl1);

		JLabel lbl2 = new JLabel("���������: ");
		lbl2.setBounds(10, 40, 80, 20);
		add(lbl2);

		JTextField txt1 = new JTextField();
		txt1.setBounds(100, 10, 250, 20);
		add(txt1);

		JTextField txt2 = new JTextField();
		txt2.setBounds(100, 40, 250, 20);
		add(txt2);

		JButton btn = new JButton("��� ��");
		btn.setBounds(100, 70, 80, 20);
		add(btn);

		JButton btn1 = new JButton("���� ��");
		btn1.setBounds(200, 70, 80, 20);
		add(btn1);

		JLabel lbl3 = new JLabel("����� ����� �� 0 �� 999 � ��� ��");
		lbl3.setBounds(100, 120, 250, 20);
		add(lbl3);

		btn.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{

				int a = Integer.parseInt(txt1.getText());
				if (a < 0 || a > 999)
				{
					JOptionPane.showMessageDialog(null, "�������� ������� �� ����� ������������");
					txt1.setText("");
				}
				else
				{
					txt2.setText(Convertor.convertNumToString(a));
				}
			}
		});

		btn1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				txt1.setText("");
				txt2.setText("");
			}
		});

	}
}