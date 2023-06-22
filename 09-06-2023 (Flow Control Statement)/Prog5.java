public class Prog5 {
    public static void main(String[] args) {
        char c = '$';
        if(Character.isDigit(c)){
            System.out.print("Digit");
        }
        else if(Character.isLetter(c)){
            System.out.print("Alphabet");
        }
        else{
            System.out.print("Special Character");
        }
    }
}
