import java.util.*;
public class Prog_14 {
    public static int Sum(int num){
        int sum=0;
        while(num!=0){
            int digit = num%10;
            sum += digit;
            num/=10;
        }
        return sum;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = Sum(n);
        System.out.print("The sum of all the digits of the number is: "+sum);
        sc.close();
    }
}
