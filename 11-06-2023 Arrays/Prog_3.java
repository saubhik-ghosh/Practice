import java.util.Scanner;

public class Prog_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            //System.out.print(arr[i]+" ");
        }
        System.out.print("Enter the target number: ");
        int t = sc.nextInt();
        int ind = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == t){
                ind = i;
                break;
            }
        }
        if(ind==-1)
        {
            System.out.println("-1");
        }
        else{
            System.out.println("Number found at Index-> "+ind);
        }
        sc.close();
    }
}
