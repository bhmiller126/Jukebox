import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		String star = "*";
		Scanner scan = new Scanner(System.in);
		int lines = scan.nextInt();
		for (int i = 0; i < lines; i++) {
			System.out.println(star);
			star = star + "*";
		}
	}
}

// TODO Auto-generated method stub

