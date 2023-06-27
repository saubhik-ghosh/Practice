import java.util.*;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1+n2;
        System.out.println("The sum of "+n1+" and "+n2+" is "+sum);
        sc.close();
    }
}
