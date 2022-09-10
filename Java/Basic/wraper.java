import java.util.ArrayList;
import java.util.Scanner;

class wraper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        ArrayList <Integer> a1 = new ArrayList<>();
        for (int i = 0; i < n; i++) 
            a1.add(sc.nextInt());
        
            int max = a1.get(0);
            for (int i = 0; i < a1.size(); i++) {
                if (max<a1.get(i))
                    max=a1.get(i);
            }
            System.out.println("MAX = "+max);
    }
}