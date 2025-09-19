import java.util.Scanner;

public class Arraysearch {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the num :");
        int num = input.nextInt();
        int[] arr={3,4,5,6,7,8,1,2,0};
        boolean isfound=isfound(arr, num);
        if(isfound){
            System.out.println("num is found");
        }
        else {
            System.out.println("num is not found");
        }


//        int index=0;
//        while(index<arr.length){
//            if (arr[index]!=num)
//            {
//                System.out.println("num is not in array");
//                index++;
//            }
//            else {
//                System.out.println("the num is in the array ");
//            }
//        }
    }
    public static boolean isfound(int[]arr,int num)
    {
        int index=0;
        while(index< arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }

        return false;
    }

}
