import java.util.Scanner;
public class Prog_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+ " is a Prime Number.");
        }
        else{
            System.out.println(n+ " is not a Prime Number.");
        }
        sc.close();
    }
}
