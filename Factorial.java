import java.util.Scanner;

public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number

	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println(fac(n));

	}

	public static int fac (int n){

		int result;

		if(n < 1){
			
			return 1;

		}else {

			result = n * fac(n-1);

			return result;
		
		}		

	}

}
