import java.util.*;

class object_arr {
    int rollno;
    String name;

    void input(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + "  " + name);
    }

    public static void main(String[] a1) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(" Enter records of 3 students :");
        object_arr[] o1 = new object_arr[num];
        int i;
        for (i = 0; i < num; i++) {
            o1[i] = new object_arr();
        }
        for (i = 0; i < num; i++) {
            int r;
            String n;
            System.out.println(" Enter Rollno and Name of students number :" + i + 1);
            r = in.nextInt();
            n = in.next();
            o1[i].input(r, n);
        }
        System.out.println(" 3 Records are :");
        for (i = 0; i < num; i++) {
            o1[i].display();
        }

    }
}
