public class Orderofoperation {
    public static void main(String[] args) {
        int result = 10 + 2 * 3;
        System.out.println(result); // 16, because * is done before +

        int result2 = (10 + 2) * 3;
        System.out.println(result2); // 36, because () is done first

        int result3 = 20 - 10 / 2 * 3;
        // Step 1: 10 / 2 = 5
        // Step 2: 5 * 3 = 15
        // Step 3: 20 - 15 = 5
        System.out.println(result3); // 5

    }
}
/*
BODMAS Rule in Java

B → Brackets ()

O → Orders (powers/exponents, though Java doesn’t have ^, we use Math.pow())

D → Division /

M → Multiplication *

A → Addition +

S → Subtraction -

* */