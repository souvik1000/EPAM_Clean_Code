import java.util.*;
import java.util.Scanner;
import java.io.IOException;

@SuppressWarnings("unused")
public class MainClass {
    public static void main(String args[]) throws IOException {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.write("\nEnter 1 to calculating the constructionCost".getBytes());
        System.out.write("\nEnter 2 for calculating Interest".getBytes());
        System.out.write("\nEnter 3 to exit\n".getBytes());
        System.out.write("Enter Your Choice\n".getBytes());
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
            	Construction construction = new Construction();
                construction.calculate();
                break;
            case 2:
                InterestCalulation interest = new InterestCalulation();
                interest.calculate();
                break;
            case 3:
            	System.out.write(("ThankYou For Your Uses of Our Program.").getBytes());
                System.exit(0);
            default:
                System.out.write("Wrong Choice!!!".getBytes());
        }
    }
}
