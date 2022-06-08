public class Unary {
    /*
    + or - and they require one operand
        They can: increment/decrement a value by one ( +1 or -1 )
                  negate an expression
                  invert a value of a boolean (if it's true it returns false and vice-versa)
     */
    public static void main(String[] args) {
        int number = +16;
        System.out.println("The value is " + number);
        number = -8;
        System.out.println("The value is " + number);
        number = -number;
        System.out.println("The value is " + number);
        number++;
        System.out.println("The value is " + number);

        boolean notOperator = false;
        notOperator = !notOperator;
        System.out.println("The value is " + notOperator);


        /*
        They can be pre-fixated: -/+number or post-fixated number-/+
         */
        int numberTwo = 1;

        System.out.println(numberTwo++); //It prepares +1 for the next line
        System.out.println(numberTwo);
        System.out.println(++numberTwo); //It adds +1

        int numberThree = 5;
        System.out.println(numberThree--); //It prepares -1 for the next line
        System.out.println(numberThree);
        System.out.println(--numberThree); //It subtracts -1
    }

}
