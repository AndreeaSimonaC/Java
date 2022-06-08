public class Arithmetics {
    /*
    ' + ' : adding/also concatenates a message or a value in a println
    ' - ' : subtracting
    ' * ' : multiplying
    ' / ' : div - returns the result of a division (remainder doesn't matter)
    ' % ' : mod/modulo - returns the remainder of a division
     */
    public static void main(String[] args) {

        int sum = 6 + 17;
        System.out.println("The sum is " + sum);

        int difference = 17 - 6;
        System.out.println("The difference is " + difference);

        int multiplication = 17 * 6;
        System.out.println("The multiplication is " + multiplication);

        int mod = 17 % 6;
        System.out.println("The 'whole' result of the division is " + mod);

        int div = 17 / 6;
        System.out.println("The remainder of the division is " + div);
    }
}
