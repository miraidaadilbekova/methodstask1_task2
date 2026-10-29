import java.util.Scanner;

public class Main{
    public static String calculateGrade(int score) {
      if (score < 0 || score > 100) {
          return "Invalid score. Score must be between 0 and 100.";

      }
      if (score >= 90){
          return "A";
      } else if (score >= 80) {
          return "B";
      } else if (score >= 70) {
          return "C";
      } else if (score >= 60) {
          return "D";
      } else {
          return "F";
      }

    }
    public static void main(String[] args) {
        int testScore = 97;
        System.out.println("Score: " + testScore + "---> Grade: " + calculateGrade(testScore));
    }
}





import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the pattern: ");
        int rows = scanner.nextInt();
        System.out.println("Choose the pattern type of your choice: ");
        System.out.println("-> Right Triangle");
        System.out.println("-> Inverted Right Triangle");
        System.out.println("-> Pyramid");
        System.out.println("-> Inverted Pyramid");
        System.out.println("-> Another Example of a Pattern");
        System.out.println("Your choice(1-5): ");
        int choice = scanner.nextInt();

        System.out.println("Results: ");
        generatePattern(rows, choice);
        scanner.close();
    }
    public static void generatePattern(int rows, int choice) {
        switch (choice) {
            case 1:
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 4:
                for (int i = rows; i >= 1; i--) {
                    for (int j = 0; j < rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 5:
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = rows - 1; i >= 1; i--) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid. Choose from 1 to 5.");
                break;


        }
    }
}