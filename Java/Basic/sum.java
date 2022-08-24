public class sum {
    public static void main(String[] a1) {
      int num = Integer.parseInt(a1[0]);
      int sum=0;
      int n = num;
      int r = num%10;
      sum = sum+r;
      num = num/10;

      r = num%10;
      sum = sum+r;
      num = num/10;
      
      r = num%10;
      sum = sum+r;
      num = num/10;

      System.out.println("Sum = "+sum);

    }
}