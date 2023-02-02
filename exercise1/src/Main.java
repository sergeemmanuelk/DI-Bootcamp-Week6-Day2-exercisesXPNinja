import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Time Taken by Worker :");
        int timeTaken = sc.nextInt();

        if (timeTaken >= 2 && timeTaken < 3) {
            System.out.println("Highly Efficient");
        } else if (timeTaken >= 3 && timeTaken < 4) {
            System.out.println("Needs to Improve Speed");
        } else if (timeTaken >= 4 && timeTaken < 5) {
            System.out.println("Needs Training to Improve Speed");
        } else if (timeTaken >= 5) {
            System.out.println("Worker Has to Leave the Company");
        }
    }
}