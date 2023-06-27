import java.util.Scanner;
public class Next_Alphabet
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int nextChar = ch+1;
            if(Character.isLowerCase(ch) && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                nextChar = Character.toUpperCase(ch);
            }
            newStr += (char)nextChar;
        }
        System.out.println("The new String is: "+newStr);
        sc.close();
    }
}