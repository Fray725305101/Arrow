package Arrow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String arrowRight = ">>-->";
        String arrowLeft = "<--<<";

        Scanner scanner = new Scanner(System.in);
        Comparing comparing = new Comparing();

        System.out.print("Enter your string with arrows: ");
        String inputString = scanner.nextLine();

        int countRightArrows = comparing.countArrows(arrowRight, inputString);
        int countLeftArrows = comparing.countArrows(arrowLeft, inputString);
        int sum = countRightArrows+countLeftArrows;

        System.out.println("Right Arrows: "+countRightArrows+", Left Arrows: "+countLeftArrows+", Sum: "+sum);
    }
}
