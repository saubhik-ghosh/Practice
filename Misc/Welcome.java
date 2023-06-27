import java.util.*;
public class Welcome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String s1 = sc.nextLine();
        System.out.println("Welcome "+s1);
        sc.close();
    }
}