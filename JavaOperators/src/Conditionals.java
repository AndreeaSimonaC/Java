public class Conditionals {
    /*
    && - and: a && b
    || - or: a || b
    They evaluate condition as TRUE or FALSE -
    && is TRUE only if both expressions are TRUE
    && is FLASE if one or both expressions are FALSE
    || is TRUE if one or both expressions are TURE
    || is FALSE if both expressions are FALSE
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 8;

        System.out.println("&& - both true - " + ((a == 10) && (b == 8)));
        System.out.println("&& - a is true - " + ((a == 10) && (b == 10)));
        System.out.println("&& - b is true - " + ((a == 6) && (b == 8)));
        System.out.println("&& - both false - " + ((a == 3) && (b == 5)));

        System.out.println("|| - both true - " + ((a == 10) || (b == 8)));
        System.out.println("|| - a is true - " + ((a == 10) || (b == 10)));
        System.out.println("|| - b is true - " + ((a == 6) || (b == 8)));
        System.out.println("|| - both false - " + ((a == 3) || (b == 5)));

    }
}
