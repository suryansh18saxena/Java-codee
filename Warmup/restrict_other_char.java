import java.util.Scanner;

public class restrict_other_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("You entered the integer: " + num);
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}
