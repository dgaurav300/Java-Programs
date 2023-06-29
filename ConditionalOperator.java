public class ConditionalOperator {
    public static void main(String[] args) {
        int number=6;

        String result=(number%2==0)?"Even":"Odd";

        String result2=(number%2==0)?"Divisible by 2":(number%3==0)?"Divible by 3":"Not divisible";

        System.out.println(result);
        System.out.println(result2);
    }
}
