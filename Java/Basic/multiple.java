interface A{
    void show();
}

interface B{
    void disp();
}

class C implements A{
    public void show(){
        System.out.println("Interface A");
    }
    public void disp(){
        System.out.println("Interface B");
    }
}

class D extends C{
    void disp1(){
        System.out.println("Class D");
    }
}

public class multiple {
    public static void main(String[] args) {
        D ob = new D();
        ob.disp();
        ob.show();
        ob.disp1();
    }
}
