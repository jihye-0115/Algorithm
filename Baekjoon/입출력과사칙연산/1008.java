//#1_5 1008번
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double A,B;//float(4byte),double(8byte)로 double이 더 정밀하게 표현 가능
		
		A = in.nextInt();
		B = in.nextInt();
	
		System.out.println(A/B);
	}
}
