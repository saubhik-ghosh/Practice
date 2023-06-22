import java.util.*;

public class Prog_2 
{
    public int max(int[] array){
        int max = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public int min(int[] array){
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<min) {
                min = array[i];
            }    
        }
        return min; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Prog_2 m = new Prog_2();
        System.out.println("Maximum value of the array is: "+ m.max(arr));
        System.out.println("Minimum value of the array is: "+ m.min(arr));
        sc.close();            
    }
}