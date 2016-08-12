package lesson4;

import javax.swing.JFrame;

public class CFrame extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CFrame()
	{
		setTitle("Калькулятор");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		add(new CPanel());
		setVisible(true);
	}

}
