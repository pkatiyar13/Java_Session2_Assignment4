import java.util.*;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program Using Switch Case Statement
		System.out.println("Please Enter Month (e.g. January, March etc):");
		Scanner scan = new Scanner(System.in);
		String month = scan.nextLine();
		switch(month){
		case "January":
			System.out.println("Total Number of days in January are 31");
			break;
		case "February":
			System.out.println("Total Number Days in February are 28 or 29");
			break;
		case "March":
			System.out.println("Total Number of days in March are 31");
			break;
		case "April":
			System.out.println("Total Number of days in April are 30");
			break;
		case "May":
			System.out.println("Total Number of days in May are 31");
			break;
		case "June":
			System.out.println("Total Number of days in June are 30");
			break;
		case "July":
			System.out.println("Total Number of days in July are 31");
			break;
		case "August":
			System.out.println("Total Number of days in August are 31");
			break;
		case "September":
			System.out.println("Total Number of days in September are 30");
			break;
		case "October":
			System.out.println("Total Number of days in October are 31");
			break;
		case "November":
			System.out.println("Total Number of days in November are 30");
			break;
		case "December":
			System.out.println("Total Number of days in December are 31");
			break;
		default:
			System.out.println("Did not recognize the input, try again.");
		}
		
	}

}
