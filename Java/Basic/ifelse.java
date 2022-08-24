import java.util.Scanner;

public class ifelse {
	public static void main(String[] a1) {
		int i = 0;
		while(true)
		{
			void = (i == 0) ? (System.out.println("Try: ")) : (System.out.println("Try again: "));
			Scanner in = new Scanner(System.in);
			i = in.nextInt();
			// int i = Integer.parseInt[in];
			if (i == 5)
				break;
			System.out.println(i);
			i++;
		}
	}
}