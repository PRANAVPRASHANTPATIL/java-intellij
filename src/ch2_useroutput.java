import java.util.Scanner;

public class ch2_useroutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=input.nextLine();
        System.out.println("welcome to JAVA "+ name);
        System.out.println("enter num1");
        int num1=input.nextInt();
        System.out.println("enter num2");
        int num2=input.nextInt();
        int sum = num2+num1;
        System.out.print("The sum is : ");
        System.out.println(sum);
        System.out.print(num1+num2);


    }
}
