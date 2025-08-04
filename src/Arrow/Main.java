package Arrow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Здесь всё понятно, комментировать нечего

        String arrowRight = ">>-->";
        String arrowLeft = "<--<<";

        Scanner scanner = new Scanner(System.in);
        Comparing comparing = new Comparing();

        System.out.print("Enter your string with arrows: ");
        String inputString = scanner.nextLine();

        if (inputString.length() <= 106) {
            int countRightArrows = comparing.countArrows(arrowRight, inputString);
            int countLeftArrows = comparing.countArrows(arrowLeft, inputString);
            int sum = countRightArrows + countLeftArrows;
            System.out.println("Right Arrows: " + countRightArrows + ", Left Arrows: " + countLeftArrows + ", Sum: " + sum);
        } else {
            System.out.println("По условию задачи строка должна содержать до 106 символов");
        }
    }
}
