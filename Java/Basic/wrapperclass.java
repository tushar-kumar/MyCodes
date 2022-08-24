
import java.util.ArrayList;

class wrapperclass {

    static void wrapperclass(){
        System.out.println("This is for fun");
    }
    public static void main(String[] args) {
        char ch = 'a';

        // Autoboxing- primitive to Character object conversion
        Character a = ch;

        ch = 'b';

        // unboxing - Character object to primitive conversion
        char b = a;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);

        // unboxing because get method returns an Integer object
        int num = arrayList.get(0);

        // printing the values from object
        System.out.println(num);
        System.out.println(b);

        wrapperclass();
    }
}