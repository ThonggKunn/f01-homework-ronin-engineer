import java.math.BigDecimal;
import java.math.BigInteger;

public class homework_9 {

    static class homework2 {
        static class Fraction {

            int Numerator;
            int Denominator;

            Fraction (int Numerator, int Denominator) {
                this.Numerator = Numerator;
                this.Denominator = Denominator;
            }

            static int findGCD(int a, int b) {

                if (b == 0) {
                    return a;
                }

                return findGCD(b, a % b);
            }

            public void abbreviated() {
                int gcd = findGCD(Numerator, Denominator);
                Numerator = Numerator / gcd;
                Denominator = Denominator / gcd;
                System.out.println(Numerator + "/" + Denominator);
            }

            public String toString() {
                return Numerator + "/" + Denominator;
            }

            public Fraction addFraction (Fraction otherFraction) {
                int newNumerator = Numerator * otherFraction.Denominator + otherFraction.Numerator * Denominator;
                int newDenominator = Denominator * otherFraction.Denominator;
                return new Fraction(newNumerator, newDenominator);
            }

            public Fraction subtractFraction(Fraction otherFraction) {
                int newNumerator = Numerator * otherFraction.Denominator - otherFraction.Numerator * Denominator;
                int newDenominator = Denominator * otherFraction.Denominator;
                return new Fraction(newNumerator, newDenominator);
            }

            public Fraction multiplyFraction (Fraction otherFraction) {
                int newNumerator = Numerator * otherFraction.Numerator;
                int newDenominator = Denominator * otherFraction.Denominator;
                return new Fraction(newNumerator, newDenominator);
            }

            public Fraction devideFraction (Fraction otherFraction) {
                int newNumerator = Numerator * otherFraction.Denominator;
                int newDenominator = Denominator * otherFraction.Numerator;
                return new Fraction(newNumerator, newDenominator);
            }
        }

        public static void main(String[] args) {

            Fraction fraction = new Fraction(2, 4);
            Fraction fraction1 = new Fraction(4, 5);
            fraction.abbreviated();
            System.out.println(fraction.addFraction(fraction1));
            System.out.println(fraction.subtractFraction(fraction1));
            System.out.println(fraction.multiplyFraction(fraction));
            System.out.println(fraction.devideFraction(fraction));
        }
    }

    static class homework3 {
        public static void main(String[] args) {
            Integer a = Integer.valueOf(123);
            int b = a.intValue();
            System.out.println("Giá trị Integer: " + a + ", Giá trị int: " + b);

            String s = "123";
            int c = Integer.parseInt(s);
            System.out.println("Chuỗi \"123\" thành số nguyên: " + c);

            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("abc");
            System.out.println("String " + stringbuilder.toString());

            BigInteger A,B;
            A = BigInteger.valueOf(123);
            B = BigInteger.valueOf(456);
            BigInteger C = A.add(B);
            System.out.println(A + " + " + B + " = " + C);

            BigDecimal bd1 = new BigDecimal("1.23");
            BigDecimal bd2 = new BigDecimal("4.56");
            bd1 = bd1.add(bd2);
            bd2 = bd2.multiply(bd1);
            System.out.println(bd1 + " & " + bd2);
        }
    }
}
