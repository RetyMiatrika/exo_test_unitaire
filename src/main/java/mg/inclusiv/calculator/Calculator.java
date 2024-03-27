package mg.inclusiv.calculator;

public class Calculator {

    //Fonctionnalité addition de deux entiers
    public static long addition ( long number1, long number2){
        return (number1 + number2);
    }

    //Fonctionnalité soustraction de deux entiers
    public static long substraction (long number1, long number2) {
        return (number1 - number2);
    }
    //Fonctionnalité multiplication de deux entiers
    public static long multiplication (long number1, long number2){
        return (number1 * number2);
    }
    //Fonctionnalité division de deux entiers

    public static Double division (double dividend, double divisor) {

        if (divisor == 0) {
            throw new IllegalArgumentException("Le diviseur ne peut être zéro");

        } else {
            return dividend / divisor;
        }

    }
}
