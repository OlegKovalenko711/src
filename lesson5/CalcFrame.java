package lesson5;

import javax.swing.JFrame;

public class CalcFrame extends JFrame
{

	public CalcFrame()
	{
		setTitle("Calculator V_2");
		setBounds(600, 200, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new CalcPanel());
		setVisible(true);
	}

}
