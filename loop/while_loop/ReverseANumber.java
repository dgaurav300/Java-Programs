package loop.while_loop;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 54321, rev=0 ;
        while (num!= 0){
            //extracting last digit
            int rem = num % 10;
            /* Multiply the reversed number by 10 and add
            current remainder */
            rev = rev * 10 + rem;
            //remove extracted digit from original number
            num /= 10;
        }

        System.out.println("Reverse Number is:"+rev);
    }
}
