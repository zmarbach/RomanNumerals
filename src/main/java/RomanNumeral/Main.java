package RomanNumeral;

import java.util.Scanner;


public class Main {
    private static Validity v = new Validity();
    private static Scanner s = new Scanner(System.in);
    private static Generator g = new Generator();

    public Main(Validity v, Scanner s, Generator g) {
        this.v = v;
        this.s = s;
        this.g = g;
    }

    public static void main(String[] args) {
        System.out.println("Type any number between 1 and 1,000,000 and I will give you the equivalent Roman Numeral.");

        boolean loop = true;
        while(loop) {
            System.out.print(">");
            var input = s.nextLine().trim().replaceAll(",", "");
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye");
                loop = false;
            }
            try {
                Integer numToConvert = Integer.parseInt(input);
                if (v.checkValidity(numToConvert) == false) {
                    System.out.println("Please enter a valid number between 1 and 1,000,000.");
                } else {
                    g.generateRomanNumeral(numToConvert);
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number between 1 and 1,000,000");
            }

        }

    }


}
