public class ternary {
	public static void main(String[] a1) {
		int a = Integer.parseInt(a1[0]);
		int b = Integer.parseInt(a1[1]);
		int c = Integer.parseInt(a1[2]);
		int ans = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
		System.out.println("Ans -> "+ans);
	}
}