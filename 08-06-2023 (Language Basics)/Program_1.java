//Write a program that accepts two Strings as commandline arguments and generate the output in the required format
import java.util.*;
public class Program_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(s1 + " technologies " + s2);
        sc.close();
    }
}