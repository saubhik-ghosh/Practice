import java.util.Scanner;
public class Prog1_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        boolean lastdigit = checkLastDigit(n1, n2);
        System.out.println("The two numbers have same last digit: "+ lastdigit); 
        sc.close();
    }
    public static boolean checkLastDigit(int num1, int num2){
        int lastdigit1 = num1%10;
        int lastdigit2 = num2%10;
        return lastdigit1==lastdigit2;
    }
}
