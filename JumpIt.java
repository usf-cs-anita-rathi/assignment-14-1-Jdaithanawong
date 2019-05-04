import java.util.ArrayList;
import java.util.Random;

public class JumpIt {
	public static String JumpIt(ArrayList<Integer> a, int n) {
		if (a.get(n - 1) == 0) 
		{
			return "";
		} else if (n >  3) 
		{
			if (a.get(1) < a.get(2))
			{
				int b = a.get(1);
				a.remove(0);
				a.set(0, 0);
				return " to " + b + JumpIt(a, a.size());

			} else if (a.get(2) < a.get(1)) 
			{
				int b = a.get(2);
				a.remove(0);
				a.remove(0);
				a.set(0, 0);
				return " to " + b + JumpIt(a, a.size());
			} else
			{
				return "";
			}
		} else 
		{
			return " to the end.";

		}

	}

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(rand.nextInt(100));
		a.add(rand.nextInt(100));
		a.add(rand.nextInt(100));
		a.add(rand.nextInt(100));
		a.add(rand.nextInt(100));
		System.out.println("The randomly generate array Array contains: ");
		System.out.println(a.get(0) + " " + a.get(1) + " " + a.get(2) + " " + a.get(3) + " "
				+ a.get(4) + " " + a.get(5));
		System.out.println("The cheapest path is to jump from the beginning" + JumpIt(a, a.size()));

	}
}
