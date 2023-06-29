public class NestedIf {
    public static void main(String[] args) {
        int age=58;
        float weight=60.56f;
        if(age>=50)
        {
            System.out.println("Age condition Matched");
            if(weight>=58)
            {
                System.out.println("Weight condition Matched");
            }
        }
    }
}
