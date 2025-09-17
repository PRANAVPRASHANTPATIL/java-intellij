import java.util.Scanner;

public class ch8_calsimpleinterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of P :");
        int p =input.nextInt();
        System.out.print("Enter the value of T :");
        int t =input.nextInt();
        System.out.print("Enter the value of R :");
        int r =input.nextInt();
        int simple_interast=(p*t*r)/100;
        System.out.println("The simple interast is :"+simple_interast);

    }
}
