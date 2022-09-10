
    public class Interest3 {

        public static void main(String[] args) {
            double principal;
            double rate;

            TextIO.put("Enter the initial investment: ");
            principal = TextIO.getlnDouble();
            TextIO.put("Enter the annual interest rate: ");
            rate = TextIO.getlnDouble();
            /* Simulate the investment for 5 years. */
            int years;

            years = 0;
            while (years < 5) {
                double interest; // Interest for this year.
                interest = principal * rate;
                principal = principal + interest;

                years = years + 1;

                System.out.print("The value of the investment after ");
                System.out.print(years);
                System.out.print(" years is $");
                System.out.printf("%1.2f", principal);
                System.out.println();
            }
        }
    }

