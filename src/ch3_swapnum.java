import java.util.Scanner;

public class ch3_swapnum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("num1 is :");
        int a= input.nextInt();
        System.out.print("num2 is :");
        int b=input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("now num1 is :"+a);
        System.out.println("now num2 is :"+b);



    }
}
