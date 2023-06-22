import java.util.Scanner;

public class Prog_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int ori = num;
        int revnum = 0;
        while(num>0){
            int digit = num%10;
            revnum = revnum * 10 + digit;
            num /= 10;
        }
        boolean isPalindrome = ori == revnum;
        if (isPalindrome) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
}
