import javax.print.event.PrintJobListener;

public class StringBuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        // sb.append("Hello ");
        System.out.println(sb.capacity());

        sb.append("Java is an a good lang");
        System.out.println(sb.capacity());

        sb.reverse();
        System.out.println(sb);

    }
}
