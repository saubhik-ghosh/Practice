public class String_buffer_delete {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("Java Prog");
        System.out.println("s: "+s);
        s.delete(1, 4);
        System.out.println("s: "+s);
    }
}
