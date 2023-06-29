import java.util.Scanner;
public class CheckContantOrVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char alphabet=sc.next().toLowerCase().charAt(0);
        if(alphabet>=97 && alphabet<=122)
        {
           switch(alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Vowel");
             break;
            default:
             System.out.println("Consonants");
           }
        }
        else {
            System.out.println("Invalid Alphabet");
        }
    }
}
