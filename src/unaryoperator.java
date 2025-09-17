public class unaryoperator {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(+a);   // 5
        System.out.println(-a);   // -5
        System.out.println(++a);  // 6
        System.out.println(a++);  // 6 (then a becomes 7)
        System.out.println(--a);  // 6
        System.out.println(a--);  // 6 (then a becomes 5)

        boolean flag = false;
        System.out.println(!flag); // true
    }
}
/*
| **Operator**       | **Description**                                                | **Example** |
| ------------------ | -------------------------------------------------------------- | ----------- |
| `-` (Unary Minus)  | Converts a positive value to a negative                        | `x = -y`    |
| **Pre Increment**  | Increments the value by 1 **before** using it in the statement | `x = ++y`   |
| **Pre Decrement**  | Decrements the value by 1 **before** using it in the statement | `x = --y`   |
| **Post Increment** | Uses the current value in the statement, then increments by 1  | `x = y++`   |
| **Post Decrement** | Uses the current value in the statement, then decrements by 1  | `x = y--`   |

*/