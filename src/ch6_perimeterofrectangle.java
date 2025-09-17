import java.util.Scanner;

public class ch6_perimeterofrectangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the length of rectangle :");
        int a= input.nextInt();
        a *=2;
        System.out.print("Enter the breadth of rectangle :");
        int b = input.nextInt();
        b*=2;
        System.out.print("The perimeter is :"+(a+b));


    }
}
