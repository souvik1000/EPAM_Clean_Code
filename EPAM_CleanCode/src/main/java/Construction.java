import java.io.IOException;
import java.util.Scanner;

public class Construction {
	private int stdCost,aboveStdCost,highStdCost,highStdFullyAutoCost;
    private float area;
    private int choice;
    Construction() {
        area = 0;
        stdCost = 1200;
        aboveStdCost = 1500;
        highStdCost = 1800;
        highStdFullyAutoCost = 2500;
    }

    public void calculate() throws IOException {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        while (true) {
        	System.out.write("\nEnter area of house: (in sqr feet)\t".getBytes());
            area = scan.nextFloat();
            System.out.write("\t**** Standard Material ****\n".getBytes());
            System.out.write("1) Standard Material Rs.1200/sqft\n".getBytes());
            System.out.write("2) Above Standard Material Rs.1500/sqft\n".getBytes());
            System.out.write("3) High Standard Material Rs.1800/sqft\n".getBytes());
            System.out.write("4) High Standard Material and Fully Automated Rs.2500/sqft\n".getBytes());
            System.out.write("5) Exit from this process\n".getBytes());
            System.out.write("Enter Your Choice\n".getBytes());
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.write(("The total cost of Standard Material for " + area + "/sqft house of area is Rs." + (area*stdCost)).getBytes());
                    break;
                case 2:
                    System.out.write(("The total cost of above Standard Material for " + area + "/sqft house of area is Rs." + (area*aboveStdCost)).getBytes());
                    break;
                case 3:
                    System.out.write(("The total cost of High Standard Material for " + area + "/sqft house of area is Rs." + (area*highStdCost)).getBytes());
                    break;
                case 4:
                    System.out.write(("The total cost of High Standard Material and Fully Automated for " + area + "/sqft house of area is Rs." + (area*highStdFullyAutoCost)).getBytes());
                    break;
                case 5:
                	System.out.write(("ThankYou For Your Uses of Our Program.").getBytes());
                    System.exit(0);
                    break;
                default:
                    System.out.write("Wrong Choice!!!".getBytes());
            }
        }

    }
}
