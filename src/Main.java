public class Main {

    public static void main(String[] args) {
        Fraction fraction = new Fraction(1.5, 0.5);

        System.out.println(fraction.addition(fraction.getA(), fraction.getB()));
        System.out.println(fraction.subtraction(fraction.getA(), fraction.getB()));
        System.out.println(fraction.multiplication(fraction.getA(), fraction.getB()));
        System.out.println(fraction.division(fraction.getA(), fraction.getB()));

        System.out.println();

        Fraction fraction1 = new Fraction();
        fraction1.setA(35.62);
        fraction1.setB(65.11);

        System.out.println(fraction1.addition(fraction1.getA(), fraction1.getB()));
        System.out.println(fraction1.subtraction(fraction1.getA(), fraction1.getB()));
        System.out.println(fraction1.multiplication(fraction1.getA(), fraction1.getB()));
        System.out.println(fraction1.division(fraction1.getA(), fraction1.getB()));
    }
}
