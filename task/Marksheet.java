import java.util.Scanner;
public class Marksheet {
    // Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] arr = new int[5];
        int sum = 0;
        float avg;
        System.out.println("Enter 5 subject marks");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println("Total:" + sum);
        avg = sum / 5.0f;
        System.out.println("Average:" + avg);

        if (avg >= 90 && avg <= 100) {
            System.out.println("Grade:A");
            System.out.println("Result:Pass");
        } else if (avg >= 80 && avg <= 89) {
            System.out.println("Grade:B");
            System.out.println("Result:Pass");
        } else if (avg >= 70 && avg <= 79) {
            System.out.println("Grade:C");
            System.out.println("Result:Pass");
        } else if (avg >= 60 && avg <= 69) {
            System.out.println("Grade:D");
            System.out.println("Result:Pass");
        } else if (avg <= 60) {
            System.out.println("Grade:F");
            System.out.println("Result:Fail");
        }

    }
}
