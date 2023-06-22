import java.util.Scanner;

public class Prog_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Max number: ");
        int n2 = sc.nextInt();
        for(int i=n1; i<=n2; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for (int j=2; j<=Math.sqrt(num); j++){
            if(num%j==0){
                return false;
            }
        }
        return true;
    }
}
