import java.util.*;

public class Prog_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.print("Enter the elements of the array: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double average = sum/n; 
        System.out.print("The sum of the array is -> "+ sum + "\n");
        System.out.print("The average of the array is -> "+ average);
        sc.close();
    }
}