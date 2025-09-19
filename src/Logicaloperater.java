public class Logicaloperater {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b : " + (a && b)); // false
        System.out.println("a || b : " + (a || b)); // true
        System.out.println("!a     : " + (!a));     // false
    }
}
/*
| Operator | Meaning     | Example (`a=true, b=false`) | Result |
| -------- | ----------- | --------------------------- | ------ |
| `&&`     | Logical AND | `a && b`                    | false  |
| `\|\|`   | Logical OR  | `a \|\| b`                  | true   |
| `!`      | Logical NOT | `!a`                        | false  |


AND (&&)
| a | b | a && b |
|-------|-------|---------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

OR (\|\|)
| a | b | a || b |
|-------|-------|-----------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

NOT (!)
| a | !a |
|-------|-------|
| true | false |
| false | true |
 */