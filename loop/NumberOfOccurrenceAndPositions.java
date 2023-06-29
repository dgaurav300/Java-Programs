package loop;
public class NumberOfOccurrenceAndPositions {
    public static void main(String[] args) {
        int numbers[]={56,90,97,34,78,23,20,90};
        int n=35;
        int occurrence=0;
        String indexes="";

        for(int i=0;i<numbers.length;i++)
        {
            if(n==numbers[i])
             {
                occurrence++;
                indexes+=i+" ";
             }
        }
        System.out.println("Number of Occurrences :"+occurrence);
        System.out.println("Positions:"+indexes);
    }
}
