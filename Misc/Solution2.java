import java.util.*;
public class Solution2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double doub = scan.nextDouble();
        scan.nextLine();
        String s1 = scan.nextLine();
        System.out.println("String: "+s1);
        System.out.println("Double: "+doub);
        System.out.println("Int: "+num);
        scan.close();
    }
}
