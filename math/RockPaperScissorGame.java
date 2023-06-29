package math;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int userChoice, computerChoice=(int)((Math.random()*3)+1);
        System.out.println("Enter your Choice:");
        System.out.println("1. for Rock");
        System.out.println("2. For Paper");
        System.out.println("3.For Scissors");

        String strComputerChoice=computerChoice==1?"Rock":computerChoice==2?"Paper":"Scissor";

        userChoice=sc.nextInt();
        if(userChoice==1)
        {

            if(computerChoice==1)
            {
                System.out.println("Match Draw try Again");
            }
            else if(computerChoice==2)
            {
              System.out.println("Computer Win");
            }
            else if(computerChoice==3)
            {
                System.out.println("User Win");
            }
        }
        else if(userChoice==2)
        {
            if(computerChoice==1){
                System.out.println("User win");
            }
            else if(computerChoice==2){
                System.out.println("Match draw Try again ");
            }
            else if(computerChoice==3)
            {
                System.out.println("Computer Win");
            }

        }
        else if(userChoice==3)
        {
            if(computerChoice==1)
            {
                System.out.println("Computer Win");
            }
            else if(computerChoice==2)
            {
                System.out.println("User Win");
            }
            else if(computerChoice==3)
            {
                System.out.println("Match draw");
            }
        }
        else
        {
            System.out.println("Invalid Choice Try Again");
        }

        System.out.println("Computer Choice is:"+strComputerChoice);


        
    }
}
