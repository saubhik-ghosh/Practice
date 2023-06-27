import java.util.*;
public class String_buffer_insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer obj = new StringBuffer(sc.next());
        obj.insert(3,"NEW_STRING");
        System.out.println("obj: "+obj);
        obj.insert(5,"python");
        System.out.println("obj: "+obj);
        sc.close();
    }
}
