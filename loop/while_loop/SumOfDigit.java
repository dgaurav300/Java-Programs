package loop.while_loop;

public class SumOfDigit
{
    public static void main(String[] args) {

        int number=68687,sum=0;
        //6+8+6+8+7=35
        int temp=number;
        while(temp>0)
        {
        int rem=temp%10;
        sum+=rem;
        temp/=10;
        }
        System.out.printf("The sum of digit of %d is %d",number,sum);		
	}
}
