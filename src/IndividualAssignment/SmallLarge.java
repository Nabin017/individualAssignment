package IndividualAssignment;




import java.util.Scanner;

public class SmallLarge{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int first = sc.nextInt();
        System.out.println("Enter the second number");
        int second = sc.nextInt();


        if (first > second) {
            System.out.println("First is greater among the entered number");
        } else {
            System.out.println("Second is greater among the entered number");
        }

        if (first == second) {
            return;
        }
    }
}

