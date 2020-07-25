import java.io.IOException;
import java.util.Scanner;

public class InterestCalulation {
    private float p, r, t, interest, totalAmount;
    
    InterestCalulation() {
        p = r = t = interest = totalAmount = 0;
    }
    
    public void calculate() throws IOException {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        Interestcalculator ic = new Interestcalculator();
        
        while (true) {
            System.out.write("\nEnter Principal, Rate & TimePeriod(in years):\t".getBytes());
            p = scan.nextFloat(); r = scan.nextFloat(); t = scan.nextFloat();
            
            System.out.write("\t**** CHOOSE SI/CI ****\n".getBytes());
            System.out.write("1) Calculate Simple Interest\n".getBytes());
            System.out.write("2) Calculate Compound Interest\n".getBytes());
            System.out.write("3) Exit from this process\n".getBytes());
            System.out.write("Enter Your Choice\n".getBytes());
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    //interest = ic.simpleInterest(p, r, t);
                    System.out.write(("The SI of principal Rs. " + p + " @" + r + "% for " + t + " years is Rs." + ic.simpleInterest(p, r, t)).getBytes());
                    totalAmount = p + interest;
                    System.out.write(("\nThe totalAmount must be paid is Rs." + totalAmount).getBytes());
                    break;
                case 2:
                    //interest = ic.compoundInterest(p, r, t);
                    System.out.write(("The CI of principal Rs. " + p + " @" + r + "% for " + t + " years is Rs." + ic.compoundInterest(p, r, t)).getBytes());
                    totalAmount = p + interest;
                    System.out.write(("\nThe totalAmount must be paid is Rs." + totalAmount).getBytes());
                    break;
                case 3:
                	System.out.write(("ThankYou For Your Uses of Our Program.").getBytes());
                	System.exit(0);
                    break;
                default:
                    System.out.write("Wrong Choice!!!".getBytes());
            }
        }
    }
}
