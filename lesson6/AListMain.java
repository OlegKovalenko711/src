package lesson6;

public class AListMain
{

	public static void main(String[] args)
	{
		AList al = new AList();
		int[] tmp = { 1, 2, 9, 3, 6 };
		al.init(tmp);
		al.set(4,4);
		System.out.println(al.get(2));

//		al.delPos(2);
		System.out.println(al);
	}

}
