import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter ur Name : ");
        String name = input.nextLine();
        System.out.print("enter age :");
        int age = input.nextInt();
        System.out.println("good morning "+name);
        System.out.println("age is :"+age);
    }
}
/*
*   int = nextInt()
*   Double = nextDouble()
*   Float = nextFloat()
*   long = nextLong()
*
* */