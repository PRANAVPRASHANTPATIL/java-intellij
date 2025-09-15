public class TypeConversion {
    public static void main(String[] args) {
        float myFloat =5;
        System.out.println(myFloat);

        int myInt = (int) 5.89f;
        System.out.println(myInt);

    }
}
/*
automatic type conversion --widening -implicit
left to right
byte-->short-->int-->long-->float-->double
also known as Coercion

narrowing type conversion --explicit
byte<--short<--int<--long<--float<--double
also known as Casting
*/