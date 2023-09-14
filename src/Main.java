public class Main {
    public static void main(String[] args) {
        int intOperandA = 465;
        int intOperandB = 48;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 48.698;
        double doubleOperandB = 69.98;
        double doubleSum;
        double doubleDifference;
        double doubleProduct;
        double doubleQuotient;
        double doubleModulo;

        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum of " + intOperandA + " and " + intOperandB  + " is " + intSum);
        System.out.println("The difference between " + intOperandA + " and " + intOperandB  + " is " + intDifference);
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println(intOperandA + " modulus " + intOperandB + " is " + intModulo);
        System.out.println();

        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB  + " is " + doubleSum);
        System.out.println("The difference between " + doubleOperandA + " and " + doubleOperandB  + " is " + doubleDifference);
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println(doubleOperandA + " modulus " + doubleOperandB + " is " + doubleModulo);
    }
}