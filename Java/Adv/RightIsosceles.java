interface Triangle {
    double area();

    double perimeter();
}

abstract class Isosceles {
    private double longSide, equalSide;

    public double perimeter() {
        return longSide + 2 * equalSide;
    }

    public void setsides(double ls, double es) {
        longSide = ls;
        equalSide = es;
    }

    public double getLongside() {
        return longSide;
    }

    public double getEqualSide() {
        return equalSide;
    }
}

interface Right extends Triangle {
    double[] angles();
}

public class RightIsosceles extends Isosceles implements Right {
    public double area() {
        return getEqualSide() * getLongside() * 0.5;
    }

    public double[] angles() {
        double angle[] = { 85, 30, 65 };
        return angle;
    }

    public static void main(String[] args) {
        RightIsosceles r1 = new RightIsosceles();
        r1.setsides(22, 12);
        System.out.println("Area = "+ r1.area());
        System.out.println("Perimeter = "+ r1.perimeter());
        double[] angles = r1.angles();
        System.out.println("Angels: ");
        for (double element : angles) {
            System.out.println(element);
        }
    }
}