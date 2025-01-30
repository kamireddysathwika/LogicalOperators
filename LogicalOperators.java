public class LogicalOperators{

    public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean x = true;
        boolean y = false;

        // Demonstrate the use of logical operators
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Logical AND (&&) operator
        System.out.println("x && y: " + (x && y));  // false, because y is false

        // Logical OR (||) operator
        System.out.println("x == y: " + (x || y));  // true, because x is true

        // Logical NOT (!) operator
        System.out.println("!x: " + !x);  // false, because x is true
        System.out.println("!y: " + !y);  // true, because y is false
    }
}
 
