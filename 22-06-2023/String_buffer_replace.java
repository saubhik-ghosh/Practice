
public class String_buffer_replace {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("Apple");
        System.out.println("s: "+s);
        s.replace(1, 3,"mango");
        System.out.println("s: "+s);
    }
}
