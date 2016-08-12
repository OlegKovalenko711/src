package lesson1;

public class Maths
{

	public double math_1_grad()
	{
		double curveRad = 1;
		double speedKmHour = 20;
		double speedMSec = speedKmHour / 3.6;
		double result = speedMSec * speedMSec * Math.sin(2 * curveRad) / 9.8;

		return result;
	}

	public double math_1_rad()
	{
		double curveGrad = 30;

		double curveGradtoRad = Math.PI * curveGrad / 180;
		double speedKmHour = 20;

		double speedMSec = speedKmHour / 3.6;

		double result = speedMSec * speedMSec * Math.sin(2 * curveGradtoRad) / 9.8;

		return result;
	}

	public int math_2()
	{
		int distance = 3;
		int car1Speed = 60;
		int car2Speed = 90;
		int timeHour = 2;

		if (car1Speed >= car2Speed)
		{
			distance = (car1Speed - car2Speed) * timeHour + distance;
		}
		if (car1Speed < car2Speed)
		{
			distance = (car2Speed - car1Speed) * timeHour + distance;
		}

		return distance;
	}

	public static double math_3()
	{
		double x = 2;
		double y = 1;
		int res = 0;

		
		res = (y >= (1.5 * x - 1) && y >= (-1.5 * x - 1)) ? ( (y <= 0) || ( y > 0 && (y >= x || y <= -x)) ? 1 : 0 ) : 0;
		
//		if (y >= (1.5 * x - 1) && y >= (-1.5 * x - 1))
//		{
//			if (y > 0)
//			{
//				if (y <= x || y <= -x)
//				{
//					res = 0;
//				}
//			}
//			else
//			{
//				res = 1;
//			}
//		}
		return res;
	}

	public double math_4()
	{
		double x = 4D;
		double z = 0D;

		z = 6 * Math.log(Math.sqrt(Math.exp(x + 1) + 2 * Math.exp(x) * Math.cos(x)))
				/ Math.log(x - Math.exp(x + 3) * Math.sin(x)) + Math.abs(Math.cos(x) / Math.exp(Math.sin(x)));

		return z;
	}

	public static void main(String[] args)
	{
		System.out.println(Maths.math_3());
	}
}
