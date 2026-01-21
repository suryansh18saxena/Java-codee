package Loops;

public class HCF {
    public static void main(String[] args) {
        int num1 = 12; // First number
        int num2 = 15; // Second number

        int hcf = (num1 < num2) ? num1 : num2;

        while (hcf > 0) {
            if (num1 % hcf == 0 && num2 % hcf == 0) {
                System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
                break;
            }
            hcf--;
        }
    }
}