// import java.util.Scanner;

public class PracticeLab_Calc {
	public static void main(String[] a1) {
		System.out.println("Tushar Kumar \n Sap ID: 1000014268 ");
		// Scanner input = new Scanner(System.in);

		Double num1 = Double.parseDouble(a1[0]);
		Double num2 = Double.parseDouble(a1[2]);
		char operator = a1[1].charAt(0);
		Double result = 0.0;

		// Double num1,num2;
		// char operator;

		// System.out.println("Enter Choice + , -, / , *, % : ");
		// operator = input.next().charAt(0);

		// System.out.printf("Enter Number 1: ");
		// num1 = input.nextDouble();


		// System.out.printf("Enter Number 2: ");
		// num2 = input.nextDouble();

		switch (operator) {
			case '+':
				result = num1 + num2;
				break;

			case '-':
				result = num1 - num2;
				break;

			case '*':
				result = num1 * num2;
				break;

			case '/':
				result = num1 / num2;
				break;

			case '%':
				result = num1 % num2;
				break;

			default:
				break;
		}
		System.out.println("Ans -> "+num1 +" "+operator+" "+ num2 + " = " + result);
	}
}