import java.util.Scanner;
import java.util.ArrayList; 


public class PaintComparison {

	public static void main(String[] args) {

		Paint cheapomaxPaint = new Paint ("Cheapomax", "19.99", 11, 20, 220); 
		Paint averagejoesPaint = new Paint ("Average Joes", "19.99", 14, 15,  210); 
		Paint duluxourousPaint = new Paint ("Duluxourous Paint", "19.99", 17, 10, 170); 
		
		ArrayList <Paint> myPaints = new ArrayList<Paint>(); 
		myPaints.add(cheapomaxPaint); 
		myPaints.add(averagejoesPaint); 
		myPaints.add(duluxourousPaint); 
		
		Scanner userinput = new Scanner(System.in);
		System.out
				.println("What is the length of the room you would like to paint in square metres?");
		int roomLength = userinput.nextInt();
		System.out
				.println("What is the width of the room you would like to paint? in square metres");
		int roomWidth = userinput.nextInt();
		System.out
				.println("Please state how much of the room is occupied by windows/ceilings you don't want to paint in square metres");
		int roomWindows = userinput.nextInt();
// calculation to see what the room area would be from user inputs
		int firstArea = (roomLength * roomWidth);
		int roomArea = (firstArea - roomWindows);
		System.out.println("Your room area is " + roomArea + " square metres");
		// for loop using array list to compare all the paints and give the customer the best option 
		
		Paint compPaint; 
		for (int i = 0; i <myPaints.size(); i++){
			compPaint = myPaints.get(i);
			int tins = (int)compPaint.calculate(roomArea); 
			double totalAreaPossible = tins*compPaint.getCoveragePerTin(); 
			double left = (totalAreaPossible - roomArea)/compPaint.getCoveragePerTin(); 
		System.out.println((   " will need " + tins + " tins of paint" + " leftover: " + left + "L "));
			
			}
		}
	}


 


 



