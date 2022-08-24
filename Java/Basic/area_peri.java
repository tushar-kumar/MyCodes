public class area_peri {
	public static void main(String[] a1) {
		float r = Float.parseFloat(a1[0]);
		float PI = 3.14f;
		float area = PI*r*r;
		float peri = 2*PI*r;
		System.out.println("Area -> "+area);
		System.out.println("Perimeter -> "+peri);
	}
}