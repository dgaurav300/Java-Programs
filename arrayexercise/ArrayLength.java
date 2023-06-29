package arrayexercise;
public class ArrayLength {
    public static void main(String[] args) {
        int arr[][]={{46,65,12,89},{120,29,53}};
        int row=arr.length;
        System.out.println("Number of Row:"+row);

        //System.out.println(arr[0].length);
        //System.out.println(arr[1].length);
        for(int e[]:arr)
        {
            System.out.println(e.length);
        }
        //printing 2d Array
        int numberOfElements=0;
        for (int i = 0; i < arr.length; i++) {
            numberOfElements+=arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Number of Elements:"+numberOfElements);
    }
}
