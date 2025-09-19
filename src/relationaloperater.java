public class relationaloperater {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
    }
}
/*

| Operator | Meaning                  | Example (`a=5, b=10`) | Result |
| -------- | ------------------------ | --------------------- | ------ |
| `==`     | Equal to                 | `a == b`              | false  |
| `!=`     | Not equal to             | `a != b`              | true   |
| `>`      | Greater than             | `a > b`               | false  |
| `<`      | Less than                | `a < b`               | true   |
| `>=`     | Greater than or equal to | `a >= b`              | false  |
| `<=`     | Less than or equal to    | `a <= b`              | true   |

 */