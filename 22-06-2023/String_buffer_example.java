import java.util.*;
public class String_buffer_example
{
    public static void main(String[] args) {
        StringBuffer obj = new StringBuffer();
        obj.append("java");
        System.out.println("obj: "+obj);
        obj.append(" Python");
        System.out.println("obj: "+obj);
        Scanner sc = new Scanner(System.in);
        StringBuffer obj2 = new StringBuffer(sc.nextLine());
        System.out.println("obj2: "+obj2);
        obj2.append(" python ");
        System.out.println("obj2: "+obj2);
        obj.append(obj2);
        System.out.println("obj: "+obj);
        sc.close();
    }
}