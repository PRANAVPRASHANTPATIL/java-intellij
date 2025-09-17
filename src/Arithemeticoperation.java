public class Arithemeticoperation {
    public static void main(String[] args) {
        int a=10;
        int b=3;

        int sum= a+b;
        int sub= a-b;
        int mul= a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
    }
}
/*
*   a / b  → quotient (whole number part if integers)
    a % b  → remainder
    System.out.println(10 / 3);   // 3 (integer division, decimal part removed)
    System.out.println(10.0 / 3); // 3.333... (floating-point division)
    System.out.println(10 % 3); // 1 (because 10 = 3*3 + 1)
    System.out.println(14 % 5); // 4 (because 14 = 5*2 + 4)
    System.out.println(6 % 2);  // 0 (because 6 is exactly divisible by 2)


* */