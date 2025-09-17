import java.util.Scanner;

public class ch4_arithemeticop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st num :");
        int a=input.nextInt();
        System.out.print("Enter 2nd num :");
        int b= input.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
