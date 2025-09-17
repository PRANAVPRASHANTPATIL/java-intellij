import java.util.Scanner;

public class ch7_Areaoftriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        System.out.print("Enter the breadth: ");
        double breadth = input.nextDouble();

        double area = 0.5 * height * breadth;
        System.out.println("The area of triangle is: " + area);

        input.close();
    }
}
