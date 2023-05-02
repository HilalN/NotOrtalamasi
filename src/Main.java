import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, chemistry, turkish, history, music;  //define lesson variables
        Scanner input = new Scanner(System.in);  //create Scanner object

        //get grades from the user
        System.out.println("Enter your math grade: ");
        math = input.nextInt();

        System.out.println("Enter your physics grade: ");
        physics = input.nextInt();

        System.out.println("Enter your chemistry grade: ");
        chemistry = input.nextInt();

        System.out.println("Enter your turkish grade: ");
        turkish = input.nextInt();

        System.out.println("Enter your history grade: ");
        history = input.nextInt();

        System.out.println("Enter your music grade: ");
        music = input.nextInt();

        //do the calculations
        int total = math + physics + chemistry + turkish + history + music;
        double average = total / 6.0;
        String conclusion = (average >= 60) ? "Sınıfı geçti." : "Sınıfta Kaldı.";

        //print the conclusions
        System.out.println("Average: " + average);
        System.out.println(conclusion);
    }
}