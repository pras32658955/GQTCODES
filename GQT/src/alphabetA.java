import java.util.Scanner;
public class alphabetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		for(int row = 0;row < n; row ++) {
			for(int col = 0; col < n; col ++) {
				if((row==0 && col <= n/2) || col == 0 || col == n/2 || (row == n/2 && col <= n/2)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
